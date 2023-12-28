package fr.dawan.damarchand_backend.inventory;



import fr.dawan.damarchand_backend.InventoryItem.InventoryItem;
import fr.dawan.damarchand_backend.InventoryOutil.InventoryOutil;
import fr.dawan.damarchand_backend.generic.BaseEntity;
import fr.dawan.damarchand_backend.joueur.Joueur;
import fr.dawan.damarchand_backend.ville.Ville;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory extends BaseEntity {

    private int coins;

    @ManyToOne
    private Ville ville;

    @ManyToOne
    private Joueur joueur;



    @OneToMany(mappedBy="inventoryItem")
    private List<InventoryItem> items = new ArrayList<>();

    @OneToMany(mappedBy="inventoryOutil")
    private List<InventoryOutil> outils = new ArrayList<>();
}
