/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_fernandoherrera;
import java.util.Random;

/**
 *
 * @author herre
 */

//Clase de alquiler que tendra atributos tanto del vehiculo como el pago y la placa que se generara aleatorialemente

public class Alquiler {
    
    //Uso de un random para poder generar un numero de placa distinto para cada vehiculo que sea alquilado
    Random num = new Random();
    
    int letra = num.nextInt(27);
    
    int num1 = num.nextInt(10);
    
    
    
    private String tipo;
    private String marca;
    private String nombre;
    private int precio;
    

    public Alquiler(String tipo, String marca, String nombre, int precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        
        
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString (){
        return "\nNombre: " + tipo + "\n Marca: " + marca + "\n Nombre: " + nombre + "\n Precio por Dia: " + precio;
    }

    
}
    
    


