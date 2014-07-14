package br.rodrigo.interfaces;

public class Corsa implements Carro{

	public void imprimirValores(){

		System.out.println("Acessando constante da interface " + a);
	}

	// Implementaçãoes obrigatóras da interface
	public void acelerar(){}
	public void freiar(){}
	public void voltar(){}

}
