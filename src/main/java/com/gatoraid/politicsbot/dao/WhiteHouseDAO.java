package com.gatoraid.politicsbot.dao;

import com.gatoraid.politicsbot.entity.WhiteHouse;

import java.util.List;

public interface WhiteHouseDAO {
    public List<WhiteHouse> getArticles();

    public WhiteHouse saveArticle(WhiteHouse theArticle);

    public WhiteHouse getArticle(int theId);

    public WhiteHouse getArticleByName(String articleName);
}
