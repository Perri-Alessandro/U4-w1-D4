package entities;

import java.util.Random;

public class Dipendente {
    private long matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {

        Random genera = new Random();
        this.matricola = genera.nextInt(100000, 800000);
        Random stipendioo = new Random();
        this.stipendio = stipendioo.nextInt(1400, 3500);
        this.dipartimento = dipartimento;
    }

    public long getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
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
