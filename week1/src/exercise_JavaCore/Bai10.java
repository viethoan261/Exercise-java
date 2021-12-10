package exercise_JavaCore;
import java.util.Scanner;
public class Bai10 {
	public static boolean isPrime(int num) {
		int count = 0;
		if(num < 2) return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) count ++;
		}
		if(count == 0) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int sum = 0;
	    for(int i = 1; i <= number; i++) {
	    	if(isPrime(i)) {
	    		sum += i;
	    	}
	    }
		System.out.println("Sum primes: " + sum);
	}
	 
}
