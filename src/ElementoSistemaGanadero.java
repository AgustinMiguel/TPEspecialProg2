import java.util.ArrayList;

public abstract class ElementoSistemaGanadero {
	public abstract int cantidadAnimales();
	public abstract double pesoTotal();
	public abstract int edadTotal();
	public abstract ArrayList<Animal> buscarAnimal(CondicionPorVaca condicion);
	public abstract Animal buscarAnimal (Animal animal);
	public double promedioEdad(){
		if (this.cantidadAnimales()!=0){
			return this.edadTotal()/this.cantidadAnimales();
		}
		return 0;
	}
	public double promedioPeso(){
		if (this.cantidadAnimales()!=0){
			return this.pesoTotal()/this.cantidadAnimales();
		}
		return 0;
	}
	public abstract boolean borrarAnimal(Animal a);
}
