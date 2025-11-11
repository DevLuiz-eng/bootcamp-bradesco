package abstraindoBootcamp.service;

import abstraindoBootcamp.domain.Curso;
import abstraindoBootcamp.domain.Devs;
import abstraindoBootcamp.domain.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nome;
    private String descricao;
    private List<Devs> developers = new ArrayList<Devs>();
    private List<Mentoria> mentorias = new ArrayList<Mentoria>();
    private List<Curso> cursos = new ArrayList<Curso>();

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Devs> getDevelopers() {
        return developers;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
