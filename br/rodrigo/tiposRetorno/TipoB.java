package br.rodrigo.tiposRetorno;

public class TipoB extends TipoA{

	/* Necessário upcasting para ser usado */
	public TipoA getTipo(){
		return new TipoB();
	}

	/* Tà sobrescrevendo, mesmo estando com tipo de retorno diferente, Isto porque
		está retornando um subtipo do tipo retornado pelo método subscrito .*/
	public TipoB getTipoEspecifico(){
		return new TipoB();
	}
	public String toString(){
		return "Tipo B";
	}
}
