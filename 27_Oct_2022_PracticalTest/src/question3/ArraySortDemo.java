package question3;

public class ArraySortDemo {
	public void sortArray(double []arr) {
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 double temp;
				 if(arr[i]>arr[j]) {
					 temp = arr[i];
					 arr[i]=arr[j];
					 arr[j] =arr[i];
				 }
			 }
		 }
		 System.out.println("Elements of the array in sorted order: ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]+"");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array1[]= {12.5,52.5,23.5,78.5};
		
		ArraySortDemo obj3= new ArraySortDemo();
		obj3.sortArray(array1);
		
	}

}
