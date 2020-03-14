//Age 0-2:Print Infant
//Age 3-12:Print Child
//Age 13-25:Print Youth
//Age 26-59:Print Adult
//Age >59:Print Senior Citizen

//While loop
package corejava;

import java.util.Scanner;

public class Loop_assignment {

	public static void main(String[] args) {

		int age ;//= -0;
		
		//get the age from Console
		System.out.println("Please enter valid Age :   ");
		Scanner abc = new Scanner(System.in);
		age = abc.nextInt();

		if (age >= 0 && age <= 2) {
			System.out.println(age + ": comes under infant***");
		} else if (age > 2 && age <= 12) {
			System.out.println(age + ": comes under child***");
		} else if (age > 12 && age <= 25) {
			System.out.println(age + ": comes under youth***");
		} else if (age > 25 && age <= 59) {
			System.out.println(age + ": comes under Adult***");
		} else if (age > 59 && age <= 100) {
			System.out.println(age + ": comes under Sr.Citizen***");
		} else {
			System.out.println("Please enter valid input ******");
		}

	}
}
