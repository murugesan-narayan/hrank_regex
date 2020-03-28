package com.hrank.regex.assertion.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeLookBehindTest {

    @Test
    void checker() {
        NegativeLookBehind tester = new NegativeLookBehind();
        tester.Test_String = "1o1s";
        tester.checker("(?<![aeiouAEIOU])(.)");
    }
}