package fr.dawan.damarchand_backend.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private long id;
    private int version;
    private String nom;
    private String emoji;
    private double prixBase;

}
