import br.rodrigo.Dispositivo;
import br.rodrigo.processos.Produtor;
import br.rodrigo.estudoHeranca.CarroCorrida;
import br.rodrigo.estudoHeranca.CarroCorridaEspecializado;

public class Aplicacao{

  private boolean ligado;

  public static void main(String args[]){
    /*Dispositivo dispositivo = new Dispositivo();
    dispositivo.setAtivado(true);
    System.out.println("Ativado: " + dispositivo.isAtivado());
    System.out.println("Leitura: " + dispositivo.leitura);
    Produtor produtor = new Produtor();
    produtor.gerarResultados();
    System.out.println("Teste de Processo");

  produtor.gerarResultados();
    System.out.println("Teste de Processo"); */

	
	CarroCorridaEspecializado c = new CarroCorridaEspecializado();	
	System.out.println("Velocidade: " + c.getVelocidade());
  }

}
