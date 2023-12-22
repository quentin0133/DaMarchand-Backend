package fr.dawan.damarchand_backend.repositories;

import fr.dawan.damarchand_backend.entities.Inventory;
import fr.dawan.damarchand_backend.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    @Query(value = "SELECT a FROM Inventory a")
    List<Inventory> findAllInventories();

   @Query(value = "SELECT a FROM Inventory a WHERE a.ville = :ville")
    Inventory findVilleInventory(@Param("ville") Ville ville);
    //(SELECT b.id FROM Ville b WHERE b.nom =:ville_nom) /// @Param("ville_nom") String ville_nom

    @Query(value = "SELECT a FROM Inventory a WHERE a.ville.nom=:ville_name")
    Inventory findVilleInventoryByName(@Param("ville_name") String ville_name);
}