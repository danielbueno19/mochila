package mochila;


public class Elemento {
    String nombre;
    double valor;
    double peso;

    public Elemento(String nombre, double valor, double peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elemento{" + "nombre=" + nombre + ", valor=" + valor + ", peso=" + peso + '}';
    }
    
    
}
