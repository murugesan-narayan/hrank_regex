package com.hrank.regex.application.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifyProgLangTest {

    @Test
    void detect() {
        IdentifyProgLang tester = new IdentifyProgLang();
        tester.detect("# let us create a test string\n" +
                "\n" +
                "testString1 = \"Hello World!\"\n" +
                "\n" +
                "print \"Original String: \"+ testString1");
    }
}