import java.util.Scanner;
public class HangmanRunner {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String play="yes";
        int playerTurn=(int)(Math.random()*2+1);


        while (play.equals("yes")){
            if(playerTurn%2==1){
                System.out.println("User 1 enter a word:");
            }
            else{
                System.out.println("User 2 enter a word:");
            }


            String guess;

            String word=input.nextLine();


            Hangman newGame= new Hangman(word);
            for(int i=0; i<100; i++){
                System.out.println();
            }

            while(newGame.GameInPlay()!=true){
                if(playerTurn%2==1){
                    System.out.print("Player two guess a letter:");
                    guess=input.nextLine();
                    newGame.gamePlay(guess);
                    guess=input.nextLine();
                }
                else{
                    System.out.println("Player one guess a letter:");
                    guess=input.nextLine();
                    newGame.gamePlay(guess);
                    guess=input.nextLine();
                }
            }


            playerTurn++;
            System.out.println("Do you want to play again?(yes/no)");
            play=input.nextLine();
        }
        System.out.println("You have ended the game.  Thank you for playing!");

    }

}
