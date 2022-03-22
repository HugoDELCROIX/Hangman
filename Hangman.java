import java.util.Scanner;

public class Hangman {
    protected String word;
    protected String letter;
    protected boolean win = false;
    Scanner s = new Scanner(System.in);

    public Hangman() {

    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void askLetter() {
        String askedLetter = s.next();
        this.letter = askedLetter;
    }

    public String showLetter() {
        return this.letter;
    }

    public String censure() {
        String censoredWord = "";
        for (int i = 1; i < this.word.length() + 1; i++) {
            censoredWord = censoredWord + "*";
        }
        return censoredWord;
    }

    public String verify() {
        String verifiedWord = censure();
        do {
            
        } while (win = false);
        return verifiedWord;
    }

    public static void main(String[] args) {
        Hangman a = new Hangman();

        a.setWord("tennis");
        System.out.println("Find this word : " + a.censure());
        a.askLetter();
        System.out.println("Find this word : " + a.verify());
        System.out.println(a.getWord());


    }
}