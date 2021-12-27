-- tạo database tên QLBanSach
create database if not exists QLBanSach;
use QLBanSach;
-- tạo các bảng trong db

create table if not exists khach_hang(
ma_khach_hang int not null,
ho_ten varchar(30) not null,
tai_khoan varchar(30) not null,
mat_khau varchar(30) not null,
email varchar(30),
dia_chi varchar(255) not null,
dien_thoai varchar(30),
gioi_tinh varchar(10),
ngay_sinh date not null,
primary key(ma_khach_hang)
);

create table if not exists don_hang(
ma_don_hang int not null,
ngay_dat date not null,
ngay_giao date not null,
da_thanh_toan boolean default 0,
tinh_trang_giao_hang varchar(30),
ma_khach_hang int not null,
primary key (ma_don_hang)
);

create table if not exists chu_de(
ma_chu_de int not null,
ten_chu_de varchar(255) not null,
primary key(ma_chu_de)
);

create table if not exists sach(
ma_sach int not null,
ten_sach varchar(255) not null,
mo_ta varchar(255) not null,
gia_ban float not null default 0,
anh_bia binary(255),
ngay_cap_nhat date,
so_luong_ton int,
ma_chu_de int not null,
ma_nha_xuat_ban int not null,
primary key (ma_sach)
);

create table if not exists nha_xuat_ban(
ma_nsx int not null,
ten_nxb varchar(255) not null,
dien_thoai varchar(255) not null,
dia_chi varchar(255) not null,
primary key (ma_nsx)
);

create table if not exists tac_gia(
ma_tac_gia int not null,
ten_tac_gia varchar(255) not null,
dia_chi varchar(255) not null,
tieu_su varchar(255),
dien_thoai varchar(255),
primary key (ma_tac_gia)
);

create table if not exists chi_tiet_don_hang(
ma_don_hang int not null,
ma_sach int not null,
so_luong int not null,
don_gia float not null default 0,
primary key (ma_don_hang,ma_sach)
);

create table if not exists chi_tiet_tac_gia(
ma_tac_gia int not null,
ma_sach int not null,
vai_tro varchar(255) not null,
vi_tri varchar(255) not null,
primary key (ma_tac_gia,ma_sach)
);
alter table don_hang
add constraint fk_don_hang_khach_hang
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang);

alter table sach
add constraint fk_sach_chu_de
foreign key (ma_chu_de) references chu_de(ma_chu_de);
alter table sach
add constraint fk_sach_nha_xuat_ban
foreign key (ma_nha_xuat_ban) references nha_xuat_ban(ma_nsx);

alter table chi_tiet_don_hang
add constraint fk_chi_tiet_don_hang_don_hang
foreign key (ma_don_hang) references don_hang(ma_don_hang);
alter table chi_tiet_don_hang
add constraint fk_chi_tiet_don_hang_sach
foreign key (ma_sach) references sach(ma_sach);

alter table chi_tiet_tac_gia
add constraint fk_chi_tiet_tac_gia_tac_gia
foreign key (ma_tac_gia) references tac_gia(ma_tac_gia);
alter table chi_tiet_tac_gia
add constraint fk_chi_tiet_tac_gia_sach
foreign key (ma_sach) references sach(ma_sach);



















