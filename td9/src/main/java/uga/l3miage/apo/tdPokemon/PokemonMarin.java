package uga.l3miage.apo.tdPokemon;

public abstract class PokemonMarin extends Pokemon {
    private int nbNageoires;

    PokemonMarin(String nom, double poids, int nbNageoires) {
        super(nom, poids);
        this.nbNageoires = nbNageoires;
    }

    public int getNbNageoires() {
        return this.nbNageoires;
    }

    public void setNbNageoires(int nbNageoires) {
        this.nbNageoires = nbNageoires;
    }
}
