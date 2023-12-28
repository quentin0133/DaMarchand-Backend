package fr.dawan.damarchand_backend.inventory;


import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
