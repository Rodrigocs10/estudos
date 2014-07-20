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

public class Aplicacao{

	public static void main(String args[]){	
		Corsa c = new CorsaSedan();
		c.acelerar();
		c.freiar();
		c.voltar();
		c.getCor(Cores.VERMELHO);
}
}
