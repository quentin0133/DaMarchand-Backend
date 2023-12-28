package fr.dawan.damarchand_backend.lieux;


import fr.dawan.damarchand_backend.generic.BaseEntity;
import fr.dawan.damarchand_backend.item.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@MappedSuperclass
public abstract class Lieu extends BaseEntity{

    private String type;
    private String nom;

    public List<Item> chercher() {
        return null;
    }

    public void continuer(int step) {
    }

    public void combatre() {
    }
}
