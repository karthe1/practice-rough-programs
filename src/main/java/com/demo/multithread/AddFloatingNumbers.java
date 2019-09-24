package com.demo.multithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*class Result {

    
     * Complete the 'addNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. FLOAT a
     *  2. FLOAT b
     

    public static int addNumbers(float a, float b) {
    // Write your code here
    	float sum = a + b;
    	int result = (int)(a+b);
    	String s = String.valueOf(sum);
    	String s1 = s.substring(s.indexOf("."));
    	s1 = s1.substring(1);
    	if(Integer.parseInt(s1.substring(0, 1))>5) {
    		result++;
    	}
    	return result;
    }

}*/

class Result {

    /*
     * Complete the 'addNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. FLOAT a
     *  2. FLOAT b
     */
	enum NumberHoles {
		ZERO("STOP"), ONE("0"), TWO("8"); 
		  
	    // declaring private variable for getting values 
	    private String action; 
	  
	    // getter method 
	    public String getAction() 
	    { 
	        return this.action; 
	    } 
	  
	    // enum constructor - cannot be public or protected 
	    private NumberHoles(String action) 
	    { 
	        this.action = action; 
	    } 
	}

	public static int countHoles(int number) {
		// Write your code here
		int numberOfZeros = 0;
		String stringValue = String.valueOf(number);
		char arr[] = stringValue.toCharArray();
		for (char c : arr) {
			if(c == '0' || c == '4' || c == '6' || c == '9') {
				numberOfZeros = numberOfZeros + 1;
			} else if(c == '8') {
				numberOfZeros = numberOfZeros + 2;
			}
		}
		
		return numberOfZeros;
	}

}

public class AddFloatingNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countHoles(number);
          System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
          

          
        bufferedReader.close();
//        bufferedWriter.close();
	}

}
