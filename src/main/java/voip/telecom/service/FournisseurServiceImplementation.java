package voip.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voip.telecom.dao.FournisseurRepository;
import voip.telecom.model.Categorie;
import voip.telecom.model.Fournisseur;

import java.util.List;

@Service
public class FournisseurServiceImplementation implements  FournisseurService {

    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur saveFournisseur(String name, String adresse, String siret) {
        Fournisseur fournisseur = new Fournisseur(name, adresse, siret);
        fournisseurRepository.save(fournisseur);
        return fournisseur;
    }

    @Override
    public Fournisseur updateFournisseur(long fournisseur_id, Fournisseur fournisseur) {
        Fournisseur fournisseurToUpdate = fournisseurRepository.findById(fournisseur_id).get();
        fournisseurToUpdate.setName(fournisseur.getName());
        fournisseurToUpdate.setAdresse(fournisseur.getAdresse());
        fournisseurToUpdate.setSiret(fournisseur.getSiret());
        fournisseurRepository.save(fournisseurToUpdate);

        return fournisseurToUpdate;
    }

    @Override
    public Fournisseur deleteFournisseur(long fournisseur_id) {
        Fournisseur fournisseur = fournisseurRepository.getById(fournisseur_id);
        fournisseurRepository.delete(fournisseur);
        return fournisseur;
    }

    @Override
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }
}
