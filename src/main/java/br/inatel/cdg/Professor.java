package br.inatel.cdg;

public class Professor {

    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;

    public Professor(String nomeDoProfessor, String horarioDeAtendimento, String periodo) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }
}