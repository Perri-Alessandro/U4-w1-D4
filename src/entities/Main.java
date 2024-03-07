package entities;

public class Main {
    public static void main(String[] args) {

        System.out.println("LISTA DIPENDENTI");
        Dipendente[] dipendenti = new Dipendente[Dipartimento.values().length];

        for (int i = 0; i < Dipartimento.values().length; i++) {
            dipendenti[i] = new Dipendente(Dipartimento.values()[i]);
        }

        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente);
        }

        for (Dipendente dipendente : dipendenti) {
            System.out.println("MATRICOLA " + dipendente.getMatricola());
        }

        dipendenti[0].setDipartimento(Dipartimento.PRODUZIONE);
        System.out.println("CAMBIATO DIPARTIMENTO DI PRIMO DIPENDENTE " + dipendenti[0]);
    }
}
