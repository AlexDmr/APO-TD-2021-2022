package uga.l3miage.apo.tdPokemon;

public class PokemonCroisiere extends PokemonMarin {
    PokemonCroisiere(String nom, double poids, int nbNageoires) {
        super(nom, poids, nbNageoires);
    }

    public double vitesse() {
        return (this.getPoids() / 25 * this.getNbNageoires()) / 2;
    }

    public String toString() {
        return "à faire";
    }
}
