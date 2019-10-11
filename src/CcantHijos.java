
public class CcantHijos extends CondicionPorVaca{
	private int hijos;
	public CcantHijos(int hijos){
		this.hijos = hijos;
	}
	public boolean seCumple(Animal animal) {
		if(animal.getHijos() == 0 && this.hijos == 0){
			return true;
		}
		return animal.getHijos() > this.hijos;
		
	}
}
