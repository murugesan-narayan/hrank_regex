package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePANTest {

    @Test
    void validate() {
        ValidatePAN tester = new ValidatePAN();
        boolean valid = tester.validate("ABCDS1234Y");
        assertTrue(valid);
        valid = tester.validate("ABAB12345Y");
        assertFalse(valid);
        valid = tester.validate("avCDS1234Y");
        assertFalse(valid);
    }
}