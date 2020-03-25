package com.hrank.regex.intro.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingAnythingTest {

    @Test
    void check() {
        MatchingAnything tester = new MatchingAnything();
        tester.testString = "123.456.abc.def";
        tester.check(".{3}\\..{3}\\..{3}\\..{3}");
    }
}
