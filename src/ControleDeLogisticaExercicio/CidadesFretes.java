package ControleDeLogisticaExercicio;

public class CidadesFretes {
    private String nomeEstado;
    private double fretes;

    // Construtor: O "molde" para criar o objeto
    public CidadesFretes(String nomeEstado, double fretes) {
        this.nomeEstado = nomeEstado;
        this.fretes = fretes;
    }

    // Getters e Setters
    public String getNomeEstado() {
        return nomeEstado;
    }

    public double getFretes() {
        return fretes;
    }

    public void setFretes(double fretes) {
        this.fretes = fretes;
    }
}