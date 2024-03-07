package entities;

import Interfaces.Worker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Dipendente implements Worker {
    private int stipendio;
    private long matricola;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {

        Random genera = new Random();
        this.matricola = genera.nextInt(100000, 800000);
        Random stipendioo = new Random();
        this.stipendio = stipendioo.nextInt(1400, 3500);
        this.dipartimento = dipartimento;
    }

    public int getStipendio() {
        return stipendio;
    }

    public long getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract int calculateSalary();

    @Override
    public void checkIn(LocalDateTime time) {
        System.out.println("Sono un " + this.getClass().getSimpleName() + " e ho timbrato alle " + time.format(DateTimeFormatter.ISO_TIME));
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
