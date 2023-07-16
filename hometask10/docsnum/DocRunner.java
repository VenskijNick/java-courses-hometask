package hometask10.docsnum;

public class DocRunner {
    public static void main(String[] args) {
        String doc = "5555-abc-5678-def-1a2b";

        DocumentNumber.printTheDoc(doc);
        DocumentNumber.printFirstTwoBlocks(doc);
        DocumentNumber.replaceBlocks(doc);
        DocumentNumber.printLetters(doc);
        DocumentNumber.printLettersUpperCase(doc);
        DocumentNumber.containsSequence(doc);
        DocumentNumber.startsWithSequence(doc);
        DocumentNumber.endsWithSequence(doc);

    }
}
