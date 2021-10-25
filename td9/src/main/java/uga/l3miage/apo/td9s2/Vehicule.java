package uga.l3miage.apo.td9s2;

class Vehicule {
    private double vitesse;
    private int passagers;

    Vehicule(double vitesse, int passagers) {
        this.setVitesse(vitesse);
        this.setPassagers(passagers);
    }

    @Override
    public String toString() {
        return "Vehicule: [vitesse: " + vitesse + "km/h, passagers: " + passagers + "]";
    }

    public double getVitesse() {
        return this.vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = Math.max(0, vitesse);
    }

    public int getPassagers() {
        return this.passagers;
    }

    public void setPassagers(int passagers) {
        this.passagers = Math.max(1, passagers);
    }
}
