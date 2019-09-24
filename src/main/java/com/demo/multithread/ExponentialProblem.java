package com.demo.multithread;

/*class ExponentialProblem {
	public static void main(String args[]) {
		System.out.println(args.length + " " + args[0]);
		int i, j;
		String a = "abc";
		a = a + a;
		System.out.println(a);
	}

	protected static class B extends ExponentialProblem {
		public static void main(String[] args) {
			System.out.println("Inner class...");
		}
	}
}*/

/*class ExponentialProblem {
	static int a;
	public static void main(String args[]) {
		System.out.println(a);
}
}*/

/*class ExponentialProblem {
	public void methodA(int i) {
		System.out.println(i);

	}

	public int methodA(int i) {
		System.out.println(i + 1);
		return i + 1;
	}

	public static void main(String args[]) {
		ExponentialProblem X = new ExponentialProblem();
		X.methodA(5);
	}
}*/
/*public class ExponentialProblem {
public static void main(String args[]) {
	byte x = 3;
		x = (byte)~x;
		System.out.println(x);
	}
}*/
/*public class ExponentialProblem {
	public static void main(String args[]) {
	int x,y;
	x = 3 & 5;
		y = 3 | 5;
		System.out.println(x + " " + y);
	}
}*/

/*public class ExponentialProblem { 
	   public static void main(String args[]) {
	      int x = 10, y;
	      if(x < 10) 
	         y = 1;
	      if(x>= 10) y = 2;
	      System.out.println("y is " + y);
	   }
	}*/

public class ExponentialProblem {
	
	protected ExponentialProblem() {
		System.out.println("Accessed Protected constructor!!!");
	}
	
}
