package main;

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
		Scanner scanner=new Scanner(System.in);
		double speed;
		double distance;
		double gravity=9.8;
		double t=scanner.nextDouble();
		speed=gravity*t;
		distance=0.5*gravity*t*t;
        System.out.println("The speed of the object at "+t+" seconds after its release is "+speed+" and the distance the object has travelled in the "+t+" seconds after the relase is "+distance+".");
        scanner.close();

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
