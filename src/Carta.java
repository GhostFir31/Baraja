
public class Carta {

    private String figura;
    private String color;
    private int numero;

    public Carta(String figura, String color, int numero) {
        this.figura = figura;
        this.color = color;
        this.numero = numero;
    }

    public Carta generarCartaAleatoria() {
      

        return Carta;
    }

    public String getFigura() {
        return this.figura;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
