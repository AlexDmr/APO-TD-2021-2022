package uga.l3miage.apo.tdPokemon;

import java.util.ArrayList;

public class CollectionPokemons {
    private ArrayList<Pokemon> liste;

    CollectionPokemons() {
        this.liste = new ArrayList<>();
    }

    public void ajouter(Pokemon p) {
        this.liste.add(p);
    }

    public double vitesseMoyenne() {
        double V = 0.0;

        for(Pokemon p: liste) {
            V += p.vitesse();
        }

        return V / liste.size();
    }
}
