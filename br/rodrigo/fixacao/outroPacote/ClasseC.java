package br.rodrigo.fixacao.outroPacote;

import br.rodrigo.fixacao.ClasseA;

public class ClasseC extends ClasseA{
	
	public ClasseC(){
	
		System.out.println("Acesso a x dentro de Classe C " + x)	;
		
		/*  x has protected access in br.rodrigo.fixacao.ClasseA */
		//ClasseA ca = new ClasseA();
		//System.out.println(ca.x);

		
	}

}
