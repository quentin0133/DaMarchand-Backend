package fr.dawan.daMarchand_backend.entities;

import fr.dawan.daMarchand_backend.Lieux;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Ville extends Lieux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    private List<Bourse> taux = new ArrayList<>();

    public Ville() {
    }

    public Ville(List<Bourse> taux,String nom) {
        this.taux = taux;
        super.setNom(nom);
        super.setType("VILLE");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Bourse> getTaux() {
        return taux;
    }

    public void setTaux(List<Bourse> taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "id=" + id +
                ", taux=" + taux +
                '}';
    }
}
