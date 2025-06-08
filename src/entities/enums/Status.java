package entities.enums;

public enum Status {

	PENDENTE("Matr�cula pendente"),
	CURSANDO("Aluno(a) cursando"),
	TRANCADO("Matr�cula trancada"),
	CONCLUIDO("Aluno(a) aprovado(a)"),
	REPROVADO("Aluno(a) reprovado(a)");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
