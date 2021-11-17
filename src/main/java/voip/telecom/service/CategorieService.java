package voip.telecom.service;

import voip.telecom.model.Categorie;

import java.util.List;

public interface CategorieService {

    public Categorie saveCategorie(String titre);

    public Categorie updateCategorie(long categorie_id, Categorie categorie);

    public Categorie deleteCategorie(long categorie_id);

    public List<Categorie> getAllCategories();
}
