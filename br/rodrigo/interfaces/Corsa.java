package br.rodrigo.interfaces;

public abstract class Corsa implements Carro{

	public void imprimirValores(){

		System.out.println("Acessando constante da interface " + a);
	}

	// Implementaçãoes obrigatóras da interface
	public void acelerar(){
		System.out.println("Acelerando o Corsa");
	}
	public abstract void freiar();
	public abstract void voltar();

}
