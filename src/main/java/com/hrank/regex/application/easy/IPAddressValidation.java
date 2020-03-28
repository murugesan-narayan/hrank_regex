package com.hrank.regex.application.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String ip = sc.nextLine();
            //String IPv4_PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
            String IPv4_PATTERN = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";
            String IPv6_PATTERN = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";
            if (ip.matches(IPv4_PATTERN)) {
                System.out.println("IPv4");
            } else if (ip.matches(IPv6_PATTERN)) {
                System.out.println("IPv6");
            } else {
                System.out.println("Neither");
            }
        }
    }

    public void validate(String ip) {
        String IPv4_PATTERN = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";
        String IPv6_PATTERN = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";
        if (ip.matches(IPv4_PATTERN)) {
            System.out.println("IPv4");
        } else if (ip.matches(IPv6_PATTERN)) {
            System.out.println("IPv6");
        } else {
            System.out.println("Neither");
        }
    }
}
