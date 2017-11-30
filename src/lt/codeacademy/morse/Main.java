package lt.codeacademy.morse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, String> map = new HashMap<>();
    private static String sample = ".... . -.--   .--- ..- -.. .";

    public static void main(String[] args) {
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");

        String decodedSentence = decode(sample);
        System.out.println(decodedSentence);

    }

    public static String decode(String sentence) {
        String[] wordArray = sentence.split("   ");
        String decodedSentence = "";
        for (String word : wordArray) {
            String[] letter = word.split(" ");
            decodedSentence += " ";
                for (String tempLetter : letter) {
                    decodedSentence += map.get(tempLetter);
                }
        }
        return decodedSentence;
    }
}
