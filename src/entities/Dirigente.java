package entities;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary(int stipendio) {
        int bonus = 2500;
        return stipendio + bonus;
    }

}
