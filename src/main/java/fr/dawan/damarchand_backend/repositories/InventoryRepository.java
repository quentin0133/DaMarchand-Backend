package fr.dawan.daMarchand_backend.repositories;

import fr.dawan.daMarchand_backend.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    @Query(value = "SELECT a FROM Inventory a")
    List<Inventory> findAllInventories();

    @Query(value = "SELECT a FROM Inventory a WHERE a.ville_id = 1")
    Inventory findVilleInventoryByNomVille(@Param("ville_nom") String ville_nom);
    //(SELECT b.id FROM Ville b WHERE b.nom =:ville_nom)
}