package service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WordCountService {
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

    public static void line(String text) {// TODO:YE NAHI HUAAA HAI BARABAR SE
        text = text.trim();
        String[] word = text.split("\\n");

        System.out.println("TOTAL LINE : " + word.length);
    }

    public static void wordFrequency(String text, HashMap<HashSet<String>, Integer> wordCount) {
        text = text.replace("[.?!]", " ");
        String[] word = text.split(" ");

        HashSet<String> set = new HashSet<>();
        Integer count = wordCount.get(set);
        count = 0;
        for (String i : word) {
            if (set.contains(i)) {
                count += 1;
            } else if (!set.contains(i)) {

                set = new HashSet<>(Arrays.asList(word));
                count = 1;
            }
            
        }
        System.out.println(set + " : " + count);

        // Integer[] count = wordCount.get(set);

        // for (String i : set) {

        // if (wordCount.containsKey(set)) {

        // } else if (!wordCount.containsKey(set)) {
        // wordCount.put(set, count);
        // }
        // System.out.println(i + " : " + count);

        // }

    }

}
