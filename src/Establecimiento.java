import java.util.ArrayList;
public class Establecimiento extends ElementoSistemaGanadero {
	protected String nombre;
	protected ArrayList<ElementoSistemaGanadero> establecimientos;
	public Establecimiento(String nombre) {
		super();
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
		int aux=0;
		for (ElementoSistemaGanadero i : establecimientos) {
			  edad = edad + i.edadTotal();
			  aux = aux + i.cantidadAnimales();
			}
		return edad/aux;
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
		int aux=0;
		for (ElementoSistemaGanadero i : establecimientos) {
			  peso = peso + i.pesoTotal();
			  aux = aux + i.cantidadAnimales();
			}
		return peso/aux;		
	}

	public int edadTotal() {
		int edad = 0;
		for (ElementoSistemaGanadero i : establecimientos){
			edad = edad + i.edadTotal();
		}
		return edad;
	}
	
	public boolean esVendible(){
		return false; //implementalo caldo de mierda
	}
}

