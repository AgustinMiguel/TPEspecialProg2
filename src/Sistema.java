import java.util.ArrayList;
public class Sistema {
	protected ArrayList<Etiqueta> etiquetas;

	public Sistema(ArrayList<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}
	
	public void seCumple(Animal v){
		for(Etiqueta e: etiquetas){
			if(e.condicion.seCumple(v)){
				System.out.println("el animal es " + e.nombre);
			}
		}
	}
}

