package fr.dawan.damarchand_backend.InventoryOutil;

import jakarta.persistence.Embeddable;

@Embeddable
public class InventoryOutilPK {
    private long inventoryId;
    private long outilId;

    public InventoryOutilPK() {

    }

    public InventoryOutilPK(long inventoryId, long outilId) {
        this.inventoryId = inventoryId;
        this.outilId = outilId;
    }
    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public long getOutilId() {
        return outilId;
    }

    public void setOutilId(long outilId) {
        this.outilId = outilId;
    }
}
