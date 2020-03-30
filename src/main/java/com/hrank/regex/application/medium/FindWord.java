package com.hrank.regex.application.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {
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
            String word = sc.nextLine();
            Pattern pattern = Pattern.compile("(\\W|\\b)"+word+"(\\W|\\b)");
            int count = 0;
            for (String sentence : sentences) {
                Matcher matcher = pattern.matcher(sentence);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public int find(String word, String sentence) {
        Pattern pattern = Pattern.compile("(\\W|\\b)"+word+"(\\W|\\b)");
        Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
