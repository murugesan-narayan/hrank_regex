package com.hrank.regex.application.medium;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectEmailAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new TreeSet<>();
        for (int i=0;i<n;i++) {
            String line = sc.nextLine();
            Pattern pattern = Pattern.compile("(?<=\\s|\\b)([\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,5})(?=\\s|\\b)");
            Matcher a_matcher = pattern.matcher(line);
            while (a_matcher.find()) {
                set.add(a_matcher.group());
            }
        }
        System.out.println(String.join(";", set));
    }

    public Set<String> detect(String lines) {
        Pattern pattern = Pattern.compile("(?<=\\s|\\b)([\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,5})(?=\\s|\\b)");
        Matcher a_matcher = pattern.matcher(lines);
        Set<String> set = new TreeSet<>();
        while (a_matcher.find()) {
            set.add(a_matcher.group());
        }
        return set;
    }
}
