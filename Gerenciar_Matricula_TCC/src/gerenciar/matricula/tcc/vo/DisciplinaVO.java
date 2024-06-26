package gerenciar.matricula.tcc.vo;

public class DisciplinaVO {
	
	protected String nomeDisciplina;
	protected String codigo;
	private boolean statusDisciplina = true; //Parindo do pretexto que tem vagas disponíveis
	
	public DisciplinaVO() {
		
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDiscipina) {
		this.nomeDisciplina = nomeDiscipina;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean isStatusDisciplina() {
		return statusDisciplina;
	}

	public void setStatusDisciplina(boolean statusDisciplina) {
		this.statusDisciplina = statusDisciplina;
	}

}
