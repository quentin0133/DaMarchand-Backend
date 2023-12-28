package fr.dawan.damarchand_backend.joueur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoueurDto {
    private long id;
    private int version;
    private int nombreLieuAvantVille;
    private String prochaineVille;
    private int marchandage;
    private int bucheronage;
    private int minage;
    private int prospection;
}
