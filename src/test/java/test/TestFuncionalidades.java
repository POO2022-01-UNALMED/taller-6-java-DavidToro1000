package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import vehiculos.Automovil;
import vehiculos.Camion;
import vehiculos.Camioneta;
import vehiculos.Fabricante;
import vehiculos.Pais;
import vehiculos.Vehiculo;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestFuncionalidades {
	
	static {
		
		Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		Fabricante f1 = new Fabricante("Renault", p1);
		Fabricante f2 = new Fabricante("Chevrolet", p1);
		Fabricante f3 = new Fabricante("Tesla", p2);
		Fabricante f4 = new Fabricante("Volvo", p3);
		
		new Camion("SS", "Camion premium", 1000, 100, f1, 3);
		new Camion("AA", "Camion", 1000, 100, f1, 3);
		new Automovil("NN", "Mac 100", 820, 20, f1, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Automovil("NN", "Mac 100", 820, 20, f2, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f2, true);
		
		new Camion("SS", "Camion premium", 1000, 100, f3, 3);
		new Camion("AA", "Camion", 1000, 100, f3, 3);
		new Automovil("NN", "Mac 100", 820, 20, f3, 4);
		
		new Camioneta("CC", 5, "Ford", 500, 150, f4, true);
		new Automovil("NN", "Mac 100", 820, 20, f4, 4);
	}

	@Test
   	public void testPais(){
		
		boolean ok = false;
		if(Pais.paisMasVendedor().getNombre().equals("Ecuador")) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo paisMasVendedor");
    }
	
	@Test
   	public void testFabricante(){
		
		boolean ok = false;
		if(Fabricante.fabricaMayorVentas().getNombre().equals("Renault")) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo fabricaMayorVentas");
    }
}