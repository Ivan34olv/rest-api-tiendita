package com.mx.tiendita.Service;

import java.util.List;

import com.mx.tiendita.Entity.Productos;

public interface Metodos {
	
	Productos save (Productos producto);//Guardar
	List<Productos> findAll();//Listar
	Productos findById (Long id);//Buscar
	void deleteById(Long id);//Borrar
	Productos update(Productos producto);//Editar

}
