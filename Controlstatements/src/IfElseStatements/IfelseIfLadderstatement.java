package IfElseStatements;

public class IfelseIfLadderstatement {

	public static void main(String[] args) {
		// this executes one condition from multiple statements
		int marks=65;
		if (marks<50) {
			System.out.println("Fail");
		}
		else if(marks>=50&& marks<60) {
			System.out.println("Grade D");
		}
		else if(marks>=60&& marks<70) {
			System.out.println("Grade B");
		}
		else if (marks>=70&& marks<80) {
			System.out.println("Grade A");
		}
		else if(marks>=80&& marks<100) {
			System.out.println("Grade A+");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
