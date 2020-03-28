package com.hrank.regex.assertion.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeLookAheadTest {

    @Test
    void checker() {
        NegativeLookAhead tester = new NegativeLookAhead();
        tester.Test_String = "gooooo";
        tester.checker("(.)(?!\\1)");
    }
}