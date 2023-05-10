package bootcamp.spring.cloud.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Filter {

	Logger log=LoggerFactory.getLogger(getClass());
	
	@Bean
	@Order(-1)
	public GlobalFilter a() {
		
		return (exchange,chain)->{
			log.info("Primer pre filter");
			return chain.filter(exchange);
		};
	}
	
	@Bean
	@Order(0)
	public GlobalFilter b() {
		
		return (exchange,chain)->{
			log.info("Segundo pre filter");
			return chain.filter(exchange);
		};
	}
}
