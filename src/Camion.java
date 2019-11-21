import java.util.ArrayList;
import java.util.List;
public class Camion {
	protected int capacidad;
	protected ArrayList<Animal> carga;
	protected CondicionPorVaca condicion;
	
	public Camion(int capacidad, CondicionPorVaca condicion) {
		this.capacidad = capacidad;
		this.condicion = condicion;
		this.carga = new ArrayList<Animal>();
	}
	public void cargarCamion (Establecimiento establecimiento){
		List<Animal> aux = new ArrayList<Animal>();
		aux = establecimiento.buscarAnimal(condicion);	
		aux= aux.subList(0, capacidad-1);
		for(Animal a: aux){				//podria ser un while
			carga.add(a);
			establecimiento.borrarAnimal(a);
		}
	}
}

