package fr.dawan.daMarchand_backend.entities;

import jakarta.persistence.*;

@Entity
public class Bourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Item item;
    private Double taux;

    public Bourse() {

    }

    public Bourse(Item item, Double taux) {
        this.item = item;
        this.taux = taux;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Bourse{" +
                "id=" + id +
                ", item=" + item +
                ", taux=" + taux +
                '}';
    }
}
