
public class Animal extends ElementoSistemaGanadero {
	protected int id;
	protected double peso;
	protected boolean castrada;
	protected int hijos;
	protected char sexo;
	protected int edad; //en meses
	protected String raza;

	public Animal(int id, double peso, boolean castrada, int hijos, char sexo,int edad, String raza) {
		super();
		this.id = id;
		this.peso = peso;
		this.castrada = castrada;
		this.hijos = hijos;
		this.sexo = sexo;
		this.edad = edad;
		this.raza = raza;
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

	public  boolean esVendible(Condicion condicion) {
		return condicion.seCumple(this);
	}
}

