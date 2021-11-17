package voip.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voip.telecom.dao.ArticleRepository;
import voip.telecom.dao.CategorieRepository;
import voip.telecom.model.Article;
import voip.telecom.model.Categorie;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImplementation implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Article saveArticle(String titre, String contenu, double prix, Long categorie_id) {
        System.out.println(categorie_id);

        //Categorie categorie = categorieRepository.getById(categorie_id);

        Article article = new Article(titre, contenu, prix, null);
        articleRepository.save(article);
        return article;
    }

    @Override
    public Article updateArticle(long article_id, Article article) {
        Article articleToUpdate = articleRepository.findById(article_id).get();
        articleToUpdate.setTitre(article.getTitre());
        articleToUpdate.setContenu(article.getContenu());
        articleToUpdate.setPrix(article.getPrix());
        articleToUpdate.setCategorie(article.getCategorie());
        articleRepository.save(articleToUpdate);

        return articleToUpdate;
    }

    @Override
    public Article deleteArticle(long article_id) {
        System.out.println("deleteing id : " + article_id);

        Article article = articleRepository.getById(article_id);
        //articleRepository.delete(article);
        return article;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
}
