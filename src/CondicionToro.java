public class CondicionToro extends CondicionPorVaca{
	final static int MIN = 8;
	final static int MAX = 12;
	public boolean seCumple(Animal animal) {
		return animal.getSexo() == 'm' && !(animal.isCastrada());
	}

}
