package IfElseStatements;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10;
		for(int i=2;i<10;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
					
		}
		// TODO Auto-generated method stub

	}

}
