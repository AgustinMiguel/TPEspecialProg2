import java.util.ArrayList;
public class Camion {
	protected int capacidad;
	protected ArrayList<Animal> carga;
	protected CondicionPorVaca condicion;
	
	public Camion(int capacidad, CondicionPorVaca condicion) {
		this.capacidad = capacidad;
		this.condicion = condicion;
	}
	public void cargarCamion (Establecimiento establecimiento){
		ArrayList<Animal> aux = new ArrayList<Animal>();
		aux = establecimiento.buscarAnimal(condicion);
		establecimiento.borrarAnimal(condicion);
		carga = aux;
	}
}

