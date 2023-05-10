package bootcamp.spring.cloud.personal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/obtener")
	public String personal() {
		return"personal";
	}
}
