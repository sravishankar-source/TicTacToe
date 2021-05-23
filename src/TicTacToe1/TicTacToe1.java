package TicTacToe1;
import java.util.scanner;

public class TicTacToe1 {

	public static void displayBoard(char[][] Board) {
		System.out.println(Board[0][0]+ "|" + Board[0][1]+ "|" +Board[0][2]);
		System.out.println("-+-+-");
		System.out.println(Board[1][0]+ "|" + Board[1][1]+ "|" +Board[1][2]);
		System.out.println("-+-+-");
		System.out.println(Board[2][0]+ "|" + Board[2][1]+ "|" +Board[2][2]);

	}



/*UC2 - Ability to allow the player to choose a letter X or O*/

public static void ChooseEitherXorO()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose either X or O :");
	String userInput = sc.nextLine();
	char player1=userInput.charAt(0);
	char computer;
	if (player1 != 'X' && player1 != 'O' && player1 != 'x' && player1 != 'o' )
	{
		System.out.println("Please enter a valid choice (Enter either X or O) : ");
		 userInput = sc.nextLine();
		 player1=userInput.charAt(0);
	}	
	if(player1 == 'X' || player1 == 'x')
		computer ='O';
	else
		computer = 'X';
	
}

/*UC3 - As a Player would like to see the board so I can choose the valid cells to make my move during my turn - Write a method*/
public static void showBoard(char[][] Board) {
	System.out.println("--------Showing Current Board------");
	System.out.println(Board[0][0]+ "|" + Board[0][1]+ "|" +Board[0][2]);
	System.out.println("-+-+-");
	System.out.println(Board[1][0]+ "|" + Board[1][1]+ "|" +Board[1][2]);
	System.out.println("-+-+-");
	System.out.println(Board[2][0]+ "|" + Board[2][1]+ "|" +Board[2][2]);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("WELCOME TO TIC-TAC-TOE GAME\n");
	
	char[][] Board = {{' ',' ',' '},
					  {' ',' ',' '},
					  {' ',' ',' '}};
	
	
	displayBoard(Board);
	ChooseEitherXorO();
	showBoard(Board);
	
	
	}

}