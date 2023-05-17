package com.sstl.service;

import com.sstl.pojo.Articles;
import com.sstl.pojo.Indexamount;

import java.util.List;

public interface SSTLService {
    List<Indexamount> getIndexAmount();
    List<Articles> selectSmallArticlesByTypeStr(String typestr);
    List<Articles> selectSmallArticlesBySubTypeStr(String subtypestr);
    List<Integer> selectArticlesIDByTypeStr(String typestr);
    Articles selectArticleByID(Integer id);
    Articles selectSmallArticleByID(Integer id);
    List<Articles> selectSmallArticlesNextFour(String typestr,Integer id);
    List<Articles> selectArticlesByTitle(String title);
}
