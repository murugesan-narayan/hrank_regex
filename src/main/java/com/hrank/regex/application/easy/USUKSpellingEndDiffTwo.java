package com.hrank.regex.application.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USUKSpellingEndDiffTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentences = new String[n];
        for (int i=0;i<n;i++) {
            sentences[i] = sc.nextLine();
        }
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<t;i++) {
            String us_word = sc.nextLine();
            String word = us_word.substring(0, us_word.lastIndexOf('o'));
            String rem = us_word.substring(us_word.lastIndexOf("our")+3);
            Pattern pattern = Pattern.compile("\\b"+word+"ou?r"+rem+"\\b");
            int count = 0;
            for (String uk_sentence : sentences) {
                Matcher matcher = pattern.matcher(uk_sentence);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public int count(String us_word, String[] sentences) {
        String word = us_word.substring(0, us_word.lastIndexOf('o'));
        String rem = us_word.substring(us_word.lastIndexOf("our")+3);
        Pattern pattern = Pattern.compile("\\b"+word+"ou?r"+rem+"\\b");
        int count = 0;
        for (String uk_sentence : sentences) {
            Matcher matcher = pattern.matcher(uk_sentence);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}
