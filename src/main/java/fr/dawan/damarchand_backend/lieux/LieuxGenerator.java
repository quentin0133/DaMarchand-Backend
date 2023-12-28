package fr.dawan.damarchand_backend.lieux;

import java.util.Random;

import static java.lang.Math.random;

public class LieuxGenerator {
    private int seed;

    public Lieu generateLieux() {
        seed= (int) Math.random() % 3;
        if (seed == 0) {
            return new LieuGenere("foret","Chemin de Foret",secondaryJobbPresent());
        } else if (seed == 1) {
            return new LieuGenere("montagne","Chemin de Montagne",secondaryJobbPresent());
        } else {
            return new LieuGenere("foret","Clairière egaree",secondaryJobbPresent());

        }
    }
    private boolean secondaryJobbPresent(){
        seed= (int) Math.random() % 2;
        if (seed == 1) {
            return false;
        } else {
            return true;
        }
    }

}
