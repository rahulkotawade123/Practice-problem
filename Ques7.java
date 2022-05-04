package Practices_program;
/**
 * leap year
 * 
 */
import java.util.Scanner;
class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		System.out.println("Enter An Year::");
		Scanner sc= new Scanner(System.in);
		year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		System.out.println("leap year");
		else
		System.out.println("not a leap year");
	 
}
}