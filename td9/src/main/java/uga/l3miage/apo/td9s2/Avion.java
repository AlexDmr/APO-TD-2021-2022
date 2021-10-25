package uga.l3miage.apo.td9s2;

class Avion extends Vehicule {
    private int moteurs;

    Avion(double vitesse, int passagers, int moteurs) {
        super(vitesse, passagers);
        this.setMoteurs(moteurs);
    }


    public int getMoteurs() {
        return this.moteurs;
    }

    public void setMoteurs(int moteurs) {
        this.moteurs = Math.min(8, Math.max(1, moteurs));
    }

    @Override
    public void setVitesse(double vitesse) {
        super.setVitesse( Math.min(1000, vitesse) );
    }

    @Override
    public void setPassagers(int passagers) {
        super.setPassagers( Math.min(200, Math.max(5, passagers) ) );
    }

    @Override
    public String toString() {
        return "Avion: [vitesse: " + getVitesse() + "km/h, passagers: " + getPassagers() + ", moteurs: " + moteurs + "]";
    }
}
