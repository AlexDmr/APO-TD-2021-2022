package uga.l3miage.apo.tdStaticEtException;

public class TestCompteException {
    public static void main(String[] args) {
        System.out.println("Liste des arguments: ");

        for (int no = 0; no < args.length; no++) {
            System.out.println("argument numéro " + no +  ": " + args[no]);
        }

        System.out.println("---- Premier Tableau ---");
        CompteException compte01 = new CompteException();
        try {
            compte01.setTable(args);
        } catch(NumberFormatException e) {
            System.out.println("Vous devez entrer des entiers au bon format...");
        }
        System.out.println("Tableau: " + compte01.toString());
        System.out.println("appelsMethodesClasse: " + CompteException.appelsMethodesClasse);
        System.out.println("appelsMethodesInstance: " + compte01.appelsMethodesInstance);

        System.out.println("---- Deuxième Tableau ---");
        CompteException compte02 = new CompteException();
        compte02.setTable(3);
        System.out.println("Tableau: " + compte02.toString());
        System.out.println("appelsMethodesClasse: " + CompteException.appelsMethodesClasse);
        System.out.println("appelsMethodesInstance: " + compte02.appelsMethodesInstance);

    }
}
