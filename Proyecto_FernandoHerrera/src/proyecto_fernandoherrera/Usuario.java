/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_fernandoherrera;

/**
 *
 * @author herre
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String motivo;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public String toString (){
        return "\n Nombre: " + nombre + "\n Edad: " + edad + "\n Motivo: " + motivo;
    }


    
}
