package bootcamp.spring.cloud.app.spring.cloud.web.libreria.service;

import org.springframework.stereotype.Service;

import bootcamp.spring.cloud.web.libreria.spring.cloud.web.libreria.service.saludo;

@Service
public class TestService {

	public String usoSaludo(String idioma) {
		saludo claseSaludo = new saludo(idioma);
		return claseSaludo.mensajeSaludo();
	}
}
