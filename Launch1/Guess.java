
public class Guess {
	class Umpire
	{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		
		void collectNumFromGuesser()
		{
			Guesser g=new Guesser();
			numFromGuesser=g.guessNum();
		}
		void collectNumFromPlayers()
		{
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			numFromPlayer1=p1.guessNum();
			numFromPlayer2=p2.guessNum();
			numFromPlayer3=p3.guessNum();
		}
		void compare()
		{
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("All players won the game");
				}
				else if(numFromGuesser==numFromPlayer2 )
				{
					System.out.println("Player 1 & Player2 won");
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 1 & Player3 won");
				}
				else
				{
				System.out.println("Player 1 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 2 & Player3 won");
				}
				else
				{
				System.out.println("Player 2 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 3 won the game");
			}
			else 
			{
				System.out.println("all have won the game");
			}
			
			{
				System.out.println("Better Luck Next Time");
			}
			if((numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesse==numFromPlayer3 ))
		
		{
				System.out.println("All have won the game");
				}
		}
		
		
	}


	public class LaunchGame {

		public static void main(String[] args) {
			
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();

		}

	

}

}
}
}
