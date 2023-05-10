package bootcamp.spring.cloud.web.libreria.spring.cloud.web.libreria.service;

public class saludo {
	private String idioma;

	public saludo(String idioma) {
		this.idioma = idioma;
	}

	public String mensajeSaludo() {
		String mensaje = "";
		switch (idioma) {
		case "Castellano":
			mensaje = "Bienvenido";
			break;
		case "Inglés":
			mensaje = "Welcome";
			break;
		case "Italiano":
			mensaje = "Benvenuto";
			break;
		default:
			mensaje = "Bienvenido";
			break;

		}
		return mensaje;
	}
}
