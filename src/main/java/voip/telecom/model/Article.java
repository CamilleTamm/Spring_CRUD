package voip.telecom.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String titre;
    private String contenu;
    private double prix;
    @ManyToOne
    private Categorie categorie;

    public Article() {
        super();
    }

    public Article(String titre, String contenu, double prix, Categorie categorie) {
        this.titre= titre;
        this.contenu = contenu;
        this.prix= prix;
        this.categorie = categorie;
    }

    public Long getId() {
        return id;
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

    public Categorie getCategorie() { return categorie; }

    public void setId(Long id) {
        this.id = id;
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

    public void setCategorie(Categorie categorie) { this.categorie = categorie;}

}