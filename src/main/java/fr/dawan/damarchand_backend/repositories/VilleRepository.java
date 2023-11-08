package fr.dawan.daMarchand_backend.repositories;


import fr.dawan.daMarchand_backend.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VilleRepository  extends JpaRepository<Ville, Long> {

    @Query(value = "SELECT a FROM Ville a")
    List<Ville> findAllVilles();
}