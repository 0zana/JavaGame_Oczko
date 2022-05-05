package game;

import java.util.Random;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		do {
			Random random = new Random();
			int random_num = random.nextInt(41);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Your first guess = ");
			int guess = scanner.nextInt();
			int counter = 1;
			if (guess!=random_num) {
				counter++;
				do {
					biggerSmaller(guess, random_num);
					System.out.println("Next guess = ");
					guess = scanner.nextInt();
					counter++;
				} while (guess!=random_num);
				System.out.println("Guesses: " + counter);
				howManyTimes(counter);
			}
			else {
				System.out.println("Guesses: " + counter);
				howManyTimes(counter);
			}
	}while(doYou());
	}
	public static void biggerSmaller(int guess, int random_num) {
		if (guess<random_num) {
			System.out.println("Your guess is too small!");
		} else if (guess>random_num) {
			System.out.println("Your guess is too big!");
		} else {
			System.out.println("Great job!");
		}
	}
	public static void howManyTimes(int counter) {
		if (counter==1) {
			System.out.println("Wow! It took only one shot to guess!");
		} else if (counter==2) {
			System.out.println("Good! It took only two times to guess!");
		} else {
			System.out.println("It could be better!");
		}
	}
	public static boolean doYou() {
		boolean answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to play again? (true/false)");
		answer = sc.nextBoolean();
		if (answer==true) {
			return(true);
		} else {
			return (false);
		}
	}



	

}
