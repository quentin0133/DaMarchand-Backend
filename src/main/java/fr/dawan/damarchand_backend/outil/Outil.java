package fr.dawan.damarchand_backend.outil;



import fr.dawan.damarchand_backend.InventoryOutil.InventoryOutil;
import fr.dawan.damarchand_backend.item.Item;
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
public class Outil extends Item {
    private int durabilite;

    @OneToMany(mappedBy="outil")
    private List<InventoryOutil> inventoryOutil=new ArrayList<>();
}
