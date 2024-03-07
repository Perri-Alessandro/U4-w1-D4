package entities;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary() {
        return this.getStipendio();
    }
}
