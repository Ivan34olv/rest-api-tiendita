package com.mx.tiendita.Entity;

import jakarta.persistence.*;
import lombok.*;


@Data //Para no colocar los Geter y Seters
@Entity  //hace la persistencia indica q se generara en bd
@Table(name ="tbl_product")// le da nombre a la tabla

public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// para que genere un id mejor dicho una estrategia
	private Long productId;
	@Column(name = "producto_sabritas", unique = true, nullable = false)// cambo de nombre y que sea unico 
	private String nombre;
	private String proveeedor;
	@Column(name="correo", unique = true)
	private String email;
	private int precio;
	
	
	

}
