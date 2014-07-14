package br.rodrigo.fixacao;

public class ClasseB{
	
	public ClasseB(){
		ClasseA ca = new ClasseA();
		// pode acessar método protegido por instância de classe do mesmo pacote
		System.out.println(ca.x);
	}


}
