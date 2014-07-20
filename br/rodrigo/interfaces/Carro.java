package br.rodrigo.interfaces;

import br.rodrigo.transporte.Transporte;
import br.rodrigo.cores.Cores;

interface Carro extends Transporte, Cores{
	/* Várias formas de declarar uma constante em uma interface*/
	int x = 1;
	int y = 2;
	public static final int a = 3;
	public static int b = 4;
	public int c = 5;
	static int d = 6;

	// modifier private not allowed here. Erro de compilação
	// private static final int e = 7;
	
	// modifier abstract not allowed here. Erro de compilação
	// abstract int f = 8;

	/* Várias maneiras de declarar um contrato de método na interface.
	  Obs.: Sempre será abstrato e publico.
	*/
	public abstract void freiar();

}
