package fr.dawan.daMarchand_backend.repositories;

import fr.dawan.daMarchand_backend.entities.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository  extends JpaRepository<Joueur, Long> {

    @Query(value = "SELECT a FROM Joueur a")
    List<Joueur> findAllJoueurs();
}