package birt.dwes.apirest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="carrera")
public class Carrera {

	@Column(name="id")
	private int id;
	
	@Column(name="tipo")
    private String tipo;
	
	@Column(name="fecha")
    private String fecha;
	
	@Column(name="distanciaKM")
    private int distanciaKm;
	
	@Column(name="duracionMin")
    private int duracionMin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getDistanciaKm() {
		return distanciaKm;
	}

	public void setDistanciaKm(int distanciaKm) {
		this.distanciaKm = distanciaKm;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

	
}
