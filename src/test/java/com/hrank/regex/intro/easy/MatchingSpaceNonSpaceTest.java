package com.hrank.regex.intro.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingSpaceNonSpaceTest {

    @Test
    void checker() {
        MatchingSpaceNonSpace mw = new MatchingSpaceNonSpace();
        mw.Test_String = "65 72 aa";
        mw.checker("\\S{2}\\s\\S{2}\\s\\S{2}");
    }
}