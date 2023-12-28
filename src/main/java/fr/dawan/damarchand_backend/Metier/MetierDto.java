package fr.dawan.damarchand_backend.Metier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetierDto {
    private long id;
    private int version;
    private String nom;
    private String emoji;
    private double prixBase;

}
