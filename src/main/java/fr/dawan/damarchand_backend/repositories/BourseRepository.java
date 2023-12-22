package fr.dawan.damarchand_backend.repositories;


import fr.dawan.damarchand_backend.entities.Bourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BourseRepository  extends JpaRepository<Bourse, Long> {

    @Query(value = "SELECT a FROM Bourse a")
    List<Bourse> findAllBourses();
}
