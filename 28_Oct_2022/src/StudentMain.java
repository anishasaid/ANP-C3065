class Student{	
   int 	studentId;    //are called instance variable 
   String studentName;
   
   Student(int sId,String sName){
	   studentId = sId;
	   studentName = sName;
   }
   
   void displayStudentInfo() {
	   System.out.println("Student Id:"+studentId);
	   System.out.println("Student Name:"+studentName);
	   
	   
   }
	/*
	Student(){    //name of the class and the method are same and dont have
		          // return type then id is called constructer
	System.out.println("Student constructor");	    
	}
		         
	void Student() {
		System.out.println("Student method");	
	}
	void createStudent() {
		Student sObj= new Student();
	}
	*/
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=90;
		Student studentObj1 = new Student(1,"Karishma");
		Student studentObj2 = new Student(2,"Atharva");//reference variable/object
		Student stuObj;  //Reference variable
		
		studentObj1.displayStudentInfo();
	}

}
