package gerenciar.matricula.tcc.vo;

public class AlunoVO extends DisciplinaVO{

	private String nome;
	private int matricula;
	private String Curso;
	private boolean statusMatricula = false;
	
	public AlunoVO() {
		
	}
	
	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public boolean isStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(boolean statusMatricula) {
		this.statusMatricula = statusMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
