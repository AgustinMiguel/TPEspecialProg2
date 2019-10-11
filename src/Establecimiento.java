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

	public double promedioEdad() {
		int edad = 0;
		int cantidad=0;
		for (ElementoSistemaGanadero i : establecimientos) {
			  edad = edad + i.edadTotal();
			  cantidad = cantidad + i.cantidadAnimales();
			}
		return edad/cantidad;
	}

	public double pesoTotal() {
		double peso=0;
		for (ElementoSistemaGanadero i : establecimientos) {
			  peso = peso+i.pesoTotal();
			}
		return peso;
	}

	public double promedioPeso() {
		double peso = 0;
		int cantidad=0;
		for (ElementoSistemaGanadero i : establecimientos) {
			  peso = peso + i.pesoTotal();
			  cantidad= cantidad + i.cantidadAnimales();
			}
		return peso/cantidad;		
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

	public void borrarAnimal(ArrayList<Animal> animales) {
		establecimientos.removeAll(animales); //preguntar si esta bien implementado o hacer un for que recorra array establecimientos haciendo remove de cada animal
	}
}

