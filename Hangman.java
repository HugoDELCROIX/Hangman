import java.util.Scanner;

public class Hangman {
    protected String word;
    protected char letter;
    Scanner s = new Scanner(System.in);

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void askLetter() {
        System.out.println("Enter a letter : ");
        char askedLetter = s.next().charAt(0);
        this.letter = askedLetter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char showLetter() {
        return this.letter;
    }

    public String censure() {
        String censoredWord = "";
        for (int i = 1; i < this.word.length() + 1; i++) {
            censoredWord = censoredWord + "*";
        }
        return censoredWord;
    }

    public char[] verify() {
        String currentWord = getWord();
        char verifiedWord[] = new char[currentWord.length()];
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) == this.letter && verifiedWord[i] != '*') {
                verifiedWord[i] = this.letter;
            } else {
                verifiedWord[i] = '*';
            }
        }
        return verifiedWord;
    }

    public boolean compare() {
        boolean same = false;
        for (int i = 0; i < getWord().length(); i++) {
            if (getWord() == verify().toString()) {
                same = true;
            }
        }
        return same;

    }

    public void playGame() {
        boolean win = false;
        int attempts = 10;
        setWord("tennis");
        System.out.println("Welcome to the Hangman game!" + "\n" + "You have "+attempts+" attempts to find this word : " + censure());
            do {
                if (compare() == true) {
                    win = true;
                } else {
                    askLetter();
                    System.out.println(verify());
                    attempts--;
                    System.out.println(attempts + " left");
                }
            } while (win == false);
    }

    public static void main(String[] args) {
        Hangman a = new Hangman();
        a.playGame();

    }
}