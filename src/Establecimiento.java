import java.util.ArrayList;
public class Establecimiento extends ElementoSistemaGanadero {
	protected String nombre;
	protected ArrayList<ElementoSistemaGanadero> establecimientos;
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
		for (ElementoSistemaGanadero i : establecimientos) {
			  peso = peso+i.pesoTotal();
			}
		return peso;
	}

	public int edadTotal() {
		int edad = 0;
		for (ElementoSistemaGanadero i : establecimientos){
			edad = edad + i.edadTotal();
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
	public void borrarAnimal(ArrayList<Animal> animales) {
		Animal animal = null;
		for (Animal i : animales){
			animal = buscarAnimal(i);
			if (animal != null){
				establecimientos.remove(animal);
			}
		}	
		imprimir();
	}
	public void imprimir(){
		for(int i = 0; i < establecimientos.size(); i++){
			System.out.println(establecimientos.get(i).cantidadAnimales());
		}
	}
}

