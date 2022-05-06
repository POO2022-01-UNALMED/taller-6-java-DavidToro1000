package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricasCreadas= new ArrayList<Fabricante>();
	public int unidadesVendidas;
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricasCreadas.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static Fabricante fabricaMayorVentas() {
    	Fabricante masVendedor=new Fabricante("XD", new Pais("a"));
    	for(Fabricante p: fabricasCreadas) {
    		if (p.unidadesVendidas>masVendedor.unidadesVendidas) {
    			masVendedor=p;
    		}
    	}
    	return masVendedor;
    }
}
