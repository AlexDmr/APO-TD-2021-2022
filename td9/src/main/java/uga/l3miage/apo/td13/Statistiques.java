package uga.l3miage.apo.td13;

public class Statistiques<T extends Evaluable> { // Mon type paramétrique (type générique) étend Evaluable (T est une esèce d'Evaluable)
    private T[] tab;

    private T min() {
        T min = tab[0];
        for(int i = 1; i < tab.length; i++) {
            if (tab[i].valeur() < min.valeur()) {
                min = tab[i];
            }
        }
        return min;
    }

    public double moyenne() {
        double moyenne = 0;
        for(T e: tab) {
            moyenne += e.valeur();
        }
        return moyenne / tab.length;
    }
}
