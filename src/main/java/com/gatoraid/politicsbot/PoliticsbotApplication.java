package com.gatoraid.politicsbot;

import com.gatoraid.politicsbot.WebScrapper.WhiteHouseScraper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PoliticsbotApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(PoliticsbotApplication.class, args);

        //Initial Startup
        WhiteHouseScraper whiteHouseScraper = new WhiteHouseScraper();
        whiteHouseScraper.getAllPages();
    }

}
