package fr.dawan.damarchand_backend.InventoryItem;


import fr.dawan.damarchand_backend.inventory.Inventory;
import fr.dawan.damarchand_backend.item.Item;
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
    private Inventory inventoryItem;

    @ManyToOne
    @MapsId("itemId")
    private Item item;

    private int amount;

    public InventoryItem() {

    }

    public InventoryItem(Inventory inventoryItem, Item item, int amount) {
        this.inventoryItem = inventoryItem;
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
        return inventoryItem;
    }

    public void setInventory(Inventory inventoryItem) {
        this.inventoryItem = inventoryItem;
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
                ", inventory=" + inventoryItem +
                ", item=" + item +
                ", amount=" + amount +
                '}';
    }
}
