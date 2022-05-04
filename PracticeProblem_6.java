package Practices_program;

import java.util.Scanner;

public class PracticeProblem_6 {

	public void ArrayBasic() {
		String choco1 = "cadbery";
		String choco2 = "Nestle";
		String choco3 = "Lindt";
		String choco4 = "Mars";
		String choco5 = "Amul";
		String choco6 = "Ferrero Rocher";
		String choco7 = "Hershey";
		
		String[] chocos = new String[] {"Cadbury","Nestle","Lindt","Mars","Amul","Ferrero Rocher","Hershey"};
		System.out.println(chocos[5]);
		
	for(int i=0; i<chocos.length; i++) {
		System.out.println(chocos[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		int chocos1=sc.nextInt();
		int chocos2=sc.nextInt();
		int chocos3=sc.nextInt();
		int chocos4=sc.nextInt();
		int chocos5=sc.nextInt();
		int chocos6=sc.nextInt();
		int chocos7=sc.nextInt();
	PracticeProblem_6 ab = new PracticeProblem_6();
		(ab).ArrayBasic();

		
	}

}
