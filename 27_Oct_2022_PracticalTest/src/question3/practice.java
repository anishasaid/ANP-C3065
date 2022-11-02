package question3;

public class practice {
	public void sortArray(double[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				double temp;
				if(arr[i]<arr[j]) {
					temp= arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.println("Elements of the array are:");
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]+"");
			}
		}
	}
	
	public static void main(String args[]) {
		double arra1[]= {1.2,4.1,7.1,1.1,5.6,89.5};
		practice p =new practice();
		p.sortArray(arra1);
	}
}
	
	
		
			
		
		
