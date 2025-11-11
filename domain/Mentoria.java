package abstraindoBootcamp.domain;

import abstraindoBootcamp.service.Bootcamp;

import java.time.LocalDate;

public class Mentoria implements CalcularXP{

    private String titulo;
    private String descricao;
    LocalDate dataMentoria;
    Bootcamp bootcamp;

    public Mentoria(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
        bootcamp.getMentorias().add(this);

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

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }
}
