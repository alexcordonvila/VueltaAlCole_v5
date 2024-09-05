package com.ipartek.modelo.dto;

/**
 * <b>Clase categoria</b>
 * 
 * <p>Clase Categoria que referencia 
 * la tabla categorias en la BD<p>
 * @author Alain
 *
 */
public class Categoria {
	/**
	 * Atributo ID:<b>A LA HORA DE INSERTAR EN LA BD ES AUTONUMERIC</b>
	 */
	private int id;
	
	/**
	 * Atributo nombre: varchar(45) en la BD
	 */
	private String nombre;
	
	/**
	 * Constructor completo
	 * @param id un integer, si no lo hemos recogido de la BD deberia ser 0
	 * @param nombre
	 */
	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Categoria() {
		super();
		this.id = 0;
		this.nombre = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Patata
	 *
	 * @return retorna la categoria serializado a string
	 */
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
