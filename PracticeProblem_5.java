package Practices_program;
import java.util.Scanner;
public class PracticeProblem_5 {

	public static void main(String[] args) {

		   try (Scanner in = new Scanner(System.in)) {
			System.out.println("Input Number:");
			int n=in.nextInt();
			int sum=0;
			int r=0;
			int num=n;
		    
			while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(num==sum)
				System.out.println("It is a palindrome number");
			else
				System.out.println("It is a not palindrome number");
		}

		}
	}


