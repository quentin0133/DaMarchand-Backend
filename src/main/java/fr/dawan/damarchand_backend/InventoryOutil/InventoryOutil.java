package fr.dawan.damarchand_backend.InventoryOutil;


import fr.dawan.damarchand_backend.inventory.Inventory;
import fr.dawan.damarchand_backend.item.Item;
import fr.dawan.damarchand_backend.outil.Outil;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class InventoryOutil {

    @EmbeddedId
    private InventoryOutilPK id= new InventoryOutilPK();

    @ManyToOne
    @MapsId("inventoryId")
    private Inventory inventoryOutil;

    @ManyToOne
    @MapsId("outilId")
    private Outil outil;

    private int amount;

    public InventoryOutil() {

    }

    public InventoryOutil(Inventory inventoryOutil, Outil outil, int amount) {
        this.inventoryOutil = inventoryOutil;
        this.outil = outil;
        this.amount = amount;
    }

    public InventoryOutilPK getId() {
        return id;
    }

    public void setId(InventoryOutilPK id) {
        this.id = id;
    }

    public Inventory getInventory() {
        return inventoryOutil;
    }

    public void setInventory(Inventory inventoryOutil) {
        this.inventoryOutil = inventoryOutil;
    }

    public Item getOutil() {
        return outil;
    }

    public void setOutil(Outil outil) {
        this.outil = outil;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", inventory=" + inventoryOutil +
                ", outil=" + outil +
                ", amount=" + amount +
                '}';
    }
}
