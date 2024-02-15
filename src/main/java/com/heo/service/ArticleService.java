package com.heo.service;

import com.heo.pojo.Article;
import com.heo.pojo.PageBean;

public interface ArticleService {
    void add(Article article);


    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
