package com.hrank.regex.application.medium;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class DetectDomainNameTest {

    @Test
    void detect() {
        DetectDomainName tester = new DetectDomainName();
        String lines = "<div class=\"reflist\" style=\"list-style-type: decimal;\">\n" +
                "<ol class=\"references\">\n" +
                "<li id=\"cite_note-1\"><span class=\"mw-cite-backlink\"><b>^ [\"Train (noun)\"](http://www.askoxford.com/concise_oed/train?view=uk). <i>(definition – Compact OED)</i>. Oxford University Press<span class=\"reference-accessdate\">. Retrieved 2008-03-18</span>.</span><span title=\"ctx_ver=Z39.88-2004&rfr_id=info%3Asid%2Fen.wikipedia.org%3ATrain&rft.atitle=Train+%28noun%29&rft.genre=article&rft_id=http%3A%2F%2Fwww.askoxford.com%2Fconcise_oed%2Ftrain%3Fview%3Duk&rft.jtitle=%28definition+%E2%80%93+Compact+OED%29&rft.pub=Oxford+University+Press&rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Ajournal\" class=\"Z3988\"><span style=\"display:none;\"> </span></span></span></li>\n" +
                "<li id=\"cite_note-2\"><span class=\"mw-cite-backlink\"><b>^</b></span> <span class=\"reference-text\"><span class=\"citation book\">Atchison, Topeka and Santa Fe Railway (1948). <i>Rules: Operating Department</i>. p. 7.</span><span title=\"ctx_ver=Z39.88-2004&rfr_id=info%3Asid%2Fen.wikipedia.org%3ATrain&rft.au=Atchison%2C+Topeka+and+Santa+Fe+Railway&rft.aulast=Atchison%2C+Topeka+and+Santa+Fe+Railway&rft.btitle=Rules%3A+Operating+Department&rft.date=1948&rft.genre=book&rft.pages=7&rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook\" class=\"Z3988\"><span style=\"display:none;\"> </span></span></span></li>\n" +
                "<li id=\"cite_note-3\"><span class=\"mw-cite-backlink\"><b>^ [Hydrogen trains](http://www.hydrogencarsnow.com/blog2/index.php/hydrogen-vehicles/i-hear-the-hydrogen-train-a-comin-its-rolling-round-the-bend/)</span></li>\n" +
                "<li id=\"cite_note-4\"><span class=\"mw-cite-backlink\"><b>^ [Vehicle Projects Inc. Fuel cell locomotive](http://www.bnsf.com/media/news/articles/2008/01/2008-01-09a.html)</span></li>\n" +
                "<li id=\"cite_note-5\"><span class=\"mw-cite-backlink\"><b>^</b></span> <span class=\"reference-text\"><span class=\"citation book\">Central Japan Railway (2006). <i>Central Japan Railway Data Book 2006</i>. p. 16.</span><span title=\"ctx_ver=Z39.88-2004&rfr_id=info%3Asid%2Fen.wikipedia.org%3ATrain&rft.au=Central+Japan+Railway&rft.aulast=Central+Japan+Railway&rft.btitle=Central+Japan+Railway+Data+Book+2006&rft.date=2006&rft.genre=book&rft.pages=16&rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook\" class=\"Z3988\"><span style=\"display:none;\"> </span></span></span></li>\n" +
                "<li id=\"cite_note-6\"><span class=\"mw-cite-backlink\"><b>^ [\"Overview Of the existing Mumbai Suburban Railway\"](http://web.archive.org/web/20080620033027/http://www.mrvc.indianrail.gov.in/overview.htm). _Official webpage of Mumbai Railway Vikas Corporation_. Archived from [the original](http://www.mrvc.indianrail.gov.in/overview.htm) on 2008-06-20<span class=\"reference-accessdate\">. Retrieved 2008-12-11</span>.</span><span title=\"ctx_ver=Z39.88-2004&rfr_id=info%3Asid%2Fen.wikipedia.org%3ATrain&rft.atitle=Overview+Of+the+existing+Mumbai+Suburban+Railway&rft.genre=article&rft_id=http%3A%2F%2Fwww.mrvc.indianrail.gov.in%2Foverview.htm&rft.jtitle=Official+webpage+of+Mumbai+Railway+Vikas+Corporation&rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Ajournal\" class=\"Z3988\"><span style=\"display:none;\"> </span></span></span></li>\n" +
                "</ol>\n" +
                "</div>";
        Set<String> emailIds = tester.detect(lines);
        Set<String> expected = new TreeSet<>(
                Set.of("askoxford.com","bnsf.com","hydrogencarsnow.com","mrvc.indianrail.gov.in","web.archive.org"));
        assertIterableEquals(expected, emailIds);
    }

}