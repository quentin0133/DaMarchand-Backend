package fr.dawan.daMarchand_backend.entities;

import jakarta.persistence.*;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Sauvegarde du lieu
    private int nombreLieuAvantVille;
    private String prochaineVille;

    //Competences
    private int marchandage;
    private int bucheronage;
    private int minage;
    private int prospection;

    // Inventaire
    @ManyToOne
    private Inventory inventaire;


    public Joueur() {
    }

    public Joueur(int nombreLieuAvantVille, String prochaineVille, int marchandage, int bucheronage, int minage, int prospection, Inventory inventaire) {
        this.nombreLieuAvantVille = nombreLieuAvantVille;
        this.prochaineVille = prochaineVille;
        this.marchandage = marchandage;
        this.bucheronage = bucheronage;
        this.minage = minage;
        this.prospection = prospection;
        this.inventaire = inventaire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNombreLieuAvantVille() {
        return nombreLieuAvantVille;
    }

    public void setNombreLieuAvantVille(int nombreLieuAvantVille) {
        this.nombreLieuAvantVille = nombreLieuAvantVille;
    }

    public String getProchaineVille() {
        return prochaineVille;
    }

    public void setProchaineVille(String prochaineVille) {
        this.prochaineVille = prochaineVille;
    }

    public int getMarchandage() {
        return marchandage;
    }

    public void setMarchandage(int marchandage) {
        this.marchandage = marchandage;
    }

    public int getBucheronage() {
        return bucheronage;
    }

    public void setBucheronage(int bucheronage) {
        this.bucheronage = bucheronage;
    }

    public int getMinage() {
        return minage;
    }

    public void setMinage(int minage) {
        this.minage = minage;
    }

    public int getProspection() {
        return prospection;
    }

    public void setProspection(int prospection) {
        this.prospection = prospection;
    }

    public Inventory getInventaire() {
        return inventaire;
    }

    public void setInventaire(Inventory inventaire) {
        this.inventaire = inventaire;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", nombreLieuAvantVille=" + nombreLieuAvantVille +
                ", prochaineVille='" + prochaineVille + '\'' +
                ", marchandage=" + marchandage +
                ", bucheronage=" + bucheronage +
                ", minage=" + minage +
                ", prospection=" + prospection +
                ", inventaire=" + inventaire +
                '}';
    }
}
