package com.hrank.regex.application.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSubWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentences = new String[n];
        for (int i=0;i<n;i++) {
            sentences[i] = sc.nextLine();
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<q;i++) {
            String sub = sc.nextLine();
            int count = 0;
            for(int j=0;j<n;j++) {
                Pattern pattern = Pattern.compile("(?<=\\w)("+sub+")(?=\\w)");
                Matcher matcher = pattern.matcher(sentences[j]);
                while (matcher.find()) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }

    public void findSubWord(String source, String sub) {
        Pattern pattern = Pattern.compile("(?<=\\w)("+sub+")(?=\\w)");
        Matcher matcher = pattern.matcher(source);
        int count = 0;
        while (matcher.find()) {
            count += 1;
        }
        System.out.println("count = " + count);
    }
}
