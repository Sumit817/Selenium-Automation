package assignments;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SumitAssignmentCalculator_N_number {

	public static void main(String[] Args) {
		SumitAssignmentCalculator_N_number obj = new SumitAssignmentCalculator_N_number();
		Scanner ScanA = new Scanner(System.in);
		System.out.println("Please enter all the numbers seperated by comma which you would like to add or multiply");
		String calc = ScanA.nextLine();
		System.out.println("Please specify if you would like to add or subtract or multiply the number");
		String operation = ScanA.nextLine();
		String[] numbers = calc.split(",");
		int a = numbers.length;
		ScanA.close();
		int sum1 = 0;
		int sum2 = 0;
		switch (operation) {
		case "add":
			for (int i5 = 0; i5 < a; i5++) {
				String sum = (String) Array.get(numbers, i5);
				sum1 = Integer.parseInt(sum);
				sum2 = sum2 + sum1;
			}
			System.out.println("Addition of number is: " + sum2);
			break;
		case "multiply":
			obj.multiple(numbers);
			break;
		default:
			System.out.println("You have not selected a valid operation");
			break;
		}
}

	public int multiple(String[] mul5) {
		int i7 = mul5.length;
		int i8;
		int i9 = 1;
		for (int i6 = 0; i6 < i7; i6++) {
			String sum6 = (String) Array.get(mul5, i6);
			i8 = Integer.parseInt(sum6);
			i9 = i9 * i8;
		}
		System.out.println("Multiplication value is :" + i9);
		return i9;
	}
}