package com.hrank.regex.group.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapturingNonCaptTest {

    @Test
    void checker() {
        CapturingNonCapt tester = new CapturingNonCapt();
        tester.Test_String = "okokok! cya";
        tester.checker("(ok){3,}");
    }
}