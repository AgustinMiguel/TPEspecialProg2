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
		for(Animal i: aux){				//podria ser un while
			carga.add(i);
			capacidad--;
			if(capacidad == 0){
				break;
			}
		}
		establecimiento.borrarAnimal(carga);
	}
}

