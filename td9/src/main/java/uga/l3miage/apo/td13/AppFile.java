package uga.l3miage.apo.td13;

/**
 * Hello world!
 *
 */
public class AppFile {
    public static void main(String[] args) {
        FileAttenteGen<Personne> fifo = new FileAttenteGen<>();
        fifo.entre( new Personne() );
        fifo.entre( new Personne() );
        fifo.entre( new Personne("Bob", 23) );
        fifo.entre( new Personne() );

        System.out.println(3.0/2);
    }
}
