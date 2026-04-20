package service;

import java.util.Collections;
import java.util.HashMap;

public class WordCountService {

    public static void wordFrequency(String text, HashMap<String, Integer> wordCount) {
        text = text.trim();
        text = text.replace("//w", " ");
        String[] words = text.split(" ");

        for (String i : words) {
            if (wordCount.containsKey(i)) {
                Integer newCount = wordCount.get(i) + 1;
                wordCount.put(i, newCount);
            } else {
                wordCount.put(i, 1);
            }

        }
        System.out.println("UNSORTED : " + wordCount);

        // TODO : sort wordcount (words in sorted wey)

    }

    public static void word(String text) {
        text = text.trim();
        text = text.replace("[.?!]", " ");
        text = text.trim();

        String[] word = text.split(" ");

        System.out.println("TOTAL WORDS : " + word.length);

    }

    public static void character(String text) {
        text = text.trim();

        System.out.println("TOTAL CHARACTER (with space) : " + text.length());
        text = text.replace(" ", "");

        text = text.replace("//w", "");
        text = text.trim();
        System.out.println("TOTAL CHARACTER (without space) : " + text.length());
    }

    public static void sentence(String text) {
        text = text.trim();

        String[] word = text.split("[.?!]");

        System.out.println("TOTAL SENTENCE : " + word.length);

    }

    public static void line(String text) {// TODO:count line YE NAHI HUAAA HAI BARABAR SE

        String trimedText = text.trim();
        String[] realText = trimedText.split("[\\n]");
        int countLine = 1;

        for (String singleText : realText) {
            if (singleText == "//n") {
                countLine += 1;
            }
        }
        System.out.println("TOTAL LINE : " + countLine);

    }

}
