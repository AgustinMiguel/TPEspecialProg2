
public class CsexoIgualA extends CondicionPorVaca{
	private char sexo;
	public CsexoIgualA(char sexo){
		this.sexo = sexo;
	}
	public boolean seCumple(Animal animal) {
		return animal.getSexo() == this.sexo;
		
	}
}
