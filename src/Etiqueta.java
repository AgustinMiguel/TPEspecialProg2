import java.util.ArrayList;
public class Etiqueta {
	private String nombre;
	protected ArrayList<CondicionPorVaca> condiciones;
	
	public Etiqueta(String nombre) {
		this.nombre = nombre;
		this.condiciones = new ArrayList<CondicionPorVaca>();
	}
	
	public boolean cumple(Animal vaca){
		if (condiciones != null){
			boolean aux = true;
			for (CondicionPorVaca i: condiciones){
				aux = i.seCumple(vaca);
				if (aux == false){
					return false;
				}
			return true;
			}
		}
			return false;
	}	
	public void addEtiqueta(CondicionPorVaca condicion){
		condiciones.add(condicion);
	}
}