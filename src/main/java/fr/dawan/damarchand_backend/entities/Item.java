package fr.dawan.daMarchand_backend.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String emoji;
    private double prixBase;

    @OneToMany(mappedBy="item")
    private List<InventoryItem> inventories=new ArrayList<>();

    public Item() {
    }

    public Item(String nom, String emoji, double prixBase) {
        this.nom = nom;
        this.emoji = emoji;
        this.prixBase = prixBase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public double getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(double prixBase) {
        this.prixBase = prixBase;
    }
}
