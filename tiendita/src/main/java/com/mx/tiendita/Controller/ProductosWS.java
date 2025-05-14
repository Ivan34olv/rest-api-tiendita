package com.mx.tiendita.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.tiendita.Entity.Productos;
import com.mx.tiendita.Service.Metodos;

@RestController //permite generar  arquitectura api rest osea formmato json comunicacion cob los cliebtes
public class ProductosWS {
	
	private final Metodos metodos; //la constante se trae del paquete service
	
	public ProductosWS(Metodos metodos) {// se genera el constrctor		
		this.metodos = metodos; // 
	}

	@PostMapping  //anotacion  tipo Post para q sea un endpoint
	public Productos save (@RequestBody Productos productos) {//Creamos endpoint para esto 
		return metodos.save(productos);      //Generamos un metodo
												//Requestbody trasnforma peticon del cliente a un objeto java 
	}

}
