import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//Student grade manager
		
		System.out.println("Enter subject 1 marks:");
		Scanner sc = new Scanner(System.in);
		
		int subject1 = sc.nextInt();
		System.out.println("Enter subject 2 marks:");
		int subject2 = sc.nextInt();
		System.out.println("Enter subject 3 marks:");
		int subject3 = sc.nextInt();
		
		int totalMarks = subject1+subject2+subject3;
		System.out.println("Total Marks:"+totalMarks);
		int average = (int)totalMarks/3;
		System.out.println("Average Marks:"+average);
		if (subject1 < 35 || subject2 < 35 || subject3 < 35)
		    System.out.println("Grade:Fail");
        else if (average>=90)
	        System.out.println("Grade:A");
	    else if (average>= 75)
	        System.out.println("Grade:B");
	    else if (average>=50)
	        System.out.println("Grade:C");
	    else
	        System.out.println("Grade:Fail");
		
	}
}