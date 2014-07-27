//import br.rodrigo.Dispositivo;
//import br.rodrigo.processos.Produtor;
//import br.rodrigo.estudoHeranca.CarroCorrida;
//import br.rodrigo.estudoHeranca.CarroCorridaEspecializado;
//import br.rodrigo.variaveis.Variaveis;
//import br.rodrigo.classes.Public;
//import br.rodrigo.interfaces.Corsa;
//import br.rodrigo.interfaces.CorsaSedan;
//import br.rodrigo.fixacao.ClasseB;
//import br.rodrigo.fixacao.outroPacote.ClasseC;
//import br.rodrigo.variaveis.Variaveis;
//import br.rodrigo.polimorfismo_sobrecarga.ClasseA;
//import br.rodrigo.polimorfismo_sobrecarga.ClasseB;
//import br.rodrigo.cores.Cores;
//import br.rodrigo.tiposRetorno.TipoA;
//import br.rodrigo.tiposRetorno.TipoB;
//import br.rodrigo.declarandoArrays.Arrays;
import br.rodrigo.blocosInicializacao.*;

public class Aplicacao{
	public static void main(String args[]){
		ClasseB b = new ClasseB();
		System.out.println("--------------------------------------------");
	
		/* Blocos estáticos não serão mais executados. Pois a classe
			já está carregada */
		ClasseB b2 = new ClasseB();
	}	
}
