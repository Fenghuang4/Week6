// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        SentenceUtility constitutionalConventionSentence =
                new SentenceUtility("The Constitutional Convention in Philadelphia met between May and September of 1787 to address the problems of the weak central government that existed under the Articles of Confederation.");
        int indexOfWordConvention = constitutionalConventionSentence.lastOccuranceOfWord("Convention");
        System.out.println("Index of word Convention: " + indexOfWordConvention);

        SentenceUtility gettyburgAddressSentence =
                new SentenceUtility("Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.");
        int indexOfWordLiberty = gettyburgAddressSentence.lastOccuranceOfWord("Liberty,");
        System.out.println("Index of word Liberty: "+ indexOfWordLiberty);

    }
}