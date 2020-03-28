package com.hrank.regex.assertion.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveLookBehindTest {

    @Test
    void checker() {
        PositiveLookBehind tester = new PositiveLookBehind();
        tester.Test_String = "123Go!";
        tester.checker("(?<=[13579])(\\d)");
    }
}