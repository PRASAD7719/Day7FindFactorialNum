/* fact 5!=5*4*3*2*1
 * 
 */
package main1;

import java.util.Scanner;

public class Day7FindFactorial {
	public static void main(String[] args) {
		
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num: ");
		int Num = sc.nextInt();
		
		for(int i=1;i<=Num;i++) {
			fact=fact*i;
		}
		
		System.out.println("Your Fact Num is: "+fact);
	}

}
