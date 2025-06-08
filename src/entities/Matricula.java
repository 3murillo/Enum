package entities;

import java.util.Date;
import entities.enums.Status;

public class Matricula {

	private Date dataMatricula;
	private Aluno aluno;
	private Disciplina disciplina;
	private Turma turma;
	private Status status;
	
	public Matricula(Aluno aluno, Turma turma, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.turma = turma;
		this.dataMatricula = new Date();
		this.status = Status.PENDENTE;
		aluno.adicionarDisciplinaMatriculado(this);
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Matricula [dataMatricula=" + dataMatricula + ", aluno=" + aluno + ", disciplina=" + disciplina
				+ ", turma=" + turma + ", status=" + status + "]";
	}
	
	public void confirmar() {
		if (this.status == Status.PENDENTE || this.status == Status.TRANCADO) {
			this.status = Status.CURSANDO;
		}
	}
	
	public void trancar() {
		if (this.status == Status.CURSANDO){
			this.status = Status.TRANCADO;
		}
	}
	
	public void aprovar() {
		if (this.status == Status.CURSANDO)	{
			this.status = Status.CONCLUIDO;
		}
	}
	
	public void reprovar() {
		if (this.status == Status.CURSANDO)
		{
			this.status = Status.REPROVADO;
		}
	}
}

