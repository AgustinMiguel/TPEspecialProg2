
public class CesCapado extends CondicionPorVaca{
	private boolean capado;
	public CesCapado(boolean c){
		capado = c;
	}
	public boolean seCumple(Animal animal) {
		return animal.isCastrada() == capado;
		
	}
}
