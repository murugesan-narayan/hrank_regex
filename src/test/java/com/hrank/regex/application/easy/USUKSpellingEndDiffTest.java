package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class USUKSpellingEndDiffTest {

    @Test
    void count() {
        USUKSpellingEndDiff tester = new USUKSpellingEndDiff();
        int count = tester.count("familiarize", new String[]{
                "hackerrank has such a good ui that it takes no time to familiarise its environment",
                "to familiarize oneself with ui of hackerrank is easy"
        });
        assertEquals(2, count);
    }
}