package question1;

public class ArrayDemo {
	
	public int[] manipulateIntegerArray(int arr[]) {
		int newArr[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			//newArr[i]=arr[i]+5;
			arr[i]+=5;   //shortend assignment operator
		}
			
		return newArr;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array[]= {1,2,7,8,10};
			
			ArrayDemo obj1= new ArrayDemo();
			
        
		    int newArr[] =obj1.manipulateIntegerArray(array);
		    for(int i=0;i<newArr.length;i++) {
		    	System.out.println(newArr[i]);
		    }
	}

}
