package br.rodrigo.blocosInicializacao;

public class ClasseA{

	static{
		System.out.println("Executando bloco estático classe A");
	}
	
	public ClasseA(){
		System.out.println("Excecutando construtor classe A");
	}

	{
		System.out.println("Executnado bloco de instância classe A");
	}
	
}
