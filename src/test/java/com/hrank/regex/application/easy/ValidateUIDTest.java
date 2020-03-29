package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUIDTest {

    @Test
    void validate() {
        ValidateUID tester = new ValidateUID();
        boolean valid = tester.validate("abc012333ABCDEEEE");
        assertTrue(valid);
        valid = tester.validate("0123AB");
        assertFalse(valid);

    }
}