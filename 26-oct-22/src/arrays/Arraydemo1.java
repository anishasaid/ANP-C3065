package arrays;

public class Arraydemo1 {
	
	public void setInt(int a) {
		
	}
	
	public void setIntegerArray(int[]array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public void setIntArray(int []a1) {
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr1[]= {90,5,34,67,34};   //Single dimentional array
			                              // declarating and initializing the array
			
			int arr2[]= new int[2]; // declaraton single dimentional array with size 2
			arr2[0]=12;              //initialization
			arr2[1]=78;
			
			int x=20;
			Arraydemo1 Obj1 = new Arraydemo1();
			Obj1.setInt(x);
			
			System.out.println(arr2[1]);
			
			
			int arr3[]= {45,45,45,45,45,45};
		   Obj1.setIntArray(arr3);
			
			Arraydemo1 obj2 = new Arraydemo1();
			obj2.setIntegerArray(arr1);
			

	}
}
