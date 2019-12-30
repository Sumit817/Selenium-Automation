/*
 * 
 * @SumitKumar - Calculator with user Input
 */

package assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumitAssignmentCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num = scan.nextInt();
		System.out.println("Please enter the second number: ");
		int num1 = scan.nextInt();
		System.out.println("Would you like to perform addition, subtraction, multiplication or division: ");
		String ref3 = scan.next();
		SumitAssignmentCalculator ref2 = new SumitAssignmentCalculator();
		scan.close();
		if (ref3.equalsIgnoreCase("addition") == true) {
			ref2.add(num, num1);
		} else if (ref3.equalsIgnoreCase("subtraction") == true) {
			ref2.subtract(num, num1);
		} else if (ref3.equalsIgnoreCase("multiplication") == true) {
			ref2.multi(num, num1);
		} else if (ref3.equalsIgnoreCase("division") == true) {
			ref2.mod(num, num1);
		} else {
			System.out.println("Please select valid option between addition, subtraction, multiplication or division");
		}

	}

	public void add(double i3, double j3) {
		double sum = i3 + j3;
		System.out.println("Sum of two number is: " + sum);
	}

	public void subtract(double i4, double j4) {
		double minus = i4 - j4;
		System.out.println("Subtraction of number is: " + minus);
	}

	public void multi(double i5, double j5) {
		double mul = i5 * j5;
		System.out.println("Multiplication of both number is: " + mul);

	}

	public void mod(double i6, double j6) {
		double mod = i6 / j6;
		System.out.println("Division of number is: " + mod);
	}
}
