package IfElseStatements;

public class NestedSwitch {

	public static void main(String[] args) {
		// Java Program to demonstrate the use of Java Nested Switch
		char branch='E';
		int year=4;
		switch(year){
		case 1:
			System.out.println("English,Maths,Science");
			break;
		case 2:
			switch(branch) {
			case 'C':
				System.out.println("Computer Organization, MultiMedia");
				break;
			case 'E':
				System.out.println("PED,DEM");
				break;
			case 'M':
				System.out.println("nternal Combustion Engines, Mechanical Vibration");
				break;
			}
			break;
			
		case 3:
			switch(branch) {
			case 'C':
				System.out.println("Data Communication and Networks, MultiMedia");
				break;
			case 'E':
				System.out.println("PSOC,EHV");
				break;
			case 'M':
				System.out.println("Production Technology, Thermal Engineering");
				break;
			}
			break;
		case 4:
			switch(branch) {
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'E':
				System.out.println("NA,ADE,MS");
				break;
			case 'M':
				System.out.println("DEM,MOS,SOM");
				break;
			
		}
break;
	}

}
}
