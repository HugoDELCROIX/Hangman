public class Hangman {
    protected static String word = "tennis";
    protected boolean win = false;

    public static String censure(String censoredWord){
        censoredWord = "";
        for(int i=1;i <word.length()+1;i++){
            censoredWord = censoredWord + "*";
        }
        return censoredWord;

    }
    public static void main(String[] args) {
        String test = "tennis";
        System.out.println(censure(test));
    }
}
