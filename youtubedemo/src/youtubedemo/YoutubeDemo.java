package youtubedemo;

import java.util.Scanner;

public class YoutubeDemo {
	public static void main(String[] str) {

		// NOTES:
		// To avoid repeating System.out.println();
		// just write sysout+ctrl+space then will complete a command for us
		// To replace a mistaken word go to edit then find/replace
		// To zoom out press on ctrl+
		// To zoom in press on ctrl-
		// If one of the windows display disapair go to the top you'll see windows then
		// everything is listed there

		int x = 123; // THIS IS CALLED INITIALIZATION
		int y; // THIS IS CALLED DECLERATION
		y = 10; // THIS IS CALLED ASSIGNMENT

		float a = 12.5f;// THIS IS MUST BE ENDED WITH f or F it doesn't matter
		double b = 15.65;// HERE WE DON'T HAVE TO ADD ANYTHING AT THE END

		// HOW TO SWAP TO VARIABLE
		String s = "Water";
		String c = "Big red";

		// CREATE VARIABLE FOR SWITCHING
		String temp;
		temp = s;
		s = c;
		c = temp;

		// TAKE AN INPUT FROM THE USER
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name; // DECLERATION THEN INITIALIZATION OR BOTH TOGETHER
		name = sc.nextLine();// nextLine() function is to read more than one word
		System.out.println("Enter your age? ");
		int age = sc.nextInt();
		System.out.println("What is your favorite food? ");
		sc.nextLine(); // WE HAVE TO USE THIS COMMAND after int if the next will be sting
						// TO BE ABALE TO READ NEXT STRING
						// THIS IS IS LIKE CIN.IGNORE IN C++
		String food = sc.nextLine();
		System.out.println("Your name is:" + name);
		System.out.println("Your age is:" + age);
		System.out.println("Your favorite food is:" + food);
		sc.close();

	}

}
