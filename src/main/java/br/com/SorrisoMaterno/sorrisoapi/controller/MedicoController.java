package br.com.SorrisoMaterno.sorrisoapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;
@RestController
public class MedicoController {
    
@GetMapping("/api/medico/{crm}")
public ArrayList<Medico> listarMedico() {
    Medico medico1 = new Medico();
    medico1.setNome("Kayky");
    medico1.setCrm("123456");
    medico1.setTelefone("1196321-8910");

    return listarMedico();


         }
 }
