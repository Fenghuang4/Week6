public class SentenceUtility {

    private String sentenceString;
    private String[] allWords;
    public SentenceUtility( String sentenceInput) {
        this.sentenceString = sentenceInput;
        allWords = this.sentenceString.split(" ");
    }
    public static int firstOccurenceOfWord(String sentence, String word) {
        String[] allWords = sentence.split(" ");
        for (int i = 0; i < allWords.length; i++) {
            String currentWord = allWords[i];
            if (currentWord.equalsIgnoreCase(word)) {
                return i;
            }
        }
        return -1;
    }
    public int lastOccuranceOfWord(String word) {
        for (int i = allWords.length - 1; i > 0; i--) {
            String currentWord = allWords[i];
            if (currentWord.equalsIgnoreCase(word)) {
                return i;
            }
        }
        return -1;
    }
}
