package com.demo.multithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Result1 {

	static ArrayList<String> a = new ArrayList<String>();
    /*
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int countPalindromes(String s) {
    	// Write your code here
    	for (int i = 0; i < s.length(); i++) {
    		String s1 = "";
    		String s2 = new String(s.substring(i));
    		a.add(new String(s2.substring(0, 1)));
    		char a[] = s2.toCharArray();
    		for (int j = 0; j < a.length; j++) {
        		if((j==0) && (a.length>1)) {
        			s1 = s1 + a[j] + "" + a[j+1];
        			checkPalindrome(s1);
        		} else if((j!=0) && (j!=a.length-1)){
        			s1 = s1 + a[j+1];
        			checkPalindrome(s1);
        		}
    		}
		}
    	return a.size();
    }
    
    static void checkPalindrome(String s) {
    	
    	StringBuffer sb = new StringBuffer(s);
    	sb.reverse();
    	if(s.contentEquals(sb)) {
    		a.add(s);
    	}
    }

}

public class Possiblepalindromes {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result1.countPalindromes(s);
        	System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
