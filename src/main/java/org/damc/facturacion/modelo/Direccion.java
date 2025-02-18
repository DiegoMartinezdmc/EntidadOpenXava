package org.damc.facturacion.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {
	
	@Column(length=30)
	String ViaPublica;
	
	@Column(length=5)
	int codigoPostal;
	
	@Column(length=20)
	String municipio;
	
	@Column(length=30)
	String provincia;
	

}
