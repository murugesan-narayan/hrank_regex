package com.hrank.regex.application.easy;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLAttributes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder html = new StringBuilder();
        for (int i=0;i<n;i++) {
            html.append(sc.nextLine().trim());
        }
        Map<String, Set<String>> tags = new TreeMap<>();
        Pattern pattern = Pattern.compile("<\\s*(?<tag>\\w+)\\s*(?<attrs>[^>]*?)?(>|/>)");
        Matcher matcher = pattern.matcher(html.toString());
        while (matcher.find()) {
            String tag = matcher.group("tag");
            String attrs = matcher.group("attrs");
            Set<String> set = tags.getOrDefault(tag, new TreeSet<>());
            Pattern pat = Pattern.compile("(?<att>[a-z]+?)=[\"']");
            Matcher mat = pat.matcher(attrs);
            while (mat.find()) {
                set.add(mat.group("att"));
            }
            tags.put(tag, set);
        }
        tags.forEach((k, v) -> System.out.println(k + ":" + String.join(",", v)));
    }

    public void detectAttrs(String html) {
        Map<String, Set<String>> tags = new TreeMap<>();
        Pattern pattern = Pattern.compile("<\\s*(?<tag>\\w+)\\s*(?<attrs>[^>]*?)?(>|/>)");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            String tag = matcher.group("tag");
            String attrs = matcher.group("attrs");
            Set<String> set = tags.getOrDefault(tag, new TreeSet<>());
            Pattern pat = Pattern.compile("(?<att>[a-z]+?)=[\"']");
            Matcher mat = pat.matcher(attrs);
            while (mat.find()) {
                set.add(mat.group("att"));
            }
            tags.put(tag, set);
        }
        tags.forEach((k,v)-> System.out.println(k+":"+String.join(",", v)));
    }
}
