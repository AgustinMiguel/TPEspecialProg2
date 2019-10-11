import java.util.ArrayList;


public class Animal extends ElementoSistemaGanadero {
	static private int id = 0;
	protected double peso;
	protected boolean castrada;
	protected int hijos;
	protected char sexo;
	protected int edad; //en meses
	protected String raza;

	public Animal(double peso, boolean castrada, int hijos, char sexo,int edad, String raza) {
		this.peso = peso;
		this.castrada = castrada;
		this.hijos = hijos;
		this.sexo = sexo;
		this.edad = edad;
		this.raza = raza;
		id++;
	}
	public String getRaza(){
		return this.raza;
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isCastrada() {
		return castrada;
	}

	public void setCastrada(boolean castrada) {
		this.castrada = castrada;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public char getSexo() {
		return sexo;
	}

	public int cantidadAnimales() {
		return 1;
	}


	public double pesoTotal() {
		return getPeso();
	}
	public int edadTotal() {
		return this.edad;
	}
	public ArrayList<Animal> buscarAnimal(CondicionPorVaca condicion) {
		ArrayList<Animal> animales = new ArrayList<Animal>();
			if (condicion.seCumple(this)){
				animales.add(this);
		}
		return animales;
	}

}

