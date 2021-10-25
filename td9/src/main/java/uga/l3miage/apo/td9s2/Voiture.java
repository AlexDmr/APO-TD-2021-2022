package uga.l3miage.apo.td9s2;

class Voiture extends Vehicule {
    private int portieres;

    Voiture(double vitesse, int passagers, int portieres) {
        super(vitesse, passagers);
        this.setPortieres(portieres);
    }


    public int getPortieres() {
        return this.portieres;
    }

    public void setPortieres(int portieres) {
        this.portieres = Math.min(5, Math.max(1, portieres));
    }

    @Override
    public void setVitesse(double vitesse) {
        super.setVitesse( Math.min(250, vitesse) );
    }

    @Override
    public void setPassagers(int passagers) {
        super.setPassagers( Math.min(8, passagers ) );
    }

    @Override
    public String toString() {
        return "Voiture: [vitesse: " + getVitesse() + "km/h, passagers: " + getPassagers() + ", portieres: " + portieres + "]";
    }
}
