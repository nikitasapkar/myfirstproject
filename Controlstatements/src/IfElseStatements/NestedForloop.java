package IfElseStatements;

public class NestedForloop {

	public static void main(String[] args) {
		// If we have a for loop inside the another loop, it is known as nested for loop. 
		//The inner loop executes completely whenever outer loop executes.
		
    for(int i=1;i<=5;i++) {
    	for(int j=1;j<=5-i;j++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }
	}

}
