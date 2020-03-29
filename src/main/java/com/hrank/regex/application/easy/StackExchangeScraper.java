package com.hrank.regex.application.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StackExchangeScraper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext())
            sb.append(sc.nextLine().trim());
        Pattern pattern = Pattern.compile(
                "id=\"question-summary-(?<id>\\d+?)\"" +
                        ".+?href=\"/questions/\\1/.+?>(?<text>.+?)<" +
                        ".+?class=\"relativetime\">(?<time>.+?)<");
        Matcher matcher = pattern.matcher(sb.toString());
        while(matcher.find())
            System.out.println(matcher.group("id")+";"
                    +matcher.group("text")+";"
                    +matcher.group("time"));
    }

    public List<String> list(StringBuilder sb) {
        Pattern pattern = Pattern.compile(
                        "id=\"question-summary-(?<id>\\d+?)\"" +
                        ".+?href=\"/questions/\\1/.+?>(?<text>.+?)<" +
                        ".+?class=\"relativetime\">(?<time>.+?)<");
        Matcher matcher = pattern.matcher(sb.toString());
        List<String> list = new ArrayList<>();
        while(matcher.find()) {
            list.add(matcher.group("id")+";"
                    +matcher.group("text")+";"
                    +matcher.group("time"));
        }
        return list;
    }
}
