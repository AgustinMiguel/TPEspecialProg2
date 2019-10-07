
public class CpesoSuperiorA extends Condicion {
	private Animal animal;
	private double peso;
	public CpesoSuperiorA(Animal a, double p){
		animal = a;
		peso = p;
	}
	public boolean seCumple() {
		return animal.getPeso() > peso;
		
	}
}
