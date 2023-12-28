package fr.dawan.damarchand_backend.ville;

import fr.dawan.damarchand_backend.inventory.Inventory;
import fr.dawan.damarchand_backend.item.Item;
import fr.dawan.damarchand_backend.lieux.Lieu;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ville extends Lieu {

    private static String type = "ville";
    private String nom;

    @ManyToOne
    private Inventory inventaire;

    @Override
    public List<Item> chercher() {
        return null;
    }

    @Override
    public void continuer(int step) {

    }

    @Override
    public void combatre() {

    }
}
