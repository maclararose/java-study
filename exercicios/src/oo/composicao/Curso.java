package oo.composicao;

import java.util.ArrayList;

public class Curso {
	String titulo;
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	Curso(String titulo) {
		this.titulo = titulo;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
