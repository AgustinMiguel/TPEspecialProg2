import java.util.ArrayList;
public class Camion {
	protected int capacidad;
	protected ArrayList<Animal> carga;
	protected Condicion condicion;
	
	public Camion(int capacidad, ArrayList<Animal> carga, Condicion condicion) {
		this.capacidad = capacidad;
		this.carga = carga;
		this.condicion = condicion;
	}
	
	public ArrayList<Animal> loadCamion(){
		return 0;
	}
}
