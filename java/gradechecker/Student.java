import java.util.ArrayList;

public class Student{
	
	//Atributes
	private String name;
	private String faculty;
	private int year;
	private String grades;
	
	
	//Setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setFaculty(String faculty){
		this.faculty = faculty;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setGrades(String grades){
		this.grades = grades;
	}
	
	
	//Getters
	public String getName(){
		return name;
	}
	
	public String getFaculty(){
		return faculty;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getGrades(){
		return grades;
	}
	
	//Constructors
	public Student(){
	}
	
	public Student(String name, String faculty, int year, String grades){
		this.name = name;
		this.faculty = faculty;
		this.year = year;
		this.grades = grades;
	}
	
}
