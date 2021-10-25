package uga.l3miage.apo.tdPokemon;

public abstract class Pokemon {
    private String nom;
    private double poids;

    Pokemon(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return this.poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public abstract double vitesse();
    public abstract String toString();
}
