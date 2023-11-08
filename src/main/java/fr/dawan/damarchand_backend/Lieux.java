package fr.dawan.daMarchand_backend;

import fr.dawan.daMarchand_backend.entities.Item;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@MappedSuperclass
public abstract class Lieux {

    private String type;
    private String nom;

    public List<Item> chercher() { return null; }
    public void continuer(int step) {}
    public void combatre() {}
}
