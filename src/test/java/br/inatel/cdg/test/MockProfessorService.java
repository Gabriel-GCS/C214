package br.inatel.cdg.test;

import br.inatel.cdg.ProfessorService;
import br.inatel.cdg.test.ProfessorConst;

public class MockProfessorService implements ProfessorService {

    @Override
    public String busca(int id) {
        switch (id) {
            case 1:
                return ProfessorConst.LuizFelipe;
            case 2:
                return ProfessorConst.Renzo;
            case 3:
                return ProfessorConst.Antonio;
            default:
                return ProfessorConst.INEXISTENTE;
        }
    }
}