package fr.dawan.damarchand_backend.Metier;



import fr.dawan.damarchand_backend.InventoryItem.InventoryItem;
import fr.dawan.damarchand_backend.generic.BaseEntity;
import jakarta.persistence.Entity;
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
public class Metier extends BaseEntity {
    private String nom;
    private int experience;

}
