import br.rodrigo.Dispositivo;
import br.rodrigo.processos.Produtor;
import br.rodrigo.estudoHeranca.CarroCorrida;
import br.rodrigo.estudoHeranca.CarroCorridaEspecializado;
import br.rodrigo.variaveis.Variaveis;
import br.rodrigo.classes.Public;
import br.rodrigo.interfaces.Corsa;
//import br.rodrigo.fixacao.ClasseB;
import br.rodrigo.fixacao.outroPacote.ClasseC;
import br.rodrigo.variaveis.Variaveis;
import br.rodrigo.polimorfismo_sobrecarga.ClasseA;
import br.rodrigo.polimorfismo_sobrecarga.ClasseB;

public class Aplicacao{

	public static void main(String args[]){	

		ClasseA ca = new ClasseA();
		ca.correr();
	
		ClasseA cb = new ClasseB();
		// não dá certo chamar a versão overloaded de correr(int) porque ClasseA não implementa esta versão.
		// Ao contrários de métodos sobrescritos, overloaded são chamados baseados no tipo da referência e não da Instância
		// cb.correr(100); ERRADO
		cb.correr(); // CORRETO
	
		// Para poder chamar a versão correr(int)
		ClasseB cb_2 = new ClasseB();
		cb_2.correr(100, "Norte");

		try{
			cb_2.dividirNumero(1, 0);
		}catch(ArithmeticException e){
			System.out.println("Erro de divisão por zero");
		}
}
}
