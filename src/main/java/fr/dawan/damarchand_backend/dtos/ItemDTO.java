package fr.dawan.damarchand_backend.dtos;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {


    private long id;
    private String nom;
    private String emoji;
    private double prixBase;

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

    @Override
    public String toString() {
        return emoji + " " + nom + " " + prixBase + "\n";
    }
}

