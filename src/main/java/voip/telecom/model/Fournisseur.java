package voip.telecom.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String adresse;
    private String siret;
    @OneToMany(mappedBy="fournisseur")
    private Collection<Categorie> categories;

    public Fournisseur() {
        super();
    }

    public Fournisseur(String name, String adresse, String siret) {
        this.name = name;
        this.adresse = adresse;
        this.siret = siret;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getSiret() {
        return siret;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }


}