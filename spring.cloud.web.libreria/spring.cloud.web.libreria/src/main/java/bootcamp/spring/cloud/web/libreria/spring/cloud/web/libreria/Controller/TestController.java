package bootcamp.spring.cloud.web.libreria.spring.cloud.web.libreria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.spring.cloud.web.libreria.spring.cloud.web.libreria.service.TestService;

@RequestMapping("/api/")
@RestController
public class TestController {
	@Autowired
	TestService testService;

	@GetMapping("saludo/{idioma}")
	public String saludo(@PathVariable("idioma") String idioma) {

		String saludoEnIdioma = testService.usoSaludo(idioma);
		return saludoEnIdioma;
	}

}
