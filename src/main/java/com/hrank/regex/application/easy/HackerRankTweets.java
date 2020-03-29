package com.hrank.regex.application.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i=0;i<n;i++) {
            String tweet = sc.nextLine();
            Pattern pattern = Pattern.compile("hackerrank", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(tweet);
            while(matcher.find()) count++;
        }
        System.out.println(count);
    }

    public int count(String tweet) {
        Pattern pattern = Pattern.compile("hackerrank", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(tweet);
        int count = 0;
        while(matcher.find()) count++;
        return count;
    }
}
