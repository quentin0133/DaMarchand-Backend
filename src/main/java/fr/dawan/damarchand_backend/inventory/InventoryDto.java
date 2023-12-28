package fr.dawan.damarchand_backend.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {
    private long id;
    private int version;
    private boolean hasHache;
    private boolean hasPioche;
    private int epee;
}
