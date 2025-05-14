package com.mx.tiendita.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.tiendita.Entity.Productos;
import com.mx.tiendita.Repository.ProductRepository;


@Service
public class Implementacion implements Metodos{
	
	private  final ProductRepository productRepository; //creamos una nueva variable del repository
	

	public Implementacion(ProductRepository productRepository) {//al colocar el final
																//obliga a generar el constructor
		this.productRepository = productRepository;
	}

	@Override
	public Productos save(Productos producto) {
	return productRepository.save(producto);
	}

	@Override
	public List<Productos> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Productos update(Productos producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
