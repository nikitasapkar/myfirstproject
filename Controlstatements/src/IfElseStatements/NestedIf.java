package IfElseStatements;

public class NestedIf {

	public static void main(String[] args) {
		// The nested if statement represents the if block within another if block. Here,
		//the inner if block condition executes only when outer if block condition is true
     int age=20;
    int weight=40;
     if(age>=18) {
    	 if(weight>50) {
    		 System.out.println("elligible to donate the blood");
    	 }else {
    		 System.out.println("not ellibible to doante the blood");
    	 }
     }
	}

}
