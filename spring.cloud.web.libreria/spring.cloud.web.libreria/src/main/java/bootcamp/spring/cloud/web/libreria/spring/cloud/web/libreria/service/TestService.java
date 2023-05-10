package bootcamp.spring.cloud.web.libreria.spring.cloud.web.libreria.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String usoSaludo(String idioma) {
		saludo claseSaludo = new saludo(idioma);
		return claseSaludo.mensajeSaludo();
	}
}
