package question2;

import java.util.Scanner;
public class GameMenu {
	public void startGame() {
		System.out.println("Start the game");
	}
	
	public void displayGameInstruction() {
		System.out.println("Display game instruction");
	}
	
	public void exitGame() {
		System.out.println("Exit the game");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
			GameMenu gameMenuObj= new GameMenu();
			Scanner scannerObj = new Scanner(System.in);
			while(true) {
				System.out.println("1.Start the game \n2.Display game instruction \n3.Exit the game");
		
				System.out.println("Enter your choice : type 1,2 or 3");
		
				int menuChoice = scannerObj.nextInt();
		//int menuchoice='3';
		
				switch(menuChoice){
				case 1:
					gameMenuObj.startGame();
					break;
				case 2:
					gameMenuObj.displayGameInstruction();
					break;
				case 3:
					gameMenuObj.exitGame();
					break;
					default:
						System.out.println("Not a valid choice");
				}
			}
	}
}
		
		
		

