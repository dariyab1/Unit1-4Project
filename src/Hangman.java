public class Hangman {
    private String secretWord;
    private int length;
    private String currentStr;
    private boolean endGame=false;
    private String compareStr;
    public Hangman(String secretWord){
        length=secretWord.length();
        this.secretWord=secretWord;
        currentStr="";
        for (int i =0; i<secretWord.length();i++){
            currentStr+="-";
        }
        compareStr=secretWord;
    }
    public boolean letterIsInWord(String letter){
        if (secretWord.contains(letter)){
            return true;
        }
        else{
            return false;
        }

    }

    public void currentWord(String letter){


        int place;
        if(letter.length()>1){
            System.out.println(letter);
        }
        else{

        while (compareStr.indexOf(letter)!=-1){
            place=compareStr.indexOf(letter);
            compareStr=compareStr.substring(0,place)+"~"+compareStr.substring(place+1);
            currentStr=currentStr.substring(0,place)+letter+currentStr.substring(place+1);
        }
        System.out.println("Word: " +currentStr);}
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
            endGame=true;

        }
    }






}
