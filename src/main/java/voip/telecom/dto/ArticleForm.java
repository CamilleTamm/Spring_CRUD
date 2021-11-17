package voip.telecom.dto;

import voip.telecom.model.Categorie;

import javax.persistence.ManyToOne;

public class ArticleForm {

    private String titre;
    private String contenu;
    private double prix;
    private long categorie_id;

    public ArticleForm(String titre, String contenu, double prix, long categorie_id) {
        this.titre = titre;
        this.contenu = contenu;
        this.prix = prix;
        this.categorie_id = categorie_id;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public double getPrix() {
        return prix;
    }

    public long getCategorie_id() {
        return categorie_id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setCategorie_id(long categorie_id) {
        this.categorie_id = categorie_id;
    }
}
