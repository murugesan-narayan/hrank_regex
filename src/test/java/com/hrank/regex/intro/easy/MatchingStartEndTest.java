package com.hrank.regex.intro.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingStartEndTest {

    @Test
    void checker() {
        MatchingStartEnd me = new MatchingStartEnd();
        me.Test_String="3_myn.";
        me.checker("^\\d\\w{4}\\.$");
    }
}