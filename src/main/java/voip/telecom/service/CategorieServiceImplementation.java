package voip.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voip.telecom.dao.CategorieRepository;
import voip.telecom.model.Article;
import voip.telecom.model.Categorie;

import java.util.List;

@Service
public class CategorieServiceImplementation implements CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie saveCategorie(String titre) {
        Categorie categorie = new Categorie(titre);
        categorieRepository.save(categorie);
        return categorie;
    }

    @Override
    public Categorie updateCategorie(long categorie_id, Categorie categorie) {
        Categorie categorieToUpdate = categorieRepository.findById(categorie_id).get();
        categorieToUpdate.setTitre(categorie.getTitre());
        categorieRepository.save(categorieToUpdate);

        return categorieToUpdate;
    }

    @Override
    public Categorie deleteCategorie(long categorie_id) {
        Categorie categorie = categorieRepository.getById(categorie_id);
        categorieRepository.delete(categorie);
        return categorie;
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }
}
