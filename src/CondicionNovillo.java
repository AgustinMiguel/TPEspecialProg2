public class CondicionNovillo extends CondicionPorVaca{
	final static int MIN = 24;
	final static int MAX = 48;
	public boolean seCumple(Animal animal) {
		return animal.getEdad() > MIN && animal.getEdad() < MAX;
	}

}
