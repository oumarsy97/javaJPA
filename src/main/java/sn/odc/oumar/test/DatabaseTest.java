package sn.odc.oumar.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sn.odc.oumar.config.JpaConfig;
import sn.odc.oumar.entities.Article;
import sn.odc.oumar.services.ArticleService;

import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DatabaseTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        ArticleService articleService = context.getBean(ArticleService.class);

        Article articleEntity = new Article();


        articleEntity.setPrix(350F);
        articleEntity.setLibelle("Pomme");
        articleEntity.setQte(50);

        articleService.save(articleEntity);
        Collection<Article> articles = articleService.findAll();
        System.out.println("All articles: "+articles.size());

        articles.forEach(System.out::println);
        Article updatedArticle = articleService.save( articleEntity);


    }
}