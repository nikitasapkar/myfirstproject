package IfElseStatements;
import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
		int num=153;
		int check,rem,sum=0;
		System.out.println("Enter the number to be verified");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		check=num;
		while(check!=0) {
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
			
		}
		if(sum==num)
			System.out.println("Given number is armstrong");
		else
			System.out.println("number is not armstrong");
		

	}

}
