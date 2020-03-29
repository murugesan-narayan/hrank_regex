package com.hrank.regex.application.easy;

import com.hrank.regex.backref.easy.MatchingForwardRef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String ph = sc.nextLine();
            Pattern pattern = Pattern.compile("^(?<cc>\\d{1,3})[-\\s](?<lc>\\d{1,3})[-\\s](?<no>\\d{4,10})$");
            Matcher matcher = pattern.matcher(ph);
            while (matcher.find()) {
                System.out.println(String.join(",",
                    "CountryCode="+matcher.group("cc"),
                    "LocalAreaCode="+matcher.group("lc"),
                    "Number="+matcher.group("no")));
            }
        }
    }

    public String validate(String ph) {
        Pattern pattern = Pattern.compile("^(?<cc>\\d{1,3})[-\\s](?<lc>\\d{1,3})[-\\s](?<no>\\d{4,10})$");
        Matcher matcher = pattern.matcher(ph);
        if (matcher.find())
            return String.join(",",
                    "CountryCode="+matcher.group("cc"),
                    "LocalAreaCode="+matcher.group("lc"),
                    "Number="+matcher.group("no"));
        return null;
    }
}
