package br.rodrigo.blocosInicializacao;

/* 1) Blocos estáticos são executados. Classe sendo carregada
	2) BLocos de instância são carregados. Instância sendo criada
	3) Construtor da classe é executado. Instância sendo criada
	4) Construtor da classe mãe é chamado. Instância sendo criada */
public class ClasseB extends ClasseA{

	static{
		System.out.println("Executando bloco estático Classe B");
	}	

	public ClasseB(){
		System.out.println("Executnado constutor classe B");
	}

	{
		System.out.println("Executnado bloco de instância 1 classe B");
	}

	{
		System.out.println("Executnado bloco de instância 2 classe B");
	}
	
	static{
		System.out.println("Executnado bloco estático 2 classe B");
	}
	
}
