package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class USUKSpellingEndDiffTwoTest {

    @Test
    void count() {
        USUKSpellingEndDiffTwo tester = new USUKSpellingEndDiffTwo();
        int count = tester.count("odour", new String[]{
                "the odour coming out of the left over food was intolerable",
                "ammonia has a very pungent odor"
        });
        assertEquals(2, count);
    }
    @Test
    void count1() {
        USUKSpellingEndDiffTwo tester = new USUKSpellingEndDiffTwo();
        int count = tester.count("savour", new String[]{
                "splendour wealth piece recognition savoury endeavour oil cannot reality fish",
                "sincere savor argument vigour chain awake cap surprising savoury jump",
                "natural study process immoral flag vigour habit assist candy pet",
                "shoulder aside slightly onto crash later disagreement savour rumour entrance",
                "splendour petrol unable inevitably crowd growth fasten leading responsibility artificially",
                "equally alarmed also knowledge ok splendor armory pick sale be",
                "activity rumour ending alcoholic savory curve splendour honestly enjoyable rumour",
                "determined used rumor union affair odor granddaughter elect endeavor alter",
                "savor hour enjoyable waiter divorce at mental prepared folding primary",
                "cheaply vegetable upon splendor disease savor it cast hear cardboard"
        });
        assertEquals(4, count);
    }
}