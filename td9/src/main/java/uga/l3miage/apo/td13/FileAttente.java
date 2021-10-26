package uga.l3miage.apo.td13;

import java.util.ArrayList;

public class FileAttente {
    protected ArrayList<Personne> contenu;

    public FileAttente() {
        contenu = new ArrayList<>();
    }

    public void entre(Personne p) {
        contenu.add(p);
    }

    public boolean estVide() {
        return contenu.isEmpty();
    }
}