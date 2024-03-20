
public class Main {
  public static void main(String[] args) {

    Porta p = new Porta();
    boolean resp;

    do{
      p.fechar();
    System.out.println("Deseja abrir a porta?");
    resp =Boolean.parseBoolean(System.console().readLine());
    if(resp){
      p.abrir();
    }
    }while(resp);
    p.fechar();
    
    System.out.println("A porta foi fechada \nNúmeros de vezes que a porta foi aberta: " + p.numAberturas);
    
  }

 
}