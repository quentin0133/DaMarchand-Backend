package fr.dawan.damarchand_backend.joueur;


import fr.dawan.damarchand_backend.generic.BaseEntity;
import fr.dawan.damarchand_backend.inventory.Inventory;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Joueur extends BaseEntity {

    // Sauvegarde du lieu
    private int nombreLieuAvantVille;
    private String prochaineVille;

    //Competences
    private int marchandage;
    private int prospection;
    //private int bucheronage;
    //private int minage;


    // Inventaire
    @ManyToOne
    private Inventory inventaire;
}
