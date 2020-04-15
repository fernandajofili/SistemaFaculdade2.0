package classes;

import java.util.Date;

public class Aluno extends Pessoa {
	int periodo;


	public Aluno() {
		super();
	}

	public Aluno(int id, String nome, Date dataNasc, String user, String senha, int periodo) {
		super(id, nome, dataNasc, user, senha);
		this.periodo = periodo;
	}
	
	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

}
