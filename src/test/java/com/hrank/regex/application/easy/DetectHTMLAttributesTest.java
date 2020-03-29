package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectHTMLAttributesTest {

    @Test
    void detectTags() {
        DetectHTMLAttributes tester = new DetectHTMLAttributes();
        tester.detectAttrs("<li style=\"-moz-float-edge: content-box\">... that " +
                "<a href=\"/wiki/Orval_Overall\" title=\"Orval Overall\">Orval Overall</a> " +
                "<i>(pictured)</i> is the only <b>" +
                "<a href=\"/wiki/List_of_Major_League_Baseball_pitchers_who_have_struck_out_four_" +
                "batters_in_one_inning\" title=\"List of Major League Baseball pitchers who have " +
                "struck out four batters in one inning\">Major League Baseball player to strike out " +
                "four batters in one inning</a></b> in the " +
                "<a href=\"/wiki/World_Series\" title=\"World Series\">World Series</a>?</li>\n" +
                "<li style=\"-moz-float-edge: content-box\">... that the three cities of the <b>" +
                "<a href=\"/wiki/West_Triangle_Economic_Zone\" title=\"West Triangle Economic Zone\">" +
                "West Triangle Economic Zone</a></b> contribute 40% of Western China's GDP?</li>\n" +
                "<li style=\"-moz-float-edge: content-box\">... that <i>" +
                "<a href=\"/wiki/Kismet_(1943_film)\" title=\"Kismet (1943 film)\">Kismet</a></i>, directed by " +
                "<b><a href=\"/wiki/Gyan_Mukherjee\" title=\"Gyan Mukherjee\">Gyan Mukherjee</a></b>, ran at the " +
                "<a href=\"/wiki/Roxy_Cinema_(Kolkata)\" title=\"Roxy Cinema (Kolkata)\">Roxy, Kolkata</a>, " +
                "for 3 years and 8 months?</li>\n" +
                "<li style=\"-moz-float-edge: content-box\">... that " +
                "<a href=\"/wiki/Vauix_Carter\" title=\"Vauix Carter\">Vauix Carter</a> both coached and " +
                "played for the <b><a href=\"/wiki/1882_Navy_Midshipmen_football_team\" title=\"1882 Navy " +
                "Midshipmen football team\">1882 Navy Midshipmen football team</a></b>?</li>\n" +
                "<li style=\"-moz-float-edge: content-box\">... that <a href=\"/wiki/Zhu_Chenhao\" " +
                "title=\"Zhu Chenhao\">Zhu Chenhao</a> was sentenced to <a href=\"/wiki/Slow_slicing\" " +
                "title=\"Slow slicing\">slow slicing</a> for leading the <b>" +
                "<a href=\"/wiki/Prince_of_Ning_rebellion\" title=\"Prince of Ning rebellion\">" +
                "Prince of Ning rebellion</a></b> against the <a href=\"/wiki/Ming_Dynasty\" " +
                "title=\"Ming Dynasty\">Ming Dynasty</a> <a href=\"/wiki/Zhengde_Emperor\" " +
                "title=\"Zhengde Emperor\">emperor Zhengde</a>?</li>\n" +
                "<li style=\"-moz-float-edge: content-box\">... that <b><a href=\"/wiki/Mirza_Adeeb\" " +
                "title=\"Mirza Adeeb\">Mirza Adeeb</a></b> was a prominent modern Pakistani " +
                "<a href=\"/wiki/Urdu\" title=\"Urdu\">Urdu</a> playwright whose later work focuses " +
                "on social problems and daily life?</li>\n" +
                "<li style=\"-moz-float-edge: content-box\">... that in <i><b>" +
                "<a href=\"/wiki/La%C3%9Ft_uns_sorgen,_la%C3%9Ft_uns_wachen,_BWV_213\" " +
                "title=\"Lat uns sorgen, lat uns wachen, BWV 213\">Die Wahl des Herkules</a></b></i>" +
                ", Hercules must choose between the good cop and the bad cop?<br style=\"clear:both;\" />\n" +
                "<div style=\"text-align: right;\" class=\"noprint\"><b>" +
                "<a href=\"/wiki/Wikipedia:Recent_additions\" title=\"Wikipedia:Recent additions\">Archive</a>" +
                "</b>  <b><a href=\"/wiki/Wikipedia:Your_first_article\" " +
                "title=\"Wikipedia:Your first article\">Start a new article</a></b>  " +
                "<b><a href=\"/wiki/Template_talk:Did_you_know\" " +
                "title=\"Template talk:Did you know\">Nominate an article</a></b></div>\n" +
                "</li>");
    }
    @Test
    void detectTags1() {
        DetectHTMLAttributes tester = new DetectHTMLAttributes();
        tester.detectAttrs("<div class=\"portal\" role=\"navigation\" id='p-navigation'>\n" +
                "<h3>Navigation</h3>\n" +
                "<div class=\"body\">\n" +
                "<ul>\n" +
                "<li id=\"n-mainpage-description\"><a href=\"/wiki/Main_Page\" title=\"Visit the main page [z]\" accesskey=\"z\">Main page</a></li>\n" +
                "<li id=\"n-contents\"><a href=\"/wiki/Portal:Contents\" title=\"Guides to browsing Wikipedia\">Contents</a></li>\n" +
                "<li id=\"n-featuredcontent\"><a href=\"/wiki/Portal:Featured_content\" title=\"Featured content  the best of Wikipedia\">Featured content</a></li>\n" +
                "<li id=\"n-currentevents\"><a href=\"/wiki/Portal:Current_events\" title=\"Find background information on current events\">Current events</a></li>\n" +
                "<li id=\"n-randompage\"><a href=\"/wiki/Special:Random\" title=\"Load a random article [x]\" accesskey=\"x\">Random article</a></li>\n" +
                "<li id=\"n-sitesupport\"><a href=\"//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&amp;utm_medium=sidebar&amp;utm_campaign=C13_en.wikipedia.org&amp;uselang=en\" title=\"Support us\">Donate to Wikipedia</a></li>\n" +
                "</ul>\n" +
                "</div>");
    }

}