/*
 * SumitKumar - Read OTP using Charat function
 * 
 */

package assignments;

import java.util.Scanner;

public class SumitAssignmentOTPCharfn {

	public static void main(String[] args) {
		String OTP = "";
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter the string with OTP:");
		String sc2 = sc1.nextLine();
		System.out.println("What is the length of OTP?");
		int sc4 = sc1.nextInt();
		for (int sc3 = 0; sc3 < sc2.length(); sc3++) {
			if (sc2.charAt(sc3) >= '0' && sc2.charAt(sc3) <= '9') {
				OTP = (OTP) + sc2.charAt(sc3);
				if (OTP.length() == sc4) {
					break;
				}

			}

		}
		System.out.println("OTP for your transaction is: " + OTP);
		sc1.close();
	}

}
