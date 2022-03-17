package IfElseStatements;

public class SwitchStatements {

	public static void main(String[] args) {
		// here we are printing month name for the given number
    int month=5;
    String monthString="";
    switch (month) {
    case 1:monthString ="1- Jan";
    break;
    case 2:monthString="2-Feb";
    break;
    case 3:monthString="3-March";
    break;
    case 4:monthString="4-April";
    break;
    case 5:monthString="5- May";
    break;
    case 6:monthString="6-June";
    break;
    case 7:monthString="7-July";
    break;
    case 8:monthString="8-August";
    break;
    case 9:monthString="9-sept";
    break;
    case 10:monthString="10-october";
    break;
    case 11:monthString="11-nov";
    break;
    case 12:monthString="12-Dec";
    break;
    default: System.out.println("invalid month");
    }
	System.out.println(monthString);	
		
		
	}

}
