package voip.telecom.service;

import voip.telecom.model.Fournisseur;

import java.util.List;

public interface FournisseurService {

    public Fournisseur saveFournisseur(String name, String adresse, String siret);

    public Fournisseur updateFournisseur(long fournisseur_id, Fournisseur fournisseur);

    public Fournisseur deleteFournisseur(long fournisseur_id);

    public List<Fournisseur> getAllFournisseurs();
}
