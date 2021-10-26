package uga.l3miage.apo.td13;

public class Personne {
    private String nom;
    private int age;

    public Personne() {}
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
