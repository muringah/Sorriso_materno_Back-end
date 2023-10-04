package br.com.SorrisoMaterno.sorrisoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;
import br.com.SorrisoMaterno.sorrisoapi.repositories.MedicoRepository;

@SpringBootApplication
public class SorrisoApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SorrisoApiApplication.class, args);
	}
}
