package exercise_JavaCore;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vị trí của kangaroo thứ nhất: ");
		double x1 = sc.nextDouble();
		System.out.println("Nhập vận tốc của kangaroo thứ nhất: ");
		double v1 = sc.nextDouble();
		System.out.println("Nhập vị trí của kangaroo thứ hai: ");
		double x2 = sc.nextDouble();
		System.out.println("Nhập vận tốc của kangaroo thứ hai: ");
		double v2 = sc.nextDouble();
		int ans=0;
	    if(x1>x2)
	        {
	        if(v1<v2)
	        {
	            while(x1>x2)
	            {
	            x1+=v1;
	            x2+=v2;
	            if(x1==x2)
	                ans=1;
	        }
	        }
	    }
	    else if(x2>x1)
	        {
	        if(v2<v1)
	        {
	            while(x2>x1)
	            {
	            x1+=v1;
	            x2+=v2;
	            if(x1==x2)
	                ans=1;
	        }
	        }
	    }
	    else 
	        ans=1;
	    if(ans == 1) {
	    	System.out.println("Gặp được nhau");
	    }else {
	    	System.out.println("Không gặp được nhau");
	    }
	}
}
