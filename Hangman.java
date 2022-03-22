import java.util.Scanner;

public class Hangman {
    protected static String word = "tennis";
    protected boolean win = false;
    Scanner s = new Scanner(System.in);

    public static String censure(){
        String censoredWord = "";
        for(int i=1;i <word.length()+1;i++){
            censoredWord = censoredWord + "*";
        }
        return censoredWord;
    }

    public static String verify(char letter){
        String verifiedWord = "";
        for(int i=1;i<word.length()+1;i++){
            if(word.charAt(i-1)==letter){
                verifiedWord = verifiedWord + letter;
                word.indexOf(letter, word.indexOf(letter)+1);
            } else {
                verifiedWord = verifiedWord + "*";
            }   
        }
        return verifiedWord;
    }
    public static void main(String[] args) {
        System.out.println("You have 10 attempts to find : "+censure());
        System.out.println(verify('n'));
    }
}
