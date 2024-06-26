package gerenciar.matricula.tcc.inicio;

import java.util.ArrayList;

import gerenciar.matricula.tcc.vo.*;
import gerenciar.matricula.tcc.rn.*;

public class Main {

	public static void main(String[] args) {
		
		AlunoVO aluno = new AlunoVO();
		DisciplinaVO disciplinaTCC = new DisciplinaVO();
		ArrayList<AlunoVO> listaAlunos = new ArrayList<AlunoVO>();
		GerenciaAluno gerenciaAluno = new GerenciaAluno();
		MatriculaDisciplina gerenciaDisciplina = new MatriculaDisciplina();
		
		gerenciaDisciplina.isDisciplinaAtiva(disciplinaTCC);
		
		listaAlunos = gerenciaDisciplina.cadastrarAluno(aluno, disciplinaTCC, gerenciaAluno, listaAlunos);
		
		gerenciaAluno.consultarMatricula(aluno);
		
		System.out.println("--------------------------------------------------------------------------");
		
		gerenciaAluno.atualizarMatricula(aluno);
		
		gerenciaAluno.isMatriculaAtiva(aluno);
		
		gerenciaAluno.consultarMatricula(aluno);
		System.out.println("--------------------------------------------------------------------------");
		
		gerenciaAluno.deletarMatricula(aluno, listaAlunos);
		
		gerenciaAluno.isMatriculaAtiva(aluno);
		
	}
}
