package hometask10.strmethods;

public class StrMethods {
    public static char lastChar(String str) {


        return str.charAt(str.length() - 1);
    }

    public static boolean checkEndOfString(String str) {
        return str.endsWith("!!!");
    }

    public static boolean checkStartOfString(String str) {
        return str.startsWith("I like");
    }

    public static boolean stringContains(String str) {
        return str.contains("Java");
    }

    public static String stringReplacer(String str) {
        return str.replace("a", "o");
    }

    public static String uppercase(String str) {
        return str.toUpperCase();
    }

    public static String lowercase(String str) {
        return str.toLowerCase();
    }

    public static String substringer(String str) {
        int lastIndex = str.lastIndexOf("Java");
        int firstIndex = str.indexOf("Java");
        return str.substring(firstIndex, lastIndex);
    }

}
