package exercise_JavaCore;
import java.util.Random;
import java.util.Scanner;
public class Bai17 {
	
	public static int getRandomNumber() {
		Random rd = new Random();
		int randomNumber = rd.nextInt(1000) + 1;
		return randomNumber;
	}
	public static void print(int number, int randomNumber) {
		if (number > randomNumber) {
			System.out.println("Your number is higher");
	    } else if (number < randomNumber) {
	        System.out.println("Your number is lower");
	    } else {
	        System.out.println("You win!!");
	    }
	}
	public static int getNumberGuess() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number between 1 and 1000: ");
		number = sc.nextInt();
		return number;
		
	}
	public static void play() {
		 int randomNumber = getRandomNumber();
		    int number;

		    do {
		        number = getNumberGuess();
		        print(number, randomNumber);
		    } while (number != randomNumber);
	}
	public static void main(String[] args) {
	  play();
	}
}
