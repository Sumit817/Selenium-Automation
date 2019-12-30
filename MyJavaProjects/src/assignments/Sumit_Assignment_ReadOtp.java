/*
 * 
 * @SumitKumar - TO read OTP from string where message contains string "OTP is"
 * 
 */

package assignments;

import java.util.Scanner;

public class Sumit_Assignment_ReadOtp {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please input your string from where we need to read OTP");
		String s2 = s1.nextLine();
		System.out.println("What is the lenght of OTP ?");
		int s3 = s1.nextInt();
		int firstindex = s2.indexOf("OTP is");
		if(firstindex != -1){
		String OTP = s2.substring((firstindex + 7), (firstindex + 7 + s3));
		System.out.println("The OTP in your string is: " + OTP);
		}else{
			System.out.println("String format entered by you in Invalid");
		}
		s1.close();
	}
	
	

}
