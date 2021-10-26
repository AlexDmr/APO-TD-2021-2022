package uga.l3miage.apo.td13;

import java.util.ArrayList;

public class FileAttenteGen<T> {
    private ArrayList<T> contenu;

    public FileAttenteGen() {
        contenu = new ArrayList<T>();
    }

    public void entre(T p) {
        contenu.add(p);
    }

    public boolean estVide() {
        return contenu.isEmpty();
    }
}
