package uga.l3miage.apo.tdPokemon;

public abstract class PokemonTerre extends Pokemon {
    private int nbP;
    private double taille;

    PokemonTerre(String nom, double poids, int nbP, double taille) {
        super(nom, poids);
        this.nbP = nbP;
        this.taille = taille;
    }

    @Override
    public double vitesse() {
        return this.getTaille() * 3 * this.getNbPattes();
    }

    public int getNbPattes() {
        return this.nbP;
    }

    public void setNbPattes(int nbP) {
        this.nbP = nbP;
    }

    public double getTaille() {
        return this.taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

}
