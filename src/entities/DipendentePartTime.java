package entities;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary() {
        int oreLavorate = 80;
        return this.getStipendio() - (oreLavorate * 3);
    }
}
