package fr.dawan.damarchand_backend.ville;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VilleDto {
    private long id;
    private int version;
    private String type;
    private String nom;
}
