 package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;
import java.util.List;

public class AgendamentoDAO{
    private List<AgendamentoDAO> agendamentos;

    public AgendamentoDAO() {
        agendamentos = new ArrayList<>();
    }

    public void salvar(AgendamentoDAO agendamento) {
        agendamentos.add(agendamento);
    }

    public void atualizar(AgendamentoDAO agendamento) {
       
    }

    public void deletar(AgendamentoDAO agendamento) {
        agendamentos.remove(agendamento);
    }
}



