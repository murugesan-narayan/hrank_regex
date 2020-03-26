package com.hrank.regex.backref.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingBackRefFailedGroupTest {

    @Test
    void checker() {
        MatchingBackRefFailedGroup tester = new MatchingBackRefFailedGroup();
        tester.Test_String = "12-34-56-87";//"12345678"
        tester.checker("^(?<g1>[\\d]{2})(?<g2>[-]?)([\\d]{2})\\k<g2>([\\d]{2})\\k<g2>([\\d]{2})$");
    }
}
