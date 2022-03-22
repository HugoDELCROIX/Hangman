import java.util.Scanner;

public class Hangman {
    protected String word;
    protected char letter;
    protected boolean win = false;
    Scanner s = new Scanner(System.in);

    public Hangman(){

    }

    public String getWord(){
        return this.word;
    }

    public void setWord(String word){
        this.word = word;
    }

    public void askLetter(){
        char askedLetter = s.next().charAt(0);
        this.letter = askedLetter;
    }

    public char showLetter(){
        return this.letter;
    }

    public String censure(){
        String censoredWord = "";
        for(int i=1;i <this.word.length()+1;i++){
            censoredWord = censoredWord + "*";
        }
        return censoredWord;
    }

    public String verify(){
        String verifiedWord = "";
        for(int i=1;i<this.word.length()+1;i++){
            if(this.word.charAt(i-1)==this.letter){
                verifiedWord = verifiedWord + this.letter;
                this.word.indexOf(this.letter, this.word.indexOf(this.letter)+1);
            } else {
                verifiedWord = verifiedWord + "*";
            }   
        }
        return verifiedWord;
    }

    public static void main(String[] args) {
        Hangman a = new Hangman();
        
        a.setWord("tennis");
        System.out.println("Find this word : "+a.censure());
        a.askLetter();
        System.out.println("Find this word : "+a.verify());
        
        
    }
}
