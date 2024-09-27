package sn.odc.oumar.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.odc.oumar.entities.Article;
import sn.odc.oumar.repositories.article.ArticleRepository;

import java.util.List;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article save(Article article) {
        return articleRepository.save(article);
    }

    public Article getArticleById(int id) {  // Utilisez Long ici
        return articleRepository.findById(id).orElse(null);
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public void deleteArticle(int id) {  // Utilisez Long ici
        articleRepository.deleteById(id);
    }



}
