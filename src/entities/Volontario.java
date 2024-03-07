package entities;

import Interfaces.Worker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Volontario implements Worker {
    private final String nome;
    private final int età;
    private final String cv;

    public Volontario(String nome, int età, String cv) {
        this.nome = nome;
        this.età = età;
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", età=" + età +
                ", cv='" + cv + '\'' +
                '}';
    }

    @Override
    public void checkIn(LocalDateTime time) {
        System.out.println("SONO UN " + this.getClass().getSimpleName() + ", HO TIMBRATO ALLE " + time.format(DateTimeFormatter.ISO_TIME));
    }
}
