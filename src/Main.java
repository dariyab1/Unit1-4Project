import java.util.Scanner;
public class Main {    //include a condition where the user can enter the word and if he guesses the right word they win.
                       //also include a condition asking if the user wants to play again and if yes repeat the code segment.
                       //finally randomize so that it is random which user goes first.
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("User 1 enter a word:");
        String word=input.nextLine();
        Hangman newGame=new Hangman(word);
        for(int i=0; i<100; i++){
            System.out.println();
        }

        String playAgain="yes";
        String newStr=word;
        String playerWord="";

        boolean guessedWord=false;
        int correctLetters=0;
        String guess;
        int correct=0;
        int mistakes=0;
        String lettersGuessed="";
        boolean lost=false;



        while (guessedWord!=true&&lost!=true){
            int place;
            System.out.print("User two guess a letter:");
            guess=input.nextLine();


            if(lettersGuessed.contains(guess)){
                System.out.println("You already guessed that letter, try another one:");
                guess=input.nextLine();
            }



            for(int i=0; i<100; i++){
                System.out.println();
            }

            if(guess.equals(word)) {
                guessedWord = true;
                newGame.printMan(mistakes);
                newGame.currentWord(guess);

            }
            else if (newGame.letterIsInWord(guess)){
                while(newStr.indexOf(guess)!=-1){
                    place=newStr.indexOf(guess);
                    newStr=newStr.substring(0,place)+"0"+newStr.substring(place+1);
                    correct++;

                }


            }
            else {
                mistakes++;
            }

            if(guess.length()==1){
                lettersGuessed+=guess+" ";
            }


            if(mistakes==6){
                newGame.printMan(mistakes);
                System.out.println("You lost!");
                System.out.println("The word was: "+ word);
                lost=true;
            }
            else if(correct==word.length()||guessedWord==true){
                guessedWord=true;
                System.out.println("Congrats! You guessed the word!");

            }
            else{
                newGame.printMan(mistakes);
                newGame.currentWord(guess);
                System.out.println("Letters already guessed: "+lettersGuessed);
            }






        }



    }

}
