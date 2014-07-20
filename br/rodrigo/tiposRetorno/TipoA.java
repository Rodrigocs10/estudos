package br.rodrigo.tiposRetorno;

public class TipoA{

	public TipoA getTipo(){
		return new TipoA();
	}

	public TipoA getTipoEspecifico(){
		return new TipoA();
	}

	public String toString(){
		return "Tipo A";
	}

	/* Retornando tipos usando cast implicito ou explícito */
	public int getValor1(){
		return 'c'; // cast implícito.
	}

	public byte getValor2(){
		return 'c'; // cast implícito
	}

	public char getValor3(){
		
		// Dá erro porque o numero retornado é maior que o tipo char
		// return 99999999; // cast implcito. 
		return 65000;
		/* TODO: pesquisar porque dá certo implicitamente já que o tipo derotnado é maior que o tipo de retorno 
			Obs.: Só dá erro de compilaçao de o valor retornado for maior que o tamanho do tipo char, pois o compilador 
					tem condições de fazer esta chacagem.	
	*/
	}

	public char getValor4(){
		return (char)99999999; // Funciona com cast explícito mas bits são truncados para ficar do tamanho de char
	}













}
