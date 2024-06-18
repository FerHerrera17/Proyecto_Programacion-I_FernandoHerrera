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
    private String tipo;
    private String marca;
    private String nombre;
    private int precio;
    private int cantidad;
    

    public Alquiler(String tipo, String marca, String nombre, int precio, int cantidad) {
        this.tipo = tipo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    Alquiler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    public int getCantidad (){
        return cantidad;
    }
    
    public void setCantidad (int cantidad){
        if (cantidad < 0){
            cantidad = 0;
            this.cantidad = cantidad;
        }
        else {
            this.cantidad = cantidad;
        }
    }

    @Override
    public String toString (){
        return "\nNombre: " + tipo + "\nMarca: " + marca + "\nNombre: " + nombre + "\nPrecio por Dia: " + precio + "\nVehiculos Disponibles: " + cantidad;
    }
}
    
    


