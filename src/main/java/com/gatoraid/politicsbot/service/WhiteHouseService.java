package com.gatoraid.politicsbot.service;

import com.gatoraid.politicsbot.entity.WhiteHouse;


import java.util.List;

public interface WhiteHouseService {

    public List<WhiteHouse> getArticles();

    public void saveArticle(WhiteHouse theArticle);

    public WhiteHouse getArticle(int theId);

    WhiteHouse getArticleById(int theId);

    public WhiteHouse getArticleByName(String articleName);

}
