package gerenciar.matricula.tcc.rn;

import java.util.ArrayList;

import gerenciar.matricula.tcc.interfaces.GerenciaMatricula;
import gerenciar.matricula.tcc.vo.*;

public class GerenciaAluno implements GerenciaMatricula {
	
	public GerenciaAluno() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isMatriculaAtiva(AlunoVO matricula) {
		if(matricula.isStatusMatricula() != true) {
			System.out.println("Matrícula do aluno não está ativa!");
			return true;
		}else{
			System.out.println("Matrícula do aluno está ATIVA!");
			return false;
		}
	}

	@Override
	public void efetuarMatricula(AlunoVO matricula) {
		// TODO Auto-generated method stub
		if(matricula.isStatusMatricula() != true) {
			matricula.setStatusMatricula(true);
			System.out.println("A matrícula do aluno foi EFETVADA!");
		}else {
			System.out.println("A matrícula ja está efetivada");
		}
	}


	@Override
	public void atualizarMatricula(AlunoVO aluno) {
		// TODO Auto-generated method stub
		System.out.println("Atualizando dados...");
		aluno.setNome("Alvair do Santos");
		aluno.setMatricula(198204589);
		aluno.setCurso("Ciência da Computação");
		aluno.setCodigo("TCC II");
		aluno.setNomeDisciplina("ENG0N-312");
		System.out.println("Dados de matrícula atualizados!");
	}


	@Override
	public void consultarMatricula(AlunoVO matricula) {
		// TODO Auto-generated method stub
		if(matricula.isStatusMatricula() != true) {
			System.out.println("Matrícula do aluno não está ativa!");
		}else{
			System.out.println("Matrícula do aluno está ATIVA!");
			System.out.println("Nome do Aluno: " + matricula.getNome());
			System.out.println("Número de matrícula: " + matricula.getMatricula());
			System.out.println("Disicplina do TCC: " + matricula.getCurso());
			System.out.println("Disciplina cadastrada: "+ matricula.getCodigo()+" - "+ matricula.getNomeDisciplina());
		}
	}


	@Override
	public void deletarMatricula(AlunoVO aluno, ArrayList<AlunoVO> listaAluno) {
		// TODO Auto-generated method stub
		aluno.setNome(null);
		aluno.setMatricula(0);
		aluno.setCurso(null);
		aluno.setCodigo(null);
		aluno.setNomeDisciplina(null);
		
		listaAluno.remove(aluno);
		aluno.setStatusMatricula(false);
		
		listaAluno.remove(aluno);
		System.out.println("Cadastro do aluno foi EXCLUÍDO!");
	}
}