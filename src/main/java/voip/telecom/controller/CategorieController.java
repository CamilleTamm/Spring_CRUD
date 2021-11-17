package voip.telecom.controller;

import org.springframework.web.bind.annotation.*;
import voip.telecom.model.Categorie;
import voip.telecom.service.CategorieService;

@RequestMapping("crud")
@CrossOrigin("*")
@RestController
public class CategorieController {

    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @PostMapping("/saveCategorie")
    public Categorie addCategorie(@RequestBody  Categorie categorie){
        return  categorieService.saveCategorie(categorie.getTitre());
    }
}
