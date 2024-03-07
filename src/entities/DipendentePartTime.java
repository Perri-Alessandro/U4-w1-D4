package entities;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary(int stipendio) {
        int oreLavorate = 80;
        return stipendio - (oreLavorate * 3);
    }
}
