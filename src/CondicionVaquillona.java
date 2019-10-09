public class CondicionVaquillona extends CondicionPorVaca{
	final static int MIN = 15;
	public boolean seCumple(Animal animal) {
		return animal.getEdad() > MIN && animal.getHijos() == 0  && animal.getSexo() == 'f';
	}

}
