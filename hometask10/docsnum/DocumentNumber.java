package hometask10.docsnum;

public class DocumentNumber {

    public static void printTheDoc(String input) {
        System.out.println(input);
    }

    public static void printFirstTwoBlocks(String input) {
        String[] blocks = input.split("-");
        System.out.println(blocks[0].substring(0, 3) + " " + blocks[2].substring(0, 3));
    }

    public static void replaceBlocks(String input) {
        String[] blocks = input.split("-");
        blocks[2] = "***";
        blocks[3] = "***";
        System.out.println(String.join("-", blocks));
    }

    public static void printLetters(String input) {
        String[] blocks = input.split("-");
        String letters = blocks[1] + "/" + blocks[3] + "/" + blocks[4];
        letters = letters.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(letters);
    }

    public static void printLettersUpperCase(String input) {
        String[] blocks = input.split("-");
        StringBuilder sb = new StringBuilder("Letters: ");
        sb.append(blocks[1]).append("/").append(blocks[3]).append("/").append(blocks[4]);
        String letters = sb.toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
        sb.replace(8, sb.length(), letters);
        System.out.println(sb.toString());
    }

    public static void containsSequence(String input) {
        String lowerCaseInput = input.toLowerCase();
        if (lowerCaseInput.contains("abc")) {
            System.out.println("Contains sequence abc");
        } else {
            System.out.println("Does not contain sequence abc");
        }


    }

    public static void startsWithSequence(String input) {
        if (input.startsWith("555")) {
            System.out.println("Starts with sequence 555");
        } else {
            System.out.println("Does not start with sequence 555");
        }
    }

    public static void endsWithSequence(String input) {
        if (input.endsWith("1a2b")) {
            System.out.println("Ends with sequence 1a2b");
        } else {
            System.out.println("Does not end with sequence 1a2b");
        }
    }


}
