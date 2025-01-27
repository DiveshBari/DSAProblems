package com.div.DSAProblems;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
You are given an array arr[]. Your task is to count the number of even and odd elements. Return first odd count then even count.
Examples: 

Input: arr = [2, 3, 4, 5, 6]
Output: 2 3 
Explanation: There are two odds[3, 5] and three even[2, 4, 6] present in the array.

Input: arr = [22, 32, 42, 52, 62]
Output: 0 5
Explanation: All the elements are even.

*/
public class CountOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int arrSize = sc.nextInt();
		
		int oddCount = 0, evenCount = 0;
		
		int arrInput[]= new int[arrSize];
		for(int i=0; i<arrSize; i++) {
			// In case the hardcoded array is given the loop should be on the hardcoded array
			// There is no need to keep th value in array but for now I am keeping it as it is.
			int arrIndValue = sc.nextInt();
			arrInput[i] = arrIndValue;
			
			// Check if the current no. is odd or even
			if(arrInput[i]%2==0) {
				evenCount = evenCount + 1;
			}
			else {
				oddCount = oddCount + 1;
			}
		}
		
		System.out.println(oddCount);
		System.out.println(evenCount);
	}

}
