package com.gatoraid.politicsbot.service;

import com.gatoraid.politicsbot.dao.WhiteHouseDAO;
import com.gatoraid.politicsbot.entity.WhiteHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WhiteHouseServiceImpl implements WhiteHouseService{

    @Autowired
    private WhiteHouseDAO whiteHouseDAO;


    @Override
    @Transactional
    public List<WhiteHouse> getArticles() {
        return null;
    }

    @Override
    @Transactional
    public void saveArticle(WhiteHouse theArticle) {
        whiteHouseDAO.saveArticle(theArticle);
    }

    @Override
    @Transactional
    public WhiteHouse getArticle(int theId) {
        return whiteHouseDAO.getArticle(theId);
    }

    @Override
    @Transactional
    public WhiteHouse getArticleById(int theId) {
        return whiteHouseDAO.getArticle(theId);
    }

    @Override
    @Transactional
    public WhiteHouse getArticleByName(String articleName) {

        return whiteHouseDAO.getArticleByName(articleName);
    }
}
