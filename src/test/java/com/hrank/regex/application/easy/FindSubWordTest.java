package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSubWordTest {

    @Test
    void findSubWord() {
        FindSubWord tester = new FindSubWord();
        String source = "existing pessimist optimist this is";
        String sub = "is";
        tester.findSubWord(source, sub);
    }
}