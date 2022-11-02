
public class VarArgsDemo {
	void setArray(int a[]) {
		
	}
	void setVarArgs(int ...parameter) {
		System.out.println("setVarArgs");
		for(int a : parameter) {
			System.out.println(a);
		}
	}
	
	void setValues1(double paramVar1,int ...param2) {
		System.out.println("setVarArgs");
		for(int a : param2) {
			System.out.println(a);
		}
	}
	/* not acceptable
	void setValues2(int...paramVar2,double ...paramVar1) {
		System.out.println("setVarArgs");
		for(int a : paramVar2) {
			System.out.println(a);
		}
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo varArgsDemoObj = new VarArgsDemo();
		//varArgsDemoObj.setVarArgs();
		
		//varArgsDemoObj.setVarArgs(1);
	//	varArgsDemoObj.setVarArgs(1,2);
		varArgsDemoObj.setVarArgs(3,1,2);
	}

}
