package app;

import java.util.StringTokenizer;

public class TextAnalyzator {
    public static String lenghtCalc(String text) {

        return Integer.toString(text.length());
    }

    public static String lenghtWithoutWhiteChar(String text) {
        return Integer.toString(text.replaceAll(" ", "").length());
    }

    public static String wordCounting(String text) {
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        return Integer.toString(stringTokenizer.countTokens());
    }

    public static String palindromeCheck(String text) {

        text = text.replaceAll(" ", "");
        text = text.toLowerCase();
        char[] chars = text.toCharArray();

        boolean checker = true;
        int count = 0;
        int temp = chars.length - 1;
        do {
            if (chars[count] != chars[temp]) {
                checker = false;
                break;
            }
            temp--;
            count++;
        } while (count < chars.length - 1);
        return Boolean.toString(checker);
    }
}
