package com.gatoraid.politicsbot.WebScrapper;

import com.gatoraid.politicsbot.entity.WhiteHouse;
import com.gatoraid.politicsbot.service.WhiteHouseService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WhiteHouseScraper {
    private String baseURL = "https://www.whitehouse.gov/presidential-actions/page/";
    private int page = 1;

    WebScraper whiteHouseScraper = new WebScraper();
    private WhiteHouseService whiteHouseService;


    public String getAllPages() throws IOException {
        while(true){
            String webpage = baseURL + page;
            whiteHouseScraper.setWebURL(webpage);
            whiteHouseScraper.getWebURL();
            whiteHouseScraper.getWebReturn();
            HashMap<String, String> currentPage = whiteHouseScraper.getArticles();
            for(Map.Entry<String, String> entry : currentPage.entrySet())
                whiteHouseService.saveArticle();
            page++;
        }
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
