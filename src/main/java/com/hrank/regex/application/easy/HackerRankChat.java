package com.hrank.regex.application.easy;

import java.util.Scanner;
//Find HackerRank
public class HackerRankChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String id = sc.nextLine();
            if (id.matches("^hackerrank$"))
                System.out.println(0);
           else if (id.matches("^hackerrank.*$"))
                System.out.println(1);
           else if (id.matches("^.*hackerrank$"))
                System.out.println(2);
           else System.out.println(-1);
        }
    }

    public int check(String chat) {
        int result = -1;
        if (chat.matches("^hackerrank$"))
            result = 0;
        else if (chat.matches("^hackerrank.*$"))
            result = 1;
        else if (chat.matches("^.*hackerrank$"))
            result = 2;
        return result;
    }
}
