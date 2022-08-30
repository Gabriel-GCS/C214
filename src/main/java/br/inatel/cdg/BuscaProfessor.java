package br.inatel.cdg;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {
    ProfessorService professorService;

    public BuscaProfessor(ProfessorService professorService) {
        this.professorService = professorService;
    }

    public Professor buscaProfessor(int id) {
        String professorJSON = professorService.busca(id);

        JsonObject jsonObject = JsonParser.parseString(professorJSON).getAsJsonObject();

        Professor aux = new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());

        return aux;
    }
    }
