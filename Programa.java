package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import classes.Turma;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		Turma turma = new Turma();
		System.out.println(
				"x----------------------------------     PRIMO SISTEMAS     -----------------------------------x");
		String opcaoMenu = "";
		do {
			menu();
			opcaoMenu = sc.next().toUpperCase();
			switch (opcaoMenu) {
			case "1":
				// CADASTRAR TURMA
				if (!turma.existeTurma()) {
					System.out.println("\n> Cadastrar Turma");
					System.out.println("ID: ");
					turma.setIdTurma(sc.nextInt());

					System.out.println("Capacidade: ");
					turma.setCapacidade(sc.nextInt());
					System.out.println(turma.turmaCadastrada());
				} else {
					System.out.println(turma.turmaJaCadastrada());
				}
				break;
			case "2":
				// CONSULTAR TURMA
				System.out.println("\n> Consultar Turma");
				if (turma.existeTurma()) {
					System.out.println(turma.infoTurmaCompleta());
				} else {
					System.out.println(turma.consultarTurma());
				}
				break;
			case "3":
				// LISTAR ALUNOS DA TURMA
				System.out.println(turma.listarAlunosTurma());
				break;
			case "4":
				// CADASTRAR PROFESSOR
				if (turma.existeTurma()) {
					Professor professor = new Professor();
					System.out.println("\n Cadastro de Professor");
					System.out.println("ID: ");
					professor.setId(sc.nextInt());

					System.out.println("Nome: ");
					sc.nextLine();
					professor.setNome(sc.nextLine());

					System.out.println("Data de Nascimento: ");
					professor.setDataNasc(data.parse(sc.next()));

					System.out.println("Cargo: ");
					sc.nextLine();
					professor.setCargo(sc.nextLine());

					System.out.println("Usuário: ");
					professor.setUser(sc.next());

					System.out.println("Senha: ");
					professor.setSenha(sc.next());
					turma.setProfessor(professor);
					System.out.println(turma.professorCadastrado());
				} else {
					System.out.println(turma.turmaNaoCadastrada());
				}
				break;
			case "5":
				// CONSULTAR PROFESSOR
				System.out.println("\n> Consultar Professor");
				System.out.println(turma.consultarProfessor());
				break;
			case "6":
				// REMOVER PROFESSOR
				System.out.println("\n> Remover Professor");
				System.out.println("TEM CERTEZA QUE DESEJA REMOVER O PROFESSOR CADASTRADO?\tS - SIM");
				System.out.println(turma.removerProfessor(sc.next()));
				break;
			case "7":
				// CADASTRAR DISCIPLINA
				if (turma.existeTurma()) {
					Disciplina disciplina = new Disciplina();
					System.out.println("\n> Cadastrar Disciplina");
					System.out.println("ID: ");
					disciplina.setIdDisciplina(sc.nextInt());

					System.out.println("Nome: ");
					sc.nextLine();
					disciplina.setNomeDisciplina(sc.nextLine());

					System.out.println("Ementa: ");
					disciplina.setEmenta(sc.nextLine());
					turma.setDisciplina(disciplina);
					System.out.println(turma.disciplinaCadastrada());
				} else {
					System.out.println(turma.turmaNaoCadastrada());
				}
				break;
			case "8":
				// CONSULTAR DISCIPLINA
				System.out.println("\n> Consultar Disciplina");
				System.out.println(turma.consultarDisciplina());
				break;
			case "13":
				// CADASTRAR ALUNO
				if (turma.existeTurma()) {
					if (!turma.turmaLotada()) {
						System.out.println("\n> Cadastro de Aluno");
						Aluno aluno = new Aluno();

						System.out.println("ID: ");
						aluno.setId(sc.nextInt());

						System.out.println("Nome: ");
						sc.nextLine();
						aluno.setNome(sc.nextLine());

						System.out.println("Data de Nascimento: ");
						aluno.setDataNasc(data.parse(sc.next()));

						System.out.println("Período: ");
						aluno.setPeriodo(sc.nextInt());

						System.out.println("Usuário: ");
						aluno.setUser(sc.next());

						System.out.println("Senha: ");
						aluno.setSenha(sc.next());

						turma.cadastrarAluno(aluno);
						System.out.println(turma.alunoCadastrado());
					} else {
						System.out.println(turma.turmaLotadaMensagem());
					}
				} else {
					System.out.println(turma.turmaNaoCadastrada());
				}
				break;
			case "14":
				// CONSULTAR ALUNO
				System.out.println("\n> Consultar Aluno");
				System.out.println("Nome: ");
				sc.nextLine();
				turma.consultarAluno(sc.nextLine());
				break;
			case "15":
				// REMOVER ALUNO
				System.out.println("\n> Remoção de Aluno");
				System.out.println("Nome: ");
				sc.nextLine();
				turma.removerAluno(sc.nextLine());
				break;

			case "X":
				System.out.println("...");
			default:
				System.out.println("Opção inválida.");
			}
		} while (!opcaoMenu.equals("X"));

		sc.close();
	}

	public static void menu() {
		System.out.println("(1) Cadastrar Turma\t(2) Consultar Turma\t(3) Listar Alunos da Turma");
		System.out.println("(4) Cadastrar Professor\t(5) Consultar Professor\t(6) Remover Professor");
		System.out.println(
				"(7) Cadastrar Disciplina\t(8) Consultar Disciplina\t(9) Remover Disciplina\t(12) Listar Disciplina");
		System.out.println("(13) Cadastrar Aluno\t(14) Consultar Aluno\t(15) Remover Aluno");
		System.out.println("\nX - Sair");
	}

}
