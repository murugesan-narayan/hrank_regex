package com.hrank.regex.group.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingNonCapt {
    String Test_String = "";
    public void checker(String Regex_Pattern){
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
}
