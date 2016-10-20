
public class Course {
	private String Name; 
	private int Credits;
	private int Numseats;
	private Student[] Roster;
	
	//constructors
	public Course(String Name , int Credits , int seats){
		this.Name = Name; 
		this.Credits = Credits; 
		this.Numseats = seats;
		this.Roster = new Student[seats]  ; 
	}
	
	public String getName(){
		return this.Name;
	}
	public int getCredits(){
		return this.Credits;
		
	}
	public int getRemainingSeats(){
		return this.Numseats;
	}
	public Student[] getRoster(){
		return this.Roster;
	}
	//addstudent-1 
	public boolean studentEnrolled(Student student)
	{
        for(Student enrolled : this.Roster) 
        {
        	if (enrolled != null) 
        	{
        		if (enrolled.getName() == student.getName())
        		{
        			return true;
        		}
        	}
        }
        return false;
	}
	
	
	//addStudent() -- 2) add student if not enrolled and if seats remain in class
	public boolean addStudent(Student student)
	{
		if (this.Numseats == 0)
		{
			return false;
		}
		 if (this.studentEnrolled(student))
		{
			return false;
		}
		else
		{
			for(int i = 0; i < this.Roster.length; i ++ )
			{
				if (this.Roster[i] == null)
				{
					this.Roster[i] = student;
					this.Numseats = this.Numseats - 1;
					return true;
				}
			}	
		}
		return false;
	}
			
	
        
		
	public void generateRoster(){
		System.out.println("Roster for" + this.Name + ":");
		for(Student student :this.Roster)
		{
	
				if(student == null)
				{
					System.out.println("Empty");
				}
				else 
				{
					System.out.println(" " + student.getName());
				    }
          }
          }
	
	
	
          public double averageGPA()
      	{
      		double TotalGPA = 0 ;
      		for(Student student : this.Roster)
      		{
      			if (student != null){
      			
      				TotalGPA = TotalGPA + student.getGPA();
      			}
      			
      			

      		}
      		double averageGPA = TotalGPA / (this.Roster.length - this.Numseats); 
      		return averageGPA;
      	}
      	
      	

      	//toString()
      	public String toString()
      	{
      		return("Course Number: " + this.Name + "; CourseCredits: " + this.Credits);
      	}
      	
      	
      }


