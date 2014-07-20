import br.rodrigo.Dispositivo;
import br.rodrigo.processos.Produtor;
import br.rodrigo.estudoHeranca.CarroCorrida;
import br.rodrigo.estudoHeranca.CarroCorridaEspecializado;
import br.rodrigo.variaveis.Variaveis;
import br.rodrigo.classes.Public;
import br.rodrigo.interfaces.Corsa;
import br.rodrigo.interfaces.CorsaSedan;
//import br.rodrigo.fixacao.ClasseB;
import br.rodrigo.fixacao.outroPacote.ClasseC;
import br.rodrigo.variaveis.Variaveis;
import br.rodrigo.polimorfismo_sobrecarga.ClasseA;
import br.rodrigo.polimorfismo_sobrecarga.ClasseB;
import br.rodrigo.cores.Cores;
import br.rodrigo.tiposRetorno.TipoA;
import br.rodrigo.tiposRetorno.TipoB;

public class Aplicacao{

	static TipoA t = new TipoA();
	//static TipoB a = t.getTipo(); // Não dá certo porque estou tentando jogar um tipo dentro de uma referência do subtipo
	
	static TipoA ta = new TipoB();
	//static TipoB tb = ta.getTipo(); // Tb não dá certo pelo mesmo motivo. ta.getTipo() retorna um tipo TipoA
	
	static TipoB tipoB = new TipoB();

	// Tenho que fazer um upcastint para usar, pois o método dá um new TipoB e quero usar como TIpoA
	static TipoA novoTipoB = (TipoA)tipoB.getTipo();

	static TipoB tipoBEspecifico = tipoB.getTipoEspecifico();

	public static void main(String args[]){

			System.out.println(tipoB.toString());
			System.out.println(novoTipoB.toString());
			System.out.println(tipoBEspecifico);

			System.out.println(ta.getValor1()); 
			System.out.println(ta.getValor2());
			System.out.println(ta.getValor3());
			System.out.println(ta.getValor4());
	}	


















}
