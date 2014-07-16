package br.rodrigo.polimorfismo_sobrecarga;

public class ClasseA implements InterfaceA{

	public void correr(){
		System.out.println("Correndo com implementação de Classe A ..." );
	}	

	public void dividirNumero(int a, int b) throws Exception{
			System.out.println(a/b);
	}

}
