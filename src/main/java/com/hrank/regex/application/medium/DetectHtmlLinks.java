package com.hrank.regex.application.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlLinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder html = new StringBuilder();
        for (int i=0;i<n;i++) {
            html.append(sc.nextLine().trim());
        }
        Pattern pattern = Pattern.compile("<a\\s.*?href=\"(?<link>.*?)\".*?(>(?<text>.*?)</a>|/>)");
        Matcher a_matcher = pattern.matcher(html.toString());
        while (a_matcher.find()) {
            String link = a_matcher.group("link").trim();
            String t = a_matcher.group("text");
            String text = t==null? "": t.replaceAll("<.*?>","").trim();
            System.out.println(String.join(",", link, text));
        }
    }

    public void detect(String html) {
        Pattern pattern = Pattern.compile("<a\\s.*?href=\"(?<link>.*?)\".*?(>(?<text>.*?)</a>|/>)");
        Matcher a_matcher = pattern.matcher(html);
        while (a_matcher.find()) {
            String link = a_matcher.group("link");
            String text = a_matcher.group("text").replaceAll("<.*?>","");
            System.out.println(String.join(",", link, text));
        }
    }
}
