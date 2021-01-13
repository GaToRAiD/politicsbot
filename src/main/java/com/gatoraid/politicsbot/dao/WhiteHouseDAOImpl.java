package com.gatoraid.politicsbot.dao;


import com.gatoraid.politicsbot.entity.WhiteHouse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WhiteHouseDAOImpl implements WhiteHouseDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<WhiteHouse> getArticles() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<WhiteHouse> whiteHouseQuery = currentSession.createQuery("from whitehouse order by id", WhiteHouse.class);

        List<WhiteHouse> articles = whiteHouseQuery.getResultList();

        return articles;
    }

    @Override
    public WhiteHouse saveArticle(WhiteHouse theArticle) {

        Session currentSession = sessionFactory.getCurrentSession();
        System.out.println(currentSession);

        currentSession.saveOrUpdate(theArticle);

        return theArticle;
    }

    @Override
    public WhiteHouse getArticle(int theId) {

        Session currentSession = sessionFactory.getCurrentSession();

        WhiteHouse whiteHouse = currentSession.get(WhiteHouse.class, theId);

        return whiteHouse;
    }

    @Override
    public WhiteHouse getArticleByName(String articleName) {
        Session currentSession = sessionFactory.getCurrentSession();

        WhiteHouse whiteHouse = currentSession.get(WhiteHouse.class, articleName);

        return whiteHouse;
    }
}
