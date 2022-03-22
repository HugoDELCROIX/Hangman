public class Hangman {
    protected static String word = "tennis";
    protected boolean win = false;

    public static String censure(String censoredWord){
        int count = 0;
        censoredWord = "";
        for(int i=1;i <word.length()+1;i++){
            count = i;
            censoredWord = censoredWord + "*";
            System.out.println(count);
        }
        return censoredWord;

    }
    public static void main(String[] args) {
        String test = "tennis";
        System.out.println(censure(test));
    }
}
