package com.hrank.regex.application.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectHtmlLinksTest {

    @Test
    void detect() {
        DetectHtmlLinks tester = new DetectHtmlLinks();
        String html = "<div class=\"portal\" role=\"navigation\" id='p-navigation'>\n" +
                "<h3>Navigation</h3>\n" +
                "<div class=\"body\">\n" +
                "<ul>\n" +
                "<li id=\"n-mainpage-description\"><a href=\"/wiki/Main_Page\" title=\"Visit the main page [z]\" accesskey=\"z\">Main page</a></li>\n" +
                "<li id=\"n-contents\"><a href=\"/wiki/Portal:Contents\" title=\"Guides to browsing Wikipedia\"><b>Contents</b></a></li>\n" +
                "<li id=\"n-featuredcontent\"><a href=\"/wiki/Portal:Featured_content\" title=\"Featured content  the best of Wikipedia\">Featured content</a></li>\n" +
                "<li id=\"n-currentevents\"><a href=\"/wiki/Portal:Current_events\" title=\"Find background information on current events\">Current events</a></li>\n" +
                "<li id=\"n-randompage\"><a href=\"/wiki/Special:Random\" title=\"Load a random article [x]\" accesskey=\"x\">Random article</a></li>\n" +
                "<li id=\"n-sitesupport\"><a href=\"//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&amp;utm_medium=sidebar&amp;utm_campaign=C13_en.wikipedia.org&amp;uselang=en\" title=\"Support us\">Donate to Wikipedia</a></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "</div>";
        tester.detect(html);
    }
    @Test
    void detect1() {
        DetectHtmlLinks tester = new DetectHtmlLinks();
        String html = "<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>\n" +
                "<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>";
        tester.detect(html);
    }
}
