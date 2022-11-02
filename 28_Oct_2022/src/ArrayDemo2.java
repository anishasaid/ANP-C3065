
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];
		arr[0][0]=90;
		arr[0][1]=45;
		arr[1][0]=34;
		arr[1][1]=85;
		arr[2][0]=23;
		arr[2][1]=14;
		
		System.out.println(arr[2][0]);
		//for direct initialization
		int arr1[][]= {{2,5},{4,5},{8,7}};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++)
				System.out.print(arr1[i][j]+"");
			System.out.println();
		}
		
		System.out.println("enhanced for loop");
		for(int i[]:arr1) {
			for(int j:i) {
				System.out.println(j+"");
			}
			System.out.println();
		}
	}

}
