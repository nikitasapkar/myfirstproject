package IfElseStatements;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int i=2;i<=10;i++) {
	   
	   boolean primenumber=true;
	   for(int j=2;j<i;j++) {
		   if(i%j==0) {
			   primenumber=false;
			   
		   }
	   }
	   if(primenumber) {
		   
	   
	  System.out.println(i+""); 
   }
	}
	}}
