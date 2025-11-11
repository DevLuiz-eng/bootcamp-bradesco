package abstraindoBootcamp.domain;

import abstraindoBootcamp.service.Bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Devs {

    private String nome;
    private List <Mentoria> mentorias = new ArrayList<Mentoria>();
    private List <Curso> cursos = new ArrayList<Curso>();
    Bootcamp bootcamp;


    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
        bootcamp.getDevelopers().add(this);
    }

    public void progredir () {
        System.out.println("Progredindo...");
    }

    public int calcularXP () {
        return 10 * (cursos.toArray().length + mentorias.toArray().length);
    }

    public void exibirCursos (){
        cursos.forEach(System.out::println);
    }

    public void addMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "[Desenvolvedor nome: " + getNome();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }
}
