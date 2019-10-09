public class CondicionAnojo extends CondicionPorVaca{
	final static int MIN = 12;
	final static int MAX = 24;
	public boolean seCumple(Animal animal) {
		return animal.getEdad() > MIN && animal.getEdad() < MAX;
	}

}
