package com.practice;

import java.util.Scanner;

public class ProblemSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer A : ");
		int a = s.nextInt();
		System.out.println("Enter the integer A : ");
		int b = s.nextInt();
		System.out.println("Execution begins...");
		System.out.println("Output value is " + solution(a, b));
	}

	private static String solution(int a, int b) {

		String output = "";
		for(int i=1; i<=a; i++) {
			output = output + 'a';
		}
		
		for(int i=1; i<=b; i++) {
			output = output + 'b';
		}
		
		System.out.println("Actual String is " + output);
		
		char arr[] = output.toCharArray();
		char temp;
		boolean conditionSatised = false;
		do {
			
			for(int i=0; i < arr.length; i++) {
				if(i != arr.length-1) {
					if(arr[i] != arr[i+1]) {
						temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
						break;
					} else {
						continue;
					}
				}
			}
			
			output = new String(arr);
			
			if(!output.contains("aaa") && !output.contains("bbb")) {
				conditionSatised = true;
				break;
			}
			
			for(int j=arr.length-1; j >= 0; j--) {
				if(j != 0) {
					if(arr[j] != arr[j-1]) {
						temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
						break;
					} else {
						continue;
					}
				}
			}
			output = new String(arr);
			
			if(!output.contains("aaa") && !output.contains("bbb")) {
				conditionSatised = true;
				break;
			}
			
		} while (!conditionSatised);
			return output;
	}
	
}
