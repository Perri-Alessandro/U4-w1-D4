package entities;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary() {
        int bonus = 2500;
        return this.getStipendio() + bonus;
    }

}
