/*
 * 
 * @SumitKumar - TO read OTP from string when format is not known
 * 
 */

package assignments;

import java.util.Scanner;
import java.util.Arrays;

public class SumitAssignment_ReadOTPImproperFormat {

	public static void main(String[] args) {

		Scanner t1 = new Scanner(System.in);
		System.out.println("PLease enter complete string");
		String t2 = t1.nextLine();
		System.out.println("What is the lenght of OTP being generated?");
		int t3 = t1.nextInt();
		String[] t5 = t2.split("\\s+");
		System.out.println("Length: " + t5.length);
		System.out.println("items:" + Arrays.toString(t5));
		for (int t4 = 0; t4 < t5.length; t4++) {

		}
	}

}
