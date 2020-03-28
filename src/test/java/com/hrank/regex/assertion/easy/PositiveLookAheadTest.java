package com.hrank.regex.assertion.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveLookAheadTest {

    @Test
    void checker() {
        PositiveLookAhead tester = new PositiveLookAhead();
        tester.Test_String = "gooooo!";
        tester.checker("(o)(?=o{2})");
    }
}