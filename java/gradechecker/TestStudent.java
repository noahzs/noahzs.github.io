import java.util.Scanner;
import java.util.ArrayList;

public class TestStudent{

	public static void main(String[] args){
		
		//make the scanner
			
	Scanner input = new Scanner(System.in);
			
		//Construct test student
		
		Student testStudent = new Student();
		
		//Set student variables
		System.out.print("Enter student's name: ");
		testStudent.setName(input.next());
		System.out.print("Enter student's faculty: ");
		testStudent.setFaculty(input.next());
		System.out.print("Enter student's year: ");
		testStudent.setYear(input.nextInt());
		System.out.print("Enter student's grades: ");
		testStudent.setGrades(input.next());
		
		//Print Brief
		
		System.out.println("\n" + testStudent.getName()+ " - " +testStudent.getFaculty() + " - " + testStudent.getYear());
		
		//Seperating out the marks
		String grades = testStudent.getGrades();
		char a = 0;
		char b = 0;
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		
		for(int i = 0; i<grades.length(); i++){
			if(grades.charAt(i)==','){
				String c = String.valueOf(a);
				String d = String.valueOf(b);
				String mark = d.concat(c);
				int numMark = Integer.parseInt(mark);
				marks.add(numMark);		
			}
			else if(i==grades.length()-1){
			b = a;
			a = grades.charAt(i);
			String c = String.valueOf(a);
			String d = String.valueOf(b);
			String mark = d.concat(c);
			int numMark = Integer.parseInt(mark);
			marks.add(numMark);		
			}
			else{
			b = a;
			a = grades.charAt(i);	
			}
		}
		
		
		//Calculate WAM
		double gradeSum = 0;
		double preWam = 0;
		for(int i = 0; i<marks.size(); i++){
			gradeSum = gradeSum + marks.get(i);
			preWam = gradeSum/(i+1);
		}
		String wam = String.valueOf(preWam);
		if(wam.length()>2){
			if(wam.length()==4){
				if(wam.charAt(3)=='0'){
					
					wam = wam.substring(0, 2);
				}
				else{
					System.out.println("WAM: "+(Math.round(preWam*100))/100.0);
				}
			}
			else{
				System.out.println("WAM: "+(Math.round(preWam*100))/100.0);
			}
		}
		if(wam.length() == 2){
			System.out.println("WAM: " + wam);
		}
		//Print WAM

		//Calculate grades
		int F = 0;
		int P = 0;
		int C = 0;
		int D = 0;
		int HD = 0;
		for(int i = 0; i<marks.size(); i++){
			if (marks.get(i)<50){F++;} else
			if (marks.get(i)<65){P++;} else
			if (marks.get(i)<75){C++;} else
			if (marks.get(i)<85){D++;} else{HD++;}	
			}
			
		;
		
		//Print results
		System.out.println(F + " x F");
		System.out.println(P + " x P");
		System.out.println(C + " x C");
		System.out.println(D + " x D");
		System.out.println(HD + " x HD");
	}
	
}
