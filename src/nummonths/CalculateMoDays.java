package nummonths;

import java.util.Scanner;

public class CalculateMoDays {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int MonthNum;
	 	int numDays=0;
	 	boolean valid;
		String yes; 

	 do{
	 		do{
	 			System.out.println("Please enter the month: ");
	 			MonthNum = sc.nextInt();
	 			valid = MonthNum > 0 && MonthNum < 13;
	 			if (MonthNum == 2){
	 				numDays = 28;
	 			}else if (MonthNum == 1 || MonthNum == 3 || MonthNum == 5 || MonthNum == 7 || MonthNum == 8 
	                   || MonthNum == 10 || MonthNum == 12){
	 				numDays = 31;
	 			}else if(MonthNum == 4 || MonthNum == 6 || MonthNum == 9 || MonthNum == 11){
	 				numDays = 30; 
	 			}else if (!valid){
	 				System.out.println("ERROR!!! This is not valid month!!!.");
	 			}
	       }while (!valid);
	 	System.out.println("The number of days in month " + MonthNum + " is " + numDays + ".");
	 	System.out.println("Want to enter another month? (Y/N)");
	 	yes = sc.next();
	 }while (yes.equalsIgnoreCase("y"));	
  }
}	