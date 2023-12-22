package fr.dawan.damarchand_backend.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Inventory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean hasHache;
    private boolean hasPioche;

    private int epee;

    @ManyToOne
    private Ville ville;

    @ManyToOne
    private Joueur joueur;



    @OneToMany(mappedBy="inventory")
    private List<InventoryItem> items = new ArrayList<>();


    public Inventory() {
    }

    public Inventory(boolean hasHache, boolean hasPioche, int epee) {
        this.hasHache = hasHache;
        this.hasPioche = hasPioche;
        this.epee = epee;
    }

    public Inventory(boolean hasHache, boolean hasPioche, int epee, Ville ville) {
        this.hasHache = hasHache;
        this.hasPioche = hasPioche;
        this.epee = epee;
        this.ville = ville;
    }

    public Inventory(boolean hasHache, boolean hasPioche, int epee, Joueur joueur) {
        this.hasHache = hasHache;
        this.hasPioche = hasPioche;
        this.epee = epee;
        this.joueur = joueur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHasHache() {
        return hasHache;
    }

    public void setHasHache(boolean hasHache) {
        this.hasHache = hasHache;
    }

    public boolean isHasPioche() {
        return hasPioche;
    }

    public void setHasPioche(boolean hasPioche) {
        this.hasPioche = hasPioche;
    }

    public int getEpee() {
        return epee;
    }

    public void setEpee(int epee) {
        this.epee = epee;
    }


    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", hasHache=" + hasHache +
                ", hasPioche=" + hasPioche +
                ", epee=" + epee +
                '}';
    }
}
