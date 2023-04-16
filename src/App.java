import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
       
        App app= new App();

       app.Baraja();
    }


    public void Baraja(){
      
     Carta carta= new Carta(null, null, null);

     HashSet <Carta> baraja = new HashSet<>() ;
     
     /* 
     carta=carta.generarCartaAleatoria();
     
     System.out.println(" " + carta);
     */

     baraja=carta.generar5Cartas();

     carta.conseguirCarta(baraja);

    }
}
