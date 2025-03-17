package com.div.DSAProblems;

import java.util.Scanner;

public class NextPrime {

	public static void main(String[] args) {
		// Get the number from the user
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// If the input is 0 then return 1. if 1 then return 2
		if(input == 0) {
			System.out.println(1);
			return;
		}
		if(input == 1) {
			System.out.println(2);
			return;
		}
		// Eg. if input is 3 then ++ will make it 4
		int nextNum = input+1;
		// Loop on number from 2 to the nextNum-1 -> eg. loop from 2 to 4 and check if it is divisible by 2-3 (1 less than input++)
		for(int i=2; i<nextNum; i++) {
			// 1st iteration i=2 -> 4(nextNum) is divisible by 2 so nextNum will be 5
			if(nextNum%i == 0) {
				nextNum++;
				// reset i to 2
			}
		}
		// Here We will get the final number which is next prime
		System.out.println(nextNum);
	}

}
