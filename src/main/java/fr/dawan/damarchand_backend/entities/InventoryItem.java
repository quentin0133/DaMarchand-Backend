package fr.dawan.damarchand_backend.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class InventoryItem {

    @EmbeddedId
    private InventoryItemPK id= new InventoryItemPK();

    @ManyToOne
    @MapsId("inventoryId")
    private Inventory inventory;

    @ManyToOne
    @MapsId("itemId")
    private Item item;

    private int amount;

    public InventoryItem() {

    }

    public InventoryItem(Inventory inventory, Item item, int amount) {
        this.inventory = inventory;
        this.item = item;
        this.amount = amount;
    }

    public InventoryItemPK getId() {
        return id;
    }

    public void setId(InventoryItemPK id) {
        this.id = id;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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
                ", inventory=" + inventory +
                ", item=" + item +
                ", amount=" + amount +
                '}';
    }
}
