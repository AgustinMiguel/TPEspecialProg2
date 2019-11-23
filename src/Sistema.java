import java.util.ArrayList;
public class Sistema {
	protected ArrayList<Etiqueta> etiquetas;

	public Sistema() {
		this.etiquetas = new ArrayList<Etiqueta>();
	}
	public void add(Etiqueta e) {
		etiquetas.add(e);
	
	public void seCumple(Animal v){
		for(Etiqueta e: etiquetas){
			if(e.condicion.seCumple(v)){
				System.out.println("el animal es " + e.nombre);
			}
		}
	}
}

