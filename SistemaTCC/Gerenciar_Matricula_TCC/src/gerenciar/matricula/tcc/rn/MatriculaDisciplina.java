package gerenciar.matricula.tcc.rn; 

import java.util.ArrayList;

import gerenciar.matricula.tcc.vo.AlunoVO;
import gerenciar.matricula.tcc.vo.DisciplinaVO;

public class MatriculaDisciplina {

	public MatriculaDisciplina() {
		
	}

	public ArrayList<AlunoVO> cadastrarAluno(AlunoVO aluno, DisciplinaVO disciplinaTCC, GerenciaAluno matricula,
												ArrayList<AlunoVO> listaAlunos ) {
			
			aluno.setNome("Mateus Anutunes");
			aluno.setMatricula(2012082048);
			aluno.setCurso("Computação");
	
			if(disciplinaTCC.isStatusDisciplina() == true) {
				aluno.setCodigo("ENG0N-311");
				aluno.setNomeDisciplina("TCC I");	
			}else {
				System.out.println("A disciplina não está disponível");
			}
			
			// manipula lista para inserir o aluno
			listaAlunos.add(aluno);
			
			matricula.efetuarMatricula(aluno);
			System.out.println("Aluno cadastrado com sucesso!");
			
			return listaAlunos;		
	}
	
	public boolean isDisciplinaAtiva(DisciplinaVO disciplina) {
		if(disciplina.isStatusDisciplina() != true) {
			System.out.println("A disciplina NÃO está Disponível!");
			return false;
		}else {
			System.out.println("A disciplina está disponível para matrícula.");
			return true;
		}
	}
}
