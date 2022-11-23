public class Hangman {
    private String secretWord;
    private int length;
    boolean endGame=false;
    public Hangman(String secretWord){
        length=secretWord.length();
        this.secretWord=secretWord;
    }
    public boolean letterIsInWord(String letter){
        if (secretWord.contains(letter)){
            return true;
        }
        else{
            return false;
        }

    }
    public void printMan(int mistakes){
        if(mistakes==0){
            System.out.println("  ______");
            System.out.println(" |      |");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");
        }
        if(mistakes==1){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");
        }
        if(mistakes==2){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |       |");
            System.out.println(" |       |");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");

        }
        if(mistakes==3){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|");
            System.out.println(" |     / |");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");

        }
        if(mistakes==4){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|\\");
            System.out.println(" |     / | \\");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");

        }
        if(mistakes==5){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|\\");
            System.out.println(" |     / | \\");
            System.out.println(" |      /");
            System.out.println(" |     / ");
            System.out.println("---");

        }
        if(mistakes==6){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|\\");
            System.out.println(" |     / | \\");
            System.out.println(" |      / \\");
            System.out.println(" |     /   \\");
            System.out.println("---");
            System.out.println("You are dead!");
            endGame=true;

        }
    }






}
