package fr.dawan.damarchand_backend.bourse;


import fr.dawan.damarchand_backend.generic.BaseEntity;
import fr.dawan.damarchand_backend.item.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bourse extends BaseEntity {

    private Double taux;

    @ManyToOne
    private Item item;
}
