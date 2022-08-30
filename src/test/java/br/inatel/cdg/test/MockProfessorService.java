package br.inatel.cdg;

import br.inatel.cdg.test.ProfessorConst;

public class MockProfessorService implements ProfessorServiceService {

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