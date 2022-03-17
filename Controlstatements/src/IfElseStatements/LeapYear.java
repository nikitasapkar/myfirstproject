package IfElseStatements;

public class LeapYear {

	public static void main(String[] args) {
		// program for leap year
     int year=2021;
     if(((year%4==0) && (year%100!=0))||(year%400==0)){
    	System.out.println("Leap year"); 
     }
	else {
		System.out.println("Common year");
	}

}
}