import java.util.*;
public class A{
     public static void main(String []args){
      Scanner sc= new Scanner(System.in); 
    System.out.print("Please enter the input currency type as one of : INR,US,CAN : ");String curr1= sc.nextLine();   //Reading the 1st curreny type
	System.out.print("Please enter the output currency type as one of : INR,US,CAN : ");String curr2= sc.nextLine();   //Reading the 2nd curreny type
    System.out.print("Enter input curreny amount : ");double InAmount= sc.nextDouble();   //Reading the 1st curreny type
   
	double output= (InAmount*getEquivalentBaseAmount(curr2))/getEquivalentBaseAmount(curr1);
	System.out.print("The final amount is : "+output);
     }
	 
	 //method return the values equivalent to IUSD in each of other currencies
	 static double getEquivalentBaseAmount(String CurrencyType){
		 double ret;
		switch(CurrencyType){	/*1US $ = 75.47INR = 1.28Canadian $*/
			case "INR": ret=75.47;break;
			case "US": ret=1;break;
			case "CAN": ret=1.28;break;
			default: ret=1;
		}
		return ret;
	 }
}