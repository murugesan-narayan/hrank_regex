package com.hrank.regex.repetition.easy;

import com.hrank.regex.repetition.easy.MatchingRepetitionsRanges;
import org.junit.jupiter.api.Test;

class MatchingRepetitionsRangesTest {

    @Test
    void checker() {
        MatchingRepetitionsRanges tester = new MatchingRepetitionsRanges();
        tester.Test_String="3threeormorealphabets.";
        tester.checker("^[0-9]{1,2}[a-zA-Z]{3,}[.]{0,3}$");
    }
}