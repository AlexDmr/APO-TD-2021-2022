package uga.l3miage.apo.tdPokemon;

public class PokemonMer extends PokemonMarin {
    PokemonMer(String nom, double poids, int nbNageoires) {
        super(nom, poids, nbNageoires);
    }

    public double vitesse() {
        return this.getPoids() / 25 * this.getNbNageoires();
    }
}
