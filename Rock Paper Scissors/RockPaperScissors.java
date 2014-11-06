import java.util.Scanner;
public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 
        /*
        if(player1.equals("scissors")){
            if(player2.equals("paper")){
                System.out.println("player 1 wins");
            }else if(player2.equals("rock")){
                System.out.println("player 2 wins");
            }else if(player2.equals("scissors")){
                System.out.println("tie");
            }else{
                System.out.println("what");
            }
        }else if(player1.equals("paper")){
            if(player2.equals("paper")){
                System.out.println("tie");
            }else if(player2.equals("rock")){
                System.out.println("player 1 wins");
            }else if(player2.equals("scissors")){
                System.out.println("player 2 wins");
            }else{
                System.out.println("what");
            }
        }else if(player1.equals("rock")){
            if(player2.equals("paper")){
                System.out.println("player 2 wins");
            }else if(player2.equals("rock")){
                System.out.println("tie");
            }else if(player2.equals("scissors")){
                System.out.println("player 1 wins");
            }else{
                System.out.println("what");
            }
        }else{
            System.out.println("what");
        }
        
        */
       if(player1.equals("scissors") && player2.equals("rock"))
       {
           System.out.println("player 2 wins");
       }
       else if(player1.equals("rock") && player2.equals("paper"))
       {
           System.out.println("player 2 wins");
       }
       else if(player1.equals("paper") && player2.equals("scissors"))
       {
           System.out.println("player 2 wins");
       } 
       else if(player1.equals("scissors") && player2.equals("paper"))
       {
           System.out.println("player 1 wins");
       }
       else if(player1.equals("rock") && player2.equals("scissors"))
       {
           System.out.println("player 1 wins");
       }
       else if(player1.equals("paper") && player2.equals("rock"))
       {
           System.out.println("player 1 wins");
       }
       else if(player1.equals(player2))
       {
           System.out.println("tie");
       }
       else
       {
           System.out.println("what");
       }
    }
}