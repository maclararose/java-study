package classe;

public class Usuario {
	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof Usuario) {
//			Usuario outro = (Usuario) obj;
//			
//			return super.equals(obj);
//		} else {
//			return false;
//		}
		Usuario outro = (Usuario) obj;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
	}
}
