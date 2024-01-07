package com.backend.cricketinfo.configuration;


import com.backend.cricketinfo.entity.MatchDetails;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CricketUpdateConfig {

    private static final String webstieUrl = "https://www.espncricinfo.com/live-cricket-match-results";

    private List<MatchDetails> getAllMatchDetails() throws IOException {
        Document document = Jsoup.connect(webstieUrl).get();
        Elements elements = document.select("");
    }

}
