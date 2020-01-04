/*
 * 
 * @Sumit - Java class to add or subtract 2 numbers
 */

package assignment2;
import java.util.Scanner;
import java.util.*


public class Operators {

	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = scan2.nextInt();
		System.out.println("Please enter the second number");
		int num2 = scan2.nextInt();
		
		Operators.add1(num1, num2);
		scan2.close();
	}
	public static void add1(int num3, int num4) {
		int sum = num3 + num4;
		System.out.println("Sum of two number is: "+ sum);
		
		
	}
	
	
}
