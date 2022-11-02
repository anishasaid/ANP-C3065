
public class ForLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Loop Count:"+i);
			if(i==3)
				continue;   //continue will check if i==3 it will ingnore the 3 and continue 
			//System.out.println("Loop Count:"+i);
			
		}
		for(int j=0;j<=3;j++) {
			System.out.println("Loop count:"+j);
			if (j==2)
				break ;
		}
	}

}
