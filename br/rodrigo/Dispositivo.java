package br.rodrigo;

public class Dispositivo{

  public Dispositivo(){
    leitura = 10;
    ativado = false;
  }

  // Variável de propriedade
  private boolean ativado;

  // Acesso Livre
  public int leitura;

  public boolean isAtivado(){
    return this.ativado;
  }

  public void setAtivado(boolean ativado){
    this.ativado = ativado;
  }

}
