package fr.dawan.damarchand_backend.entities;


import fr.dawan.damarchand_backend.Lieux;
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


    @ManyToOne
    private Inventory inventaire;

    public Ville() {
    }

    public Ville(String nom) {
        super.setNom(nom);
        super.setType("VILLE");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Ville{" +
                "id=" + id +
                '}';
    }
}
