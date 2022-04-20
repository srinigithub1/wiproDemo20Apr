package pkg_saample;

public class Student {
	
	int rollno;
	String name;
	int no_subjects;
	float avg_marks;
	char gender;
	boolean Nationality;
	long contact;
	
	public void initialize(){

		rollno = 123;
		name="Alex";
		no_subjects= 4;
		avg_marks=89.78f;
		gender='M';
		Nationality=true;
		contact=293729372937l;
		
	}
	
	
	public void display(){
		
		System.out.println("name of the studnet is: "+name);
		System.out.println("rollno of the studnet is: "+rollno);
		System.out.println("no_subjects of the studnet is: "+no_subjects);
		System.out.println("avg_marks of the studnet is: "+avg_marks);
		System.out.println("gender of the studnet is: "+gender);
		System.out.println("Nationality of the studnet is: "+Nationality);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objStudent;
		objStudent=new Student(); // instntiating the class
		
		objStudent.initialize();
		objStudent.display();
	}

}

