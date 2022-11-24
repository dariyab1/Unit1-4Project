import java.util.Scanner;
public class Main {
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
            if (newGame.letterIsInWord(guess)){
                while(newStr.indexOf(guess)!=-1){
                    place=newStr.indexOf(guess);
                    newStr=newStr.substring(0,place)+"0"+newStr.substring(place+1);
                    correct++;

                }

            }
            else {
                mistakes++;
            }

            for(int i=0; i<100; i++){
                System.out.println();
            }

            lettersGuessed+=guess+" ";
            if(mistakes==6){
                newGame.printMan(mistakes);
                System.out.println("You lost!");
                System.out.println("The word was: "+ word);
                lost=true;
            }
            else{
                newGame.printMan(mistakes);
                newGame.currentWord(guess);
                System.out.println("Letters already guessed: "+lettersGuessed);
            }

            if(correct==word.length()){
                guessedWord=true;
                System.out.println("Congrats! You guessed the word!");
            }



        }



    }

}
