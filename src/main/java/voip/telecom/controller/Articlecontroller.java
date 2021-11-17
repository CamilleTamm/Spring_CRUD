package voip.telecom.controller;

import org.springframework.web.bind.annotation.*;
import voip.telecom.dto.ArticleForm;
import voip.telecom.model.Article;
import voip.telecom.service.ArticleService;

@RequestMapping("crud")
@CrossOrigin("*")
@RestController
public class Articlecontroller {

    private ArticleService articleService;

    public Articlecontroller(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/saveArticle")
    public Article addArticle(@RequestBody ArticleForm articleForm){
        return  articleService.saveArticle(articleForm.getTitre(), articleForm.getContenu(), articleForm.getPrix(), articleForm.getCategorie_id());
    }

    @PostMapping("/deleteArticle")
    public Article deleteArticle(@RequestBody long article_id) {
        return articleService.deleteArticle(article_id);
    }
}
