package gerenciar.matricula.tcc.interfaces;

import java.util.ArrayList;

import gerenciar.matricula.tcc.vo.AlunoVO;

public interface GerenciaMatricula {

	// CRUD:
	public void efetuarMatricula(AlunoVO matricula);
	public void atualizarMatricula(AlunoVO matricula);
	public void consultarMatricula(AlunoVO matricula);
	public void deletarMatricula(AlunoVO aluno, ArrayList<AlunoVO> listaAluno);
}
