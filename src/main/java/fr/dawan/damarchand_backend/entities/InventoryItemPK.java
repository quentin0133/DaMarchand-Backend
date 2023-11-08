package fr.dawan.daMarchand_backend.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class InventoryItemPK {
    private long inventoryId;
    private long itemId;

    public InventoryItemPK() {

    }

    public InventoryItemPK(long inventoryId, long itemId) {
        this.inventoryId = inventoryId;
        this.itemId = itemId;
    }
    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}
