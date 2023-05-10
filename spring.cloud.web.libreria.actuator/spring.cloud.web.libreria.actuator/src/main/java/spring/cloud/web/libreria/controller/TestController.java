package spring.cloud.web.libreria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RequestMapping("/api")
@RestController
public class TestController {
	private Counter counter;
	public TestController(MeterRegistry registry) {
		this.counter=Counter.builder("invocaciones.hello").description("Invocaciones totales del endpoint hello world").register(registry);
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		counter.increment();
		return "Hello world";
	}
}