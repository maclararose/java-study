package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno a = new Aluno("Maria");
		Aluno b = new Aluno("João");
		Aluno c = new Aluno("Thales");
		
		Curso curso1 = new Curso("Fotografia");
		Curso curso2 = new Curso("Desenvolvimento Java");
		Curso curso3 = new Curso("Programação em Swift");
		
		curso1.adicionarAluno(a);
		curso1.adicionarAluno(c);
		
		curso2.adicionarAluno(a);
		curso2.adicionarAluno(b);
		
		curso3.adicionarAluno(a);
		curso3.adicionarAluno(b);
		curso3.adicionarAluno(c);
		
		// a.adicionarCurso(curso3); -> também funcionaria
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso: "+ curso3.titulo + " e o meu nome é: "+aluno.nome);
		}
		
		System.out.println(a.cursos.get(0).alunos);
		
		Curso cursoEncontrado = a.obterCursoPorNome("Fotografia");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.titulo);
			System.out.println(cursoEncontrado.alunos);			
		}
	}

}
