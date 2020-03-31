package com.hrank.regex.application.medium;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyComments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append("\n").append(sc.nextLine().trim());
        }
        Pattern pattern = Pattern.compile("(//.*|/\\*[^/]*?/)", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(sb.toString());
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public void detect(String lines) {
        Pattern pattern = Pattern.compile("(//.*|/\\*[^/]*?/)", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(lines);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
