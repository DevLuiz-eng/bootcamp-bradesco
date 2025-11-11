package abstraindoBootcamp.domain;

import abstraindoBootcamp.service.Bootcamp;

public class Curso implements CalcularXP {

    private String titulo;
    private String descricao;
    private double cargaHoraria;
    Bootcamp bootcamp;

    public Curso(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
        bootcamp.getCursos().add(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
