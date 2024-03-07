package entities;

import java.util.Random;

public abstract class Dipendente {
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
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
