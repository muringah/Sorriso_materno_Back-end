package br.com.SorrisoMaterno.sorrisoapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;

@RestController
public class ConsultaController {

    @GetMapping("/api/consulta")
    public ArrayList<Consulta> listarConsulta() {
        Consulta consulta = new Consulta();
        consulta.setHorario("12:00");
        consulta.setData("10/09/2023");

        Consulta consulta1 = new Consulta();
        consulta1.setHorario("9:00");
        consulta1.setData("11/12/2023");

        Consulta consulta2 = new Consulta();
        consulta2.setHorario("15:00");
        consulta2.setData("26/06/2021");

        ArrayList<Consulta> lista = new ArrayList<>();
        lista.add(consulta);
        lista.add(consulta1);
        lista.add(consulta2);
        return lista;

    }

}
