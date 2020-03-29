package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LatitudeLongitudeValidationTest {

    @Test
    void validate() {
        LatitudeLongitudeValidation tester = new LatitudeLongitudeValidation();
        boolean result = tester.validate("(75, 180)");
        assertTrue(result);
       result = tester.validate("(+90.0, -147.45)");
        assertTrue(result);
       result = tester.validate("(77.11112223331, 149.99999999)");
        assertTrue(result);
       result = tester.validate("(+90, +180)");
        assertTrue(result);
       result = tester.validate("(90, 180)");
        assertTrue(result);
       result = tester.validate("(-90.00000, -180.0000)");
        assertTrue(result);
    }

    @Test
    void validate_negative() {
        LatitudeLongitudeValidation tester = new LatitudeLongitudeValidation();
        boolean result = tester.validate("(75, 280)");
        assertFalse(result);
        result = tester.validate("(+190.0, -147.45)");
        assertFalse(result);
        result = tester.validate("(77.11112223331, 249.99999999)");
        assertFalse(result);
        result = tester.validate("(+90, +180.2)");
        assertFalse(result);
        result = tester.validate("(90., 180.)");
        assertFalse(result);
        result = tester.validate("(-090.00000, -180.0000)");
        assertFalse(result);
    }
}