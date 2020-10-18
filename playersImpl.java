
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerImpl {
	
	

	
	
	public static void plays() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Target Score");
		int score=scan.nextInt();
		
	
		System.out.println("Enter the no of players");
		String[] players= new String[scan.nextInt()];
		int playerScore []= new int[players.length];
		
		
		Players player = new Players();	
		int total[] = new int[players.length] ;
		int count =0;
		int press ;
		int a;
		int b;
		int c;
		//System.out.println(playerScore.toString());
	
		
		for(int i=0; i < players.length ; i++) {
			System.out.println("Enter the players name");
			String pName =scan.next();
			players[i]=pName;		
		}
		
		int result = 0;
		String command= null;
				
		do {		
		System.out.println("Enter 1 To play by adding");		
		System.out.println("Enter 2 To play by subtracting");
		press=scan.nextInt();
			switch (press) {		 	
		 case 1:do {
			for(int i=0; i <players.length ;i++) {
				System.out.println("Enter the score for "+players[i]);
				System.out.println("Enter the score");
				a=scan.nextInt();
				System.out.println("Enter the score");
				b=scan.nextInt();
				System.out.println("Enter the score");
				c=scan.nextInt();
				playerScore[i]=a+b+c;
				
				if(total[i] < score) {
				total[i] =total[i]+playerScore[i];
				System.out.println(players[i] +" score is "+ total[i]);
				}				
				
				if(total[i]> score) {
					System.out.println(total[i] +"check");
					System.out.println(playerScore[i]);
					total[i]= total[i]-playerScore[i];
					System.out.println(total[i]);
					System.out.println("You need "+ (score - total[i]) + "to Win");
					
				}
				 if (total[i] == score) {
						System.out.println(players[i] +" is the winner");
						result =score;
						break;
					}
					
				
				
			}
		
		}
		while(result != score);
		break;
		 case 2: 
			 
			 do {
			 

				for(int i=0; i <players.length ;i++) {
					System.out.println("Enter the score for "+players[i]);
					
					
					do {
						playerScore[i]=scan.nextInt();
						total[i]=total[i]-playerScore[i];
						System.out.println(result);
				
					if(result == 0) {
						System.out.println(players[i] +" is the winner");
						break;}
					}
					while(result != 0);
				
					
				}
				
				
			}
			while(result != score);
		
		
		}
			
		System.out.println("Do You want to play Again press Y to play N to exit");
			 command = scan.next();
		}
		
		while(command.equalsIgnoreCase("Y"));
		
		
			
		
		
		
	
		
		
		
		
		}
		
	
}


