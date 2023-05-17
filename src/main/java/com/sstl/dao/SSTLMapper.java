package com.sstl.dao;

import com.sstl.pojo.Articles;
import com.sstl.pojo.Indexamount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SSTLMapper {

    @Select("SELECT * FROM indexamount order by id asc")
    List<Indexamount> getIndexAmount();

    @Select("select id,title,createdate,showimage,subtypestr from articles where typestr = #{typestr} order by id desc")
    List<Articles> selectSmallArticlesByTypeStr(String typestr);

    @Select("select id,title,createdate,showimage,subtypestr from articles where subtypestr = #{subtypestr} order by id desc")
    List<Articles> selectSmallArticlesBySubTypeStr(String subtypestr);

    @Select("select id from articles where typestr = #{typestr} order by id desc")
    List<Integer> selectArticlesIDByTypeStr(String typestr);

    @Select("select * from articles where id = #{id}")
    Articles selectArticleByID(Integer id);

    @Select("select id,title,createdate,showimage,typestr,subtypestr from articles where id = #{id}")
    Articles selectSmallArticleByID(Integer id);

    @Select("select id,title,createdate,showimage,typestr,subtypestr from articles where typestr = #{typestr} and id < #{id} order by id desc")
    List<Articles> selectSmallArticlesNextFour(String typestr,Integer id);

    @Select("select id,title,createdate,showimage,typestr,subtypestr from articles where title like #{title} order by id desc")
    List<Articles> selectArticlesByTitle(String title);
}
