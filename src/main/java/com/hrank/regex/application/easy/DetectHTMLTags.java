package com.hrank.regex.application.easy;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLTags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new TreeSet<>();
        for(int i=0;i<n;i++) {
            String s = sc.nextLine();
            Pattern pattern = Pattern.compile("<\\s*(\\w+).*?(>|/>)");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                set.add(matcher.group(1));
            }
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext())
                System.out.print(";");
        }
    }

    public void detectTags(String s) {
        Pattern pattern = Pattern.compile("<\\s*(\\w+).*?(>|/>)");
        Matcher matcher = pattern.matcher(s);
        Set<String> set = new TreeSet<>();
        while (matcher.find()) {
            set.add(matcher.group(1));
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext())
                System.out.print(";");
        }
    }
}
