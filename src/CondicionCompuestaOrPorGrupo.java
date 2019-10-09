public class CondicionCompuestaOrPorGrupo extends CondicionPorGrupo{
	private CondicionPorGrupo c1;
	private CondicionPorGrupo c2;
	
	public CondicionCompuestaOrPorGrupo(CondicionPorGrupo c1, CondicionPorGrupo c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean seCumple(Establecimiento establecimiento) {
		return this.c1.seCumple(establecimiento) || this.c2.seCumple(establecimiento);
	}

}
