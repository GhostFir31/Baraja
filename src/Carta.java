import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Carta {

    private String figura;
    private String color;
    private String numero;

    public Carta(String figura, String color, String numero) {
        this.figura = figura;
        this.color = color;
        this.numero = numero;
    }

    public Carta generarCartaAleatoria() {

      int aleatorioFigura;
      int aleatorioNumero;

      Random numeroAleatorio=new Random();

      HashMap<Integer,String> figuras = new HashMap<>() ;

      figuras.put(1,"Trebol");
      figuras.put(2,"Picas");
      figuras.put(3,"Diamante");
      figuras.put(4,"Corazon");
      figuras.put(5,"Joker");

      HashMap<Integer,String> color = new HashMap<>() ;

      color.put(1,"Rojo");
      color.put(2,"Negro");
      color.put(3," -----");

      HashMap<Integer,String> numeros = new HashMap<>() ;

      numeros.put(1,"A");
      numeros.put(2,"2");
      numeros.put(3,"3");
      numeros.put(4,"4");
      numeros.put(5,"5");
      numeros.put(6,"6");
      numeros.put(7,"7");
      numeros.put(8,"8");
      numeros.put(9,"9");
      numeros.put(10,"10");
      numeros.put(11,"J");
      numeros.put(12,"Q");
      numeros.put(13,"K");
      numeros.put(14,"----- ");
      
      aleatorioNumero=numeroAleatorio.nextInt(14)+1; 
      aleatorioFigura=numeroAleatorio.nextInt(4)+1; 

      if(aleatorioNumero==14){

        return new Carta(figuras.get(5), color.get(3), numeros.get(14));
      
     
      }else{

      if(aleatorioFigura == 1 || aleatorioFigura == 2){


        return new Carta(figuras.get(aleatorioFigura), color.get(2), numeros.get(aleatorioNumero));

      }else{
         
        return new Carta(figuras.get(aleatorioFigura), color.get(1), numeros.get(aleatorioNumero));
      }
   

      }

    }
    
    public HashSet<Carta> generar5Cartas(){
      
     Carta carta = new Carta(null, null, null);
    
     HashSet <Carta> baraja = new HashSet<>();

     do{
        baraja.clear();

     for(int i=0;i<5;i++){

        baraja.add(carta.generarCartaAleatoria());

     }
   }while(baraja.size() !=5);


      return baraja;
    }
   
    public String cartasGeneradaslegible(Carta carta){

      return " " + carta.getNumero() + " " + carta.getFigura() + " " + carta.getColor();
    }

    public String cartaGeneradaToString(){

        return  getNumero() + " " + getFigura() + " " + getColor();
     
        
    }
     
    public void conseguirCarta(HashSet<Carta> baraja){

      Random cartaEliminada = new Random();
      Carta cartaSeleccionada = null;
      int cartaPosicion;


      int i = 1;
      for (Carta carta : baraja) {
         System.out.println("Carta " + i + ": " + cartasGeneradaslegible(carta));
          i++;
      }
  
      cartaPosicion = cartaEliminada.nextInt(5)+1;
  
      i = 1;
    
      for (Carta carta : baraja) {
          if (i == cartaPosicion) {
              cartaSeleccionada = carta;
              break;
          }
          i++;
      }
  
      baraja.remove(cartaSeleccionada);

      System.out.println("se ha eliminado esta carta: " + cartasGeneradaslegible(cartaSeleccionada));
        i=1;
      for (Carta carta : baraja) {
        System.out.println("Carta " + i + ": " + cartasGeneradaslegible(carta));
         i++;
     }
    }

    public String getFigura() {
        return this.figura;
    }

    public String getColor() {
        return this.color;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
