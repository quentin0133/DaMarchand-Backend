package fr.dawan.damarchand_backend.repositories;



import fr.dawan.damarchand_backend.entities.Item;
import fr.dawan.damarchand_backend.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VilleRepository extends JpaRepository<Ville, Long> {

    @Query(value = "SELECT a FROM Ville a")
    List<Ville> findAllVilles();

    @Query(value = "SELECT a FROM Ville a WHERE a.nom =:ville_name")
    Ville getVilleFromName(@Param("ville_name") String ville_name);

}