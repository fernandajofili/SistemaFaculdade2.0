package classes;

public class RendimentoEscolar {
	Aluno aluno;
	Disciplina disciplina;
	float nota1, nota2, nota3, notaProjeto;
	float []notasTrabalho = new float[3];
	String []trabalhos = new String[3];
	String projeto = "";
	
	public RendimentoEscolar() {
		super();
	}

	public RendimentoEscolar(Aluno aluno, Disciplina disciplina, float nota1, float nota2, float nota3) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
		
	public RendimentoEscolar(Aluno aluno, Disciplina disciplina, float[] notasTrabalho, String[] trabalhos) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.notasTrabalho = notasTrabalho;
		this.trabalhos = trabalhos;
	}

	public RendimentoEscolar(Aluno aluno, Disciplina disciplina, float notaProjeto, String projeto) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.notaProjeto = notaProjeto;
		this.projeto = projeto;
	}
	
	public RendimentoEscolar(Aluno aluno, Disciplina disciplina, float nota1, float nota2, float nota3, float notaProjeto,
			float[] notasTrabalho, String[] trabalhos, String projeto) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.notaProjeto = notaProjeto;
		this.notasTrabalho = notasTrabalho;
		this.trabalhos = trabalhos;
		this.projeto = projeto;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getNotaProjeto() {
		return notaProjeto;
	}

	public void setNotaProjeto(float notaProjeto) {
		this.notaProjeto = notaProjeto;
	}

	public float[] getNotasTrabalho() {
		return notasTrabalho;
	}

	public void setNotasTrabalho(float[] notasTrabalho) {
		this.notasTrabalho = notasTrabalho;
	}

	public String[] getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(String[] trabalhos) {
		this.trabalhos = trabalhos;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	
	
	
}
