package uga.l3miage.apo.tdPokemon;

public class PokemonSportif extends PokemonTerre {
    private double freq;

    PokemonSportif(String nom, double poids, int nbP, double taille, double f) {
        super(nom, poids, nbP, taille);
        this.freq = f;
    }

    public double getFreq() {
        return this.freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

}
