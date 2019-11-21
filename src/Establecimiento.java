import java.util.ArrayList;
import java.util.List;
public class Establecimiento extends ElementoSistemaGanadero {
	protected String nombre;
	protected List<ElementoSistemaGanadero> establecimientos;
	public Establecimiento(String nombre) {
		this.nombre = nombre;
		this.establecimientos = new ArrayList<ElementoSistemaGanadero>();
	}
	public void add(ElementoSistemaGanadero elemento){
		establecimientos.add(elemento);
	}
	
	public int cantidadAnimales(){
		int suma=0;
		for (ElementoSistemaGanadero i : establecimientos) {
			  suma= suma + i.cantidadAnimales();
			}
		return suma;
	}


	public double pesoTotal() {
		double peso=0;
		if (establecimientos != null){
			for (ElementoSistemaGanadero i : establecimientos) {
				peso = peso+i.pesoTotal();
			}
		}
		return peso;
	}

	public int edadTotal() {
		int edad = 0;
		if(establecimientos != null){
			for (ElementoSistemaGanadero i : establecimientos){
				edad = edad + i.edadTotal();
			}
		}
		return edad;
	}
	
	public boolean esVendible (CondicionPorGrupo condicion){
		return condicion.seCumple(this);
	}
	
	public ArrayList<Animal> buscarAnimal(CondicionPorVaca condicion){
		ArrayList<Animal> animales = new ArrayList<Animal>();
		for (ElementoSistemaGanadero i : establecimientos){
			animales.addAll(i.buscarAnimal(condicion));
		}
		return animales;
	}
	
	public Animal buscarAnimal(Animal animal) {
		Animal aux = null;
		for (ElementoSistemaGanadero i : establecimientos){
			aux = i.buscarAnimal(animal);
		}
		return aux;
	}
	public boolean borrarAnimal(Animal a) {
		boolean loBorro = establecimientos.remove(a);
		if (!loBorro){
			for (int i =0; i<establecimientos.size() && !loBorro;i++){
				loBorro = establecimientos.get(i).borrarAnimal(a);
			}
		}
		return loBorro;
	}
	
	public void imprimir(){
		for(int i = 0; i < establecimientos.size(); i++){
			System.out.println(establecimientos.get(i).cantidadAnimales());
		}
	}
}

