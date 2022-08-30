package br.inatel.cdg.test;

import br.inatel.cdg.BuscaProfessor;
import br.inatel.cdg.Professor;
import br.inatel.cdg.ProfessorService;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    @Test
    public void testeBuscaProfesssorLuiz(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor Luiz = buscaP.buscaProfessor(1);

        assertEquals("Luiz Felipe",Luiz
                .getNomeDoProfessor());
        assertEquals("Quinta e Sexta 13:30",Luiz
                .getHorarioDeAtendimento());
        assertEquals("Integral",Luiz
                .getPeriodo());

    }

    @Test
    public void testeBuscaProfesssorRenzo(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor renzo = buscaP.buscaProfessor(2);

        assertEquals("Renzo",renzo.getNomeDoProfessor());
        assertEquals("Terça 19:30",renzo.getHorarioDeAtendimento());
        assertEquals("Noturno",renzo.getPeriodo());

    }
    @Test
    public void testeBuscaProfesssorAntonio(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor antonio = buscaP.buscaProfessor(3);

        assertEquals("Antonio",antonio.getNomeDoProfessor());
        assertEquals("Sexta-19:30h",antonio.getHorarioDeAtendimento());
        assertEquals("Noturno",antonio.getPeriodo());

    }

}