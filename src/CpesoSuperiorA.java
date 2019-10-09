
public class CpesoSuperiorA extends CondicionPorVaca{
	private double peso;
	public CpesoSuperiorA(double p){
		peso = p;
	}
	public boolean seCumple(Animal animal) {
		return animal.getPeso() > peso;
		
	}
}
