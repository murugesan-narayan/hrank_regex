package com.hrank.regex.intro.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnything {
    String testString = null;
    public void check(String pattern){


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        boolean match = m.matches();

        System.out.format("%s", match);
    }
}
