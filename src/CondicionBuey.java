public class CondicionBuey extends CondicionPorVaca{
	final static int MIN = 48;
	public boolean seCumple(Animal animal) {
		return animal.getEdad() > MIN && animal.isCastrada() && animal.getSexo() == 'm';
	}

}
