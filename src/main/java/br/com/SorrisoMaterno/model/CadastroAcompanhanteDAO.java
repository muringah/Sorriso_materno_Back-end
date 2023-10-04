package br.com.SorrisoMaterno.model;

import java.util.ArrayList;
import java.util.List;

public class CadastroAcompanhanteDAO {
 

    public void cadastrarAcompanhante(Acompanhante acompanhante) {
        List<Acompanhante> acompanhantes = lerAcompanhantes();
        acompanhantes.add(acompanhante);
        escreverAcompanhantes(acompanhantes);
    }

    public List<Acompanhante> lerAcompanhantes() {
        List<Acompanhante> acompanhantes = new ArrayList<>();
        return acompanhantes;

    }

    private void escreverAcompanhantes(List<Acompanhante> acompanhantes) {
            for (Acompanhante acompanhante : acompanhantes) {
               
               
            }

    
        }       
    }