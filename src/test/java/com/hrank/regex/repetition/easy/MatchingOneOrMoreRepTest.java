package com.hrank.regex.repetition.easy;

import com.hrank.regex.repetition.easy.MatchingOneOrMoreRep;
import org.junit.jupiter.api.Test;

class MatchingOneOrMoreRepTest {

    @Test
    void checker() {
        MatchingOneOrMoreRep tester = new MatchingOneOrMoreRep();
        tester.Test_String="1Qa";
        tester.checker("^[\\d]+[A-Z]+[a-z]+$");
    }
}