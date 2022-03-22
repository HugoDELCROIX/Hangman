import java.util.Scanner;

public class Hangman {
    protected String word = "tennis";
    protected boolean win = false;
    Scanner s = new Scanner(System.in);

    public Hangman(String word){
        this.word = word;
    }
    public String getWord(){
        return this.word;
    }

    public void setWord(String word){
        this.word = word;
    }

    public String censure(){
        String censoredWord = "";
        for(int i=1;i <this.word.length()+1;i++){
            censoredWord = censoredWord + "*";
        }
        return censoredWord;
    }

    public String verify(char letter){
        String verifiedWord = "";
        for(int i=1;i<this.word.length()+1;i++){
            if(this.word.charAt(i-1)==letter){
                verifiedWord = verifiedWord + letter;
                this.word.indexOf(letter, this.word.indexOf(letter)+1);
            } else {
                verifiedWord = verifiedWord + "*";
            }   
        }
        return verifiedWord;
    }
    public static void main(String[] args) {
        Hangman a = new Hangman("tennis");
        System.out.println(a.getWord());
        a.setWord("lasagne");
        System.out.println(a.getWord());
        
    }
}
