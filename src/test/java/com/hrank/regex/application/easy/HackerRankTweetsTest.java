package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackerRankTweetsTest {

    @Test
    void count() {
        String[] arr = new String[]{
                "I love #hackerrank",
        "I just scored 27 points in the Picking Cards challenge on #HackerRank",
        "I just signed up for summer cup @hackerrank",
        "interesting talk by hari, co-founder of hackerrank",
        };
        HackerRankTweets tester = new HackerRankTweets();
        int count = 0;
        for (String tweet : arr) {
            count += tester.count(tweet);
        }
        assertEquals(4, count);
    }
}