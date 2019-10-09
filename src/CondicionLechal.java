public class CondicionLechal extends CondicionPorVaca{
	final static int MAX = 8;
	public boolean seCumple(Animal animal) {
		return animal.getEdad() < MAX;
	}

}
