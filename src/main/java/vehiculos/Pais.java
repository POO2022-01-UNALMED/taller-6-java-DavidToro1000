package vehiculos;
import java.util.ArrayList;
public class Pais {
    private String nombre;
    private static ArrayList<Pais> paisesCreados= new ArrayList<Pais>();
    public int unidadesVendidas;
	public Pais(String nombre) {
		this.nombre = nombre;
		paisesCreados.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public static Pais paisMasVendedor() {
    	Pais masVendedor=new Pais("XD");
    	for(Pais p: paisesCreados) {
    		if (p.unidadesVendidas>masVendedor.unidadesVendidas) {
    			masVendedor=p;
    		}
    	}
    	return masVendedor;
    }
}
