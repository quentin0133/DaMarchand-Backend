package fr.dawan.damarchand_backend.outil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutilDto {
    private long id;
    private int version;
    private String nom;
    private String emoji;
    private double prixBase;

}
