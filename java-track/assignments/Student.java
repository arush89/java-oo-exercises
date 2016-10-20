import org.junit.Test; 
import java.util.ArrayList; 
 
public class Student {
	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;

	

	public Student(String firstName, String lastName, int StudentID) {
		this.Name = firstName + " " + lastName;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = 0.000;
	}

	
	public String getName() { 
		return this.Name;
	}
	
	public int getStudentID() {
		return this.StudentID; 
	}
	
	public int getCredits() {
		return this.Credits;
	}
		
	public double getGPA() {
		return this.GPA; 
	}
	
	public String getClassStanding() { 
		if (this.Credits <30){
			return "Freshman";
		}
		else if(this.Credits >= 30 & this.Credits < 60){
			
			return "Sophomore";
		}
			 else if  (this.Credits >= 60 & this.Credits < 90){
				return "Junior";
			 }
				else {
					return"Senior"; 
			}

		} 
			
	public void submitGrade(double grade, int q) 
	{		
		double g = grade * q;
		double p = this.GPA * this.Credits;
		this.Credits = this.Credits + q;
		this.GPA = (g + p) / this.Credits;
		this.GPA = (double) (Math.round(this.GPA * 1000)) / 1000;
	 }
				
		
		public double computeTuition() {
			 double c = this.Credits / 15 * 20000;
			 double p = this.Credits % 15 * 1333.33;
				double	e = c +p; 
					return e;
		}
		
		public Student createLegacy(Student mother, Student father)
		{
		String firstName = mother.getName();
			String lastName = father.getName(); 
			int NewID = mother.getStudentID() + father.getStudentID();
			
			
			Student legacy = new Student(firstName,lastName,NewID);
			legacy.GPA = (mother.getGPA() + father.getGPA()) / 2;
			legacy.Credits = (mother.getCredits() + father.getCredits()) / 2;
			legacy.Credits = Math.max(mother.getCredits() , father.getCredits()) ;
			return legacy;
		}
		
		public String toString()
		{
			return ("StudentName: " + Name + " Student ID: " + StudentID);
	}
	} 
			
			
			
					
			
			
	
	
	



