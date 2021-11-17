package voip.telecom.service;

import voip.telecom.model.Article;
import voip.telecom.model.Categorie;

import java.util.List;

public interface ArticleService {

    public Article saveArticle(String titre, String contenu, double prix, Long categorie_id);

    public Article updateArticle(long artice_id, Article article);

    public Article deleteArticle(long article_id);

    public List<Article> getAllArticles();
}
