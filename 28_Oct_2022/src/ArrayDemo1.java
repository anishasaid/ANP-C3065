
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6};
		for(int i:arr1) {     //inhanced  for loop -insted of arr1 we can use enum and 
			System.out.println(i);
		}
		
		double arr2[]= {1.1,2.4,3.5,4.8,5.4,6.3,4.1};
		for(double d:arr2) {
			double d1 = d+2;    //insted this ->   d+=2;
			System.out.println("old value:"+d+"new value:"+d1);
		}
		
		char arr3[]= {'a','b','c','d'};
		for(int i:arr3) {
			System.out.println(i);
		}
	}
}						


	
