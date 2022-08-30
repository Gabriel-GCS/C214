package br.inatel.cdg.test;

import br.inatel.cdg.BuscaProfessor;
import br.inatel.cdg.Professor;
import br.inatel.cdg.ProfessorService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {
    ProfessorService professorService;
    BuscaProfessor buscaProfessor;

    @Before
    public void setUp() {
        professorService = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(professorService);
    }

    @Test
    public void testeBuscaLuiz() {
        Professor professor = buscaProfessor.busca(1);
        assertEquals(professor.getNomeDoProfessor(), "Luiz Felipe");
        assertEquals(professor.getHorarioDeAtendimento(), "Quinta e Sexta 13:30");
        assertEquals(professor.getPeriodo(), "Integral");
    }

    @Test
    public void testeBuscaRenzo() {
        Professor professor = buscaProfessor.busca(2);
        assertEquals(professor.getNomeDoProfessor(), "Renzo");
        assertEquals(professor.getHorarioDeAtendimento(), "Terça 19:30");
        assertEquals(professor.getPeriodo(), "Noturno");
    }

    @Test
    public void testeBuscaAntonio() {
        Professor professor = buscaProfessor.busca(3);
        assertEquals(professor.getNomeDoProfessor(), "Antonio");
        assertEquals(professor.getHorarioDeAtendimento(), "Sexta 10:00");
        assertEquals(professor.getPeriodo(), "Integral");
    }

    @Test
    public void testeBuscaInexistente() {
        Professor professor = buscaProfessor.busca(4);
        assertEquals(professor.getNomeDoProfessor(), "Inexistente");
        assertEquals(professor.getHorarioDeAtendimento(), "Inexistente");
        assertEquals(professor.getPeriodo(), "Inexistente");
    }

}