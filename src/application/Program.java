package application;

import entities.Aluno;
import entities.Disciplina;
import entities.Matricula;
import entities.Turma;

public class Program {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("1", "Caroline");
		Aluno a2 = new Aluno("2", "Isabelle");
		
		Turma t1 = new Turma(1, "2021.A"); 
		Turma t2 = new Turma(2, "2021.B");
		
		Disciplina d1 = new Disciplina("POO", 72);
		Disciplina d2 = new Disciplina("BD", 54);
		
		Matricula m1 = new Matricula(a1, t1, d1);
		Matricula m2 = new Matricula(a1, t1, d2);
		Matricula m3 = new Matricula(a2, t2, d1);
		
		//Aluno 1
		a1.listarMatriculas();			
		m1.confirmar();
		a1.listarMatriculas();
		m1.trancar();
		m2.confirmar();
		a1.listarMatriculas();
		
		//Aluno 2
		a2.listarMatriculas();
		m3.confirmar();
		a2.listarMatriculas();
		m3.reprovar();
		a2.listarMatriculas();
	}
}
