package Practices_program;

public class Ques6 {

		int rollno;
		String name;
		static String collage = "ITS";  //static variables
		
		Ques6(int r,String n){
		rollno=r;
		name=n;
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+collage);}
				
public static class StaticVariable{   //static blocks
	public static void main(String[] args) {
		Ques6 s1=new Ques6(11,"Ram");
		Ques6 s2=new Ques6(12,"Ravan");
		s1.display();
		s2.display();
	}
}
}