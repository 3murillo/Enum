package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String cpf;
	private String nome;
	private List<Matricula> listaMatricula = new ArrayList<>();
	
	public Aluno(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Matricula> getListaMatricula() {
		return listaMatricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [cpf=" + cpf + ", nome=" + nome + "]";
	}

	public boolean adicionarDisciplinaMatriculado(Matricula matricula) {
	
		if ( matricula != null && !listaMatricula.contains(matricula) ) {
			this.listaMatricula.add(matricula);
			return true;
		}
		
		return false;
	}
	
	public boolean removerDisciplinaMatriculado(Matricula matricula) {
		
		if ( matricula != null && listaMatricula.size() > 0 && listaMatricula.contains(matricula) ) {
			this.listaMatricula.remove(matricula);
			return true;
		}
		
		return false;
	}	
	
	public void listarMatriculas() {
	
		System.out.println();
		if (listaMatricula.isEmpty()) {
			System.out.println("Aluno(a)" + this.nome + " n�o est� matriculado(a) em nenhuma disciplina!");
		}
		else {
			System.out.println("Aluno(a)" + this.nome);
			for (Matricula m : this.listaMatricula ) {
				System.out.println("\tDisciplina: " + m.getDisciplina().getNome()
						+ " (Turma: " + m.getTurma().getNome() + ") "
						+ " Status: " + m.getStatus().getDescricao() ); 
			}
		}
	}
}
