public class Porta{

  boolean isOpen;
  int numAberturas =0;

  void abrir(){
    isOpen = true;
    numAberturas++;
  }

  void fechar(){
    isOpen = false;
  }

  
}