package sn.odc.oumar.repositories.article;

import sn.odc.oumar.entities.Article;

public interface IArticleService {
     Article saveArticle(Article article);
     Article getClientById(int id);
     void deleteArticle(int id);
     Iterable<Article> findAllArticle();

}
