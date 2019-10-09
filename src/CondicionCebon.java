public class CondicionCebon extends CondicionPorVaca{
	final static int MAX = 48;
	public boolean seCumple(Animal animal) {
		return animal.getEdad() < MAX && animal.isCastrada()  && animal.getSexo() == 'm';
	}

}
