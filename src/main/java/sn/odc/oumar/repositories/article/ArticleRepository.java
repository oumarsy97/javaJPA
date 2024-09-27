package sn.odc.oumar.repositories.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.odc.oumar.entities.Article;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    // Tu peux ajouter des méthodes personnalisées si nécessaire
    public Article findByLibelle(String libelle) ;
}