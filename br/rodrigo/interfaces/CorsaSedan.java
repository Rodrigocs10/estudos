package br.rodrigo.interfaces;

import br.rodrigo.cores.Cores;

public class CorsaSedan extends Corsa{

	public void freiar(){
		System.out.println("Freinando corsa sedan");
	}

	public void voltar(){
		System.out.println("Voltando corsa sedan");
	}

	public void getCor(String cor){
		System.out.println("Corsa Sedan de cor " + cor);
	}

}
