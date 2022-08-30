package br.inatel.cdg.test;

import br.inatel.cdg.BuscaProfessor;
import br.inatel.cdg.Professor;
import br.inatel.cdg.ProfessorIdInvalidoException;
import br.inatel.cdg.ProfessorService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    ProfessorService service;
    BuscaProfessor testeBuscaProfessor;

    @Before
    public void setup() {
        service = new MockProfessorService();
        testeBuscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfesssorLuiz()
        throws ProfessorIdInvalidoException{

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor Luiz = buscaProfessor.buscaProfessor(1);

        assertEquals("Luiz Felipe",Luiz.getNomeDoProfessor());
        assertEquals("Quinta e Sexta 13:30",Luiz.getHorarioDeAtendimento());
        assertEquals("Integral",Luiz.getPeriodo());
    }

    @Test
    public void testeBuscaProfesssorRenzo()
        throws ProfessorIdInvalidoException{

            ProfessorService service = new MockProfessorService();
            BuscaProfessor buscaProfessor = new BuscaProfessor(service);

            Professor renzo = buscaProfessor.buscaProfessor(2);

            assertEquals("Renzo",renzo.getNomeDoProfessor());
            assertEquals("Terça 19:30",renzo.getHorarioDeAtendimento());
            assertEquals("Noturno",renzo.getPeriodo());
        }

    @Test
    public void testeBuscaProfesssorAntonio()

        throws ProfessorIdInvalidoException{

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor antonio = buscaProfessor.buscaProfessor(3);

        assertEquals("Antonio",antonio.getNomeDoProfessor());
        assertEquals("Sexta-19:30h",antonio.getHorarioDeAtendimento());
        assertEquals("Noturno",antonio.getPeriodo());
        }

    @Test (expected = ProfessorIdInvalidoException.class)
    public void testeProfessorIdNegativo()
            throws ProfessorIdInvalidoException{

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor idN = buscaProfessor.buscaProfessor(-10);

    }

    @Test (expected = ProfessorIdInvalidoException.class)
    public void testeProfessorIdzero()
            throws ProfessorIdInvalidoException{

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor idN = buscaProfessor.buscaProfessor(0);

    }

    @Test (expected = ProfessorIdInvalidoException.class)
    public void testeProfessorIdInexistente()
            throws ProfessorIdInvalidoException{

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        Professor idN = buscaProfessor.buscaProfessor(30);

    }

}