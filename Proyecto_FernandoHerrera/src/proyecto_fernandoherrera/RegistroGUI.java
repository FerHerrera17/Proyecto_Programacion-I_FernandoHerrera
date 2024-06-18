/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_fernandoherrera;

/**
 *
 * @author herre
 */
public class RegistroGUI {
    String nombre;
    int edad;
    String motivo;
    String tipo_auto;
    String marca_auto;
    int dia_alquiler;

    public RegistroGUI() {
    }

    public RegistroGUI(String nombre, int edad, String motivo, String tipo_auto, String marca_auto, int dia_alquiler) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivo = motivo;
        this.tipo_auto = tipo_auto;
        this.marca_auto = marca_auto;
        this.dia_alquiler = dia_alquiler;
    }

    @Override
    public String toString() {
        return "RegistroGUI{" + "nombre=" + nombre + ", edad=" + edad + ", motivo=" + motivo + ", tipo_auto=" + tipo_auto + ", marca_auto=" + marca_auto + ", dia_alquiler=" + dia_alquiler + '}';
    }

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

    public String getTipo_auto() {
        return tipo_auto;
    }

    public void setTipo_auto(String tipo_auto) {
        this.tipo_auto = tipo_auto;
    }

    public String getMarca_auto() {
        return marca_auto;
    }

    public void setMarca_auto(String marca_auto) {
        this.marca_auto = marca_auto;
    }

    public int getDia_alquiler() {
        return dia_alquiler;
    }

    public void setDia_alquiler(int dia_alquiler) {
        this.dia_alquiler = dia_alquiler;
    }
}
