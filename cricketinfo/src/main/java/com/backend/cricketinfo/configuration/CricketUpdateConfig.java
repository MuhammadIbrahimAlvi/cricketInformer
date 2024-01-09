package com.backend.cricketinfo.configuration;


import com.backend.cricketinfo.entity.MatchDetails;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CricketUpdateConfig {

    private static final String webstieUrl = "https://www.espncricinfo.com/live-cricket-match-results";

    private static final String QUICK_CLASS_ID = "?quick_class_id=";

    private static List<MatchDetails> getAllMatchDetails() throws IOException {

        Document document = Jsoup.connect(webstieUrl).get();

        Elements elements = document.select("div.ds-w-full").select("div.ds-px-4.ds-py-3");

        return new ArrayList<>();
    }

    private static List<MatchDetails> getAllMatchDetailsAccordingToMatchType(List<String> matchType) throws IOException {

        Document document = Jsoup
                .connect(webstieUrl + QUICK_CLASS_ID + matchType.stream().reduce(String::concat))
                .get();

        return new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        getAllMatchDetails();
    }
}
