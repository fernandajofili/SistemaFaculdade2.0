package classes;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	int idTurma, capacidade;
	Disciplina disciplina;
	Professor professor;
	List<Aluno> alunoTurmaLista = new ArrayList<>();

	public Turma() {
	}

	public Turma(Disciplina disciplina, Professor professor) {
		this.disciplina = disciplina;
		this.professor = professor;
	}

	public Turma(int idTurma, int capacidade) {
		super();
		this.idTurma = idTurma;
		this.capacidade = capacidade;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunoTurmaLista() {
		return alunoTurmaLista;
	}

	public void setAlunoTurmaLista(List<Aluno> alunoTurmaLista) {
		this.alunoTurmaLista = alunoTurmaLista;
	}

	// STRING

	public String disciplinaCadastrada() {
		return "Disciplina cadastrada com sucesso!\n";
	}

	public String disciplinaNaoCadastrada() {
		return "Disciplina não cadastrada. Cadastre uma.\n";
	}

	public String alunoCadastrado() {
		return "Aluno cadastrado com sucesso!\n";
	}

	public String professorCadastrado() {
		return "Professor cadastrado com sucesso!\n";
	}

	public String professorNaoCadastrado() {
		return "Professor não cadastrado. Cadastre um.\n";
	}

	public String professorRemovido() {
		return "Professor removido com sucesso!\n";
	}

	public String turmaCadastrada() {
		return "Turma cadastrada com sucesso!\n";
	}

	public String turmaNaoCadastrada() {
		return "Turma não cadastrada. Cadastre uma.\n";
	}

	public String turmaJaCadastrada() {
		return "Turma já cadastrada.\n";
	}

	public String turmaLotadaMensagem() {
		return "Turma lotada. Não é possível adicionar um aluno.\n";
	}

	public String consultarTurma() {
		return "Não é possível consultar a turma.\n";
	}

	public String infoAluno(int i) {
		return "ID: " + getAlunoTurmaLista().get(i).getId() + "\tNOME: " + getAlunoTurmaLista().get(i).getNome()
				+ "\tUSER: " + getAlunoTurmaLista().get(i).getUser() + "\tPERÍODO: "
				+ getAlunoTurmaLista().get(i).getPeriodo() + "\n";
	}

	public String infoProfessor() {
		return "PROFESSOR: " + getProfessor().getId() + " - " + getProfessor().getNome();
	}

	public String infoDisciplina() {
		return "DISCIPLINA: " + getDisciplina().getIdDisciplina() + " - " + getDisciplina().getNomeDisciplina() + "\n";
	}

	public String infoTurma() {
		return "TURMA " + getIdTurma() + "\nCapacidade: " + getCapacidade() + "\n";
	}

	public String infoTurmaCompleta() {
		if (getDisciplina() != null && getProfessor() != null) {
			return infoTurma() + infoDisciplina() + infoProfessor();
		} else {
			if (getDisciplina() == null && getProfessor() != null) {
				return infoTurma() + "\nDISCIPLINA: não cadastrada.\t" + infoProfessor();
			} else {
				if (getDisciplina() != null && getProfessor() == null) {
					return infoTurma() + infoDisciplina() + "\nPROFESSOR: não cadastrado.\n";
				} else {
					return infoTurma() + "\nDISCIPLINA: não cadastrada.\nPROFESSOR: não cadastrado.\n";
				}
			}
		}
	}

	// TURMA

	public boolean existeTurma() {
		if (getCapacidade() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean turmaLotada() {
		if (getCapacidade() > getAlunoTurmaLista().size()) {
			return false;
		} else {
			return true;
		}
	}

	// ALUNO

	public void cadastrarAluno(Aluno aluno) {
		this.alunoTurmaLista.add(aluno);
	}

	public int buscarAluno(String nomeAluno) {
		boolean encontrou = false;
		int i;
		for (i = 0; i < getAlunoTurmaLista().size(); i++) {
			if (getAlunoTurmaLista().get(i).getNome().equals(nomeAluno)) {
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}
		}
		if (encontrou == false) {
			System.out.println("Aluno não encontrado.\n");
			return i = -1;
		} else {
			return i;
		}
	}

	public String listarAlunosTurma() {
		StringBuilder sb = new StringBuilder();
		if (alunoTurmaLista.size() > 0) {
			for (Aluno aluno : alunoTurmaLista) {
				sb.append(aluno.getId() + " - " + aluno.getNome() + "\n");
			}
			return sb.toString();
		} else {
			return "Nenhum aluno cadastrado.";
		}
	}

	public boolean removerAluno(String nomeAluno) {
		boolean removeu = false;
		if (!nomeAluno.isBlank()) {
			if (getAlunoTurmaLista().size() > 0) {
				for (int i = 0; i < getAlunoTurmaLista().size(); i++) {
					if (getAlunoTurmaLista().get(i).getNome().equals(nomeAluno)) {
						getAlunoTurmaLista().remove(i);
						removeu = true;
						System.out.println("Aluno removido com sucesso!");
						break;
					} else {
						removeu = false;
					}
				}
			} else {
				System.out.println("Turma vazia.");
			}
		}
		if (removeu == false) {
			System.out.println("Aluno não encontrado");
		}

		return removeu;
	}

	public void consultarAluno(String nomeAluno) {
		int i = buscarAluno(nomeAluno);
		if (i != -1) {
			System.out.println(infoAluno(i));
		}
	}

	public boolean professorJaCadastrado() {
		if (this.professor == null) {
			return false;
		} else {
			return true;
		}
	}

	public String consultarProfessor() {
		if (professorJaCadastrado()) {
			return infoProfessor();
		} else {
			return professorNaoCadastrado();
		}
	}

	public String removerProfessor(String confirma) {
		if (confirma.toUpperCase().equals("S")) {
			if (professorJaCadastrado()) {
				setProfessor(null);
				return professorRemovido();
			} else {
				return professorNaoCadastrado();
			}
		} else {
			return "";
		}
	}

	public boolean disciplinaJaCadastrada() {
		if (this.disciplina == null) {
			return false;
		} else {
			return true;
		}
	}

	public String consultarDisciplina() {
		if (disciplinaJaCadastrada()) {
			return infoDisciplina();
		} else {
			return disciplinaNaoCadastrada();
		}
	}
}
