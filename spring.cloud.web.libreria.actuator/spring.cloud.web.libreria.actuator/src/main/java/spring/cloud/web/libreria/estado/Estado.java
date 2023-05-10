package spring.cloud.web.libreria.estado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="estados")
public class Estado {

private List<String> listaEstados=new ArrayList<>();

@ReadOperation
public List<String> listEstados(){
	return listaEstados;
}

@WriteOperation
public void saveEstados(@Selector String estadoNuevo) {
	listaEstados.add(estadoNuevo);
}

@DeleteOperation
public void deleteEstado(@Selector String estadoBorrar) {
	listaEstados.remove(estadoBorrar);
}

}
