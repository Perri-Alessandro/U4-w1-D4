package entities;

import Interfaces.Worker;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("LISTA DIPENDENTI");
        Dipendente[] dipendenti = new Dipendente[Dipartimento.values().length];

        for (int i = 0; i < Dipartimento.values().length; i++) {
            if (i % 3 == 0) {
                dipendenti[i] = new DipendentePartTime(Dipartimento.values()[i]);
            } else if (i % 3 == 1) {
                dipendenti[i] = new DipendenteFullTime(Dipartimento.values()[i]);
            } else {
                dipendenti[i] = new Dirigente(Dipartimento.values()[i]);
            }
        }
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente);
        }

        for (Dipendente dipendente : dipendenti) {
            System.out.println("MATRICOLA " + dipendente.getMatricola());
        }

        dipendenti[0].setDipartimento(Dipartimento.PRODUZIONE);
        System.out.println("CAMBIATO DIPARTIMENTO DI PRIMO DIPENDENTE " + dipendenti[0]);

        Dipendente[] tipiDiDipendente = new Dipendente[3];


        tipiDiDipendente[0] = new DipendentePartTime(Dipartimento.PRODUZIONE);
        tipiDiDipendente[1] = new DipendenteFullTime(Dipartimento.VENDITE);
        tipiDiDipendente[2] = new Dirigente(Dipartimento.AMMINISTRAZIONE);

        Dirigente dirigente = new Dirigente(Dipartimento.AMMINISTRAZIONE);
        DipendenteFullTime fullTime = new DipendenteFullTime(Dipartimento.VENDITE);
        DipendentePartTime partTime = new DipendentePartTime(Dipartimento.PRODUZIONE);

        System.out.println("NUOVI DIPENDENTI");
        for (Dipendente dipendente : tipiDiDipendente) {
            System.out.println("STIPENDIO: " + dipendente.calculateSalary() + " - reparto: " + dipendente.getDipartimento() + " - matricola: " + dipendente.getMatricola());
        }

        double sommaStipendi = 0.0;

        for (int i = tipiDiDipendente.length - 3; i < tipiDiDipendente.length; i++) {
            sommaStipendi += tipiDiDipendente[i].calculateSalary();
        }

        System.out.println("SOMMA STIPENDI ULTIMI 3 DIPENDENTI: " + sommaStipendi);


        Volontario volontario = new Volontario("Aldo Rossi", 24, "Full Stack dev");
        Worker[] workers = {dirigente, fullTime, partTime, volontario};

        for (Worker worker : workers) {
            worker.checkIn(LocalDateTime.now());
        }
    }
}

