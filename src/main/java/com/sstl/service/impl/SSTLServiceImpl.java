package com.sstl.service.impl;

import com.sstl.dao.SSTLMapper;
import com.sstl.pojo.Articles;
import com.sstl.pojo.Indexamount;
import com.sstl.service.SSTLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SSTLServiceImpl implements SSTLService {

    @Autowired
    private SSTLMapper SSTLMapper;

    @Override
    public List<Indexamount> getIndexAmount() {
        return SSTLMapper.getIndexAmount();
    }

    @Override
    public List<Articles> selectSmallArticlesByTypeStr(String typestr) {
        return SSTLMapper.selectSmallArticlesByTypeStr(typestr);
    }

    @Override
    public List<Articles> selectSmallArticlesBySubTypeStr(String subtypestr) {
        return SSTLMapper.selectSmallArticlesBySubTypeStr(subtypestr);
    }

    @Override
    public List<Integer> selectArticlesIDByTypeStr(String typestr) {
        return SSTLMapper.selectArticlesIDByTypeStr(typestr);
    }

    @Override
    public Articles selectArticleByID(Integer id) {
        return SSTLMapper.selectArticleByID(id);
    }

    @Override
    public Articles selectSmallArticleByID(Integer id) {
        return SSTLMapper.selectSmallArticleByID(id);
    }

    @Override
    public List<Articles> selectSmallArticlesNextFour(String typestr, Integer id) {
        return SSTLMapper.selectSmallArticlesNextFour(typestr,id);
    }

    @Override
    public List<Articles> selectArticlesByTitle(String title) {
        return SSTLMapper.selectArticlesByTitle(title);
    }
}
