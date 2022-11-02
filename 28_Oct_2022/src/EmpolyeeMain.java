//constructor overloading

class Employee{
	int employeeId;
	String empolyeeName;   //member variable or instance variable
	boolean employeeStatus;
	
	Employee(){
		System.out.println("Non parameterized condtructor");
	}
	Employee(int empId,String empName){
		System.out.println(" parameterized condtructor");
		employeeId=empId;
		empolyeeName=empName;
	}
	Employee(int empId){
		
	}
	Employee(int empId,boolean empStatus){
		employeeId=empId;
		employeeStatus=empStatus;
	}
	
	void displayEmployeeDetails() {
		//the local variable should  be initialized 
		//if we do not initialized then it will give compilation error
		int empValue;             //local variable
		empValue=78;
	//	System.out.println(empValue);
		System.out.println(employeeId);
		System.out.println(empolyeeName);
		System.out.println( employeeStatus);
	}
}
public class EmpolyeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		Employee employee2=new Employee(1,"Rutika");
		employee1.displayEmployeeDetails();
		employee2.displayEmployeeDetails();
		System.out.println(employee2.employeeId);
		System.out.println(employee2.empolyeeName);
		
	}

}
