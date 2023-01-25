//WAP to print any multiplication table. 
//Use Exception handling and call Thread.Sleep() method
 public class ThreadExample extends Thread{
	 
	 public void run() {
		 try {
			 int num = 5;
			 for(int i=1;i<=10;i++) { 
				 //it will sleep the main method Thread for 1 second
				 //when each time the for loop runs
				 Thread.sleep(-1000);
				 // it will print the values which is multiple of 5
				 System.out.println(num*i);
			 }
		 }
		 catch(Exception e ) {
			 //catching the exception 
			 System.out.println(e);
		 }
	 }
	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start();

	}

}
