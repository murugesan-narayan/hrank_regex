package com.hrank.regex.application.easy;

import java.util.Scanner;

public class LatitudeLongitudeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String pair = sc.nextLine();
            boolean valid = pair.matches("^\\(" +
                    "([+-]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?))" +
                    ",\\s" +
                    "([+-]?((1[0-7]|[1-9])?\\d(\\.\\d+)?|180(\\.0+)?))" +
                    "\\)$");
            System.out.println(valid?"Valid":"Invalid");
        }
    }

    public boolean validate(String pair) {
        return pair.matches("^\\(" +
                "([+-]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?))" +
                ",\\s" +
                "([+-]?((1[0-7]|[1-9])?\\d(\\.\\d+)?|180(\\.0+)?))" +
                "\\)$");
    }
}
