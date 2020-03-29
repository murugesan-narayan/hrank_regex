package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceCheckTest {

    @Test
    void validate() {
        SentenceCheck tester = new SentenceCheck();
        boolean valid = tester.validate("Hi Alex how are you doing");
        assertTrue(valid);
        valid = tester.validate("Good by Alex");
        assertFalse(valid);
    }
}