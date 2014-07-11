package br.rodrigo.processos;

public class Produtor{

private int contador =  0;
  public void gerarResultados(){
    new Thread(){
      // implementação de run
      public void run(){       
        for(int x = 1; x <= 5; x++){
          System.out.println("Contador:  " + contador++);
          try{
            Thread.sleep(1000);
          }catch(java.lang.InterruptedException e){
            System.out.println("Execção do Sleep");
          }

        }
      }
    }.start();
  }

}
