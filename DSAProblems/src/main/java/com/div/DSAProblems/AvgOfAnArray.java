package com.div.DSAProblems;

import java.util.Scanner;

public class AvgOfAnArray {

	static int arrSize;	
	
	public static void main(String[] args) {
		// Get an input array
		System.out.println("Enter the no. of elements for an array");
		
		Scanner sc = new Scanner(System.in);
		arrSize = sc.nextInt();
		
		int arrInput[] = new int[arrSize];
		
		// accept the values for an array
		for(int i=0; i<arrSize; i++) {
			System.out.println("enter "+i+"th element");
			arrInput[i] = sc.nextInt();
		}
		
		double avg = calculateAverage(arrInput);
		System.out.println("Average - "+ avg);
	}

	private static double calculateAverage(int arrInput[]) {
		double totOfAllElements=0;
		// Loop on arrInput[] and get the addition
		for(int i=0; i<arrSize; i++) {
			totOfAllElements = totOfAllElements + arrInput[i];
		}
		return totOfAllElements/arrSize;
	}

}
