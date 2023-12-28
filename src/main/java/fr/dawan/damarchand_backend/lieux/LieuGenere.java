package fr.dawan.damarchand_backend.lieux;

public class LieuGenere extends Lieu {
    private boolean secondaryJobb;
    public LieuGenere (String type, String nom, boolean secondaryJobb) {
       this.setType(type);
       this.setNom(nom);
       this.secondaryJobb=secondaryJobb;
    }
}
