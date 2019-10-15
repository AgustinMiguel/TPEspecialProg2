import java.util.ArrayList;

public abstract class ElementoSistemaGanadero {
	public abstract int cantidadAnimales();
	public abstract double pesoTotal();
	public abstract int edadTotal();
	public abstract ArrayList<Animal> buscarAnimal(CondicionPorVaca condicion);
	public abstract Animal buscarAnimal (Animal animal);
}
