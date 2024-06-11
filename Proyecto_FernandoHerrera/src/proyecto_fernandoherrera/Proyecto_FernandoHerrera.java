/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_fernandoherrera;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author herre
 */
public class Proyecto_FernandoHerrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el Scanner para poder tener respuesta del usuario
        Scanner read = new Scanner (System.in);
        
        //Un arraylist que nos manejara los vehiculos que estan disponibles
        ArrayList<Alquiler> listado = new ArrayList();
        
        
        //Autos de tipo Sedan
        listado.add(new Alquiler("Sedan", "Kia", "Morning", 1200));
        listado.add(new Alquiler("Sedan", "Kia", "Picanto", 1000));
        listado.add(new Alquiler("Sedan", "Kia", "Soluto", 1500));
        listado.add(new Alquiler("Sedan", "Kia", "Rio", 1200));
        
        //Auto de tipo SUV
        listado.add(new Alquiler("SUV", "Toyota", "Rush", 1800));
        listado.add(new Alquiler("SUV", "Chevrolet", "Captiva", 2000));
        listado.add(new Alquiler("SUV", "Volkswagen", "Nivus", 1800));
        listado.add(new Alquiler("SUV", "Kia", "Seltos", 1800));
        listado.add(new Alquiler("SUV", "Kia", "Sportage", 2000));
        listado.add(new Alquiler("SUV", "Mitsubishi", "Montero Sport", 2500));
        listado.add(new Alquiler("SUV", "Toyota", "Prado", 2500));
        
        //Autos de tipo Pickup
        listado.add(new Alquiler("Pickup", "Nissan", "Frontier", 1800));
        listado.add(new Alquiler("Pickup", "Chevrolet", "Colorado", 1800));
        
        //Autos de tipo VAN
        listado.add(new Alquiler("VAN", "Toyota", "Hiace", 2400));
        
        int op;        
        
        //Menu introductorio para el alquiler
        do {
            System.out.println("-------------------------------------------");
            System.out.println("BIENVENIDOS A NUESTRO ALQUILER DE VEHICULOS");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("--------------MENU DE OPCIONES-------------");
            System.out.println("1. Ver catalogo de vehiculos");
            System.out.println("2. Alquilar");
            System.out.println("3. Salir del sistema");
            op = read.nextInt();
        
        switch (op){
            case 1: 
                //En esta primera opcion, al usario se la da la oportunidad de ver todos los vehiculos que hay y asi escoger el que mejor le convenga
                System.out.println("Aqui le dejamos un catalogo de nuestros mejores vehiculos");
                System.out.println("Diganos el tipo de vehiculo que desea: ");
                System.out.println("1. Sedan");
                System.out.println("2. SUV");
                System.out.println("3. Pickup");
                System.out.println("4. VAN");
                int tipo = read.nextInt();
                
                if (tipo == 1){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("Sedan")){
                            
                            System.out.println(listado.get(i));
                            System.out.println("-----------------");
                        }
                    }
                }
                else if (tipo == 2){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("SUV")){
                            
                            System.out.println(listado.get(i));
                            System.out.println("-----------------");
                        }
                    }
                }
                else if (tipo == 3){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("Pickup")){
                            
                            System.out.println(listado.get(i));
                            System.out.println("-----------------");
                        }
                    }
                }
                else if (tipo == 4){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("VAN")){
                            
                            System.out.println(listado.get(i));
                            System.out.println("-----------------");
                            
                        }
                    }
                }
                else {
                    System.out.println("Su opcion no es valida");
                }
                System.out.println("");
                break;
            case 2: 
                //Se mostrara los vehiculos en un formato distinto para que el usuario pueda ver las opciones y de esa manera escoger
                Usuario persona = new Usuario();
                System.out.println("");
                System.out.println("Nos complace saber que desea alquilar uno de nuestros vehiculos");
                System.out.println("");
                //Le pediremos informacion al usuario parar tener registro del alquiler
                System.out.println("----------SOLICITUD DE INFORMACION----------");
                System.out.print("Ingrese su nombre: ");
                read.nextLine();
                String nombre = read.nextLine();
                persona.setNombre(nombre);
                System.out.print("Ingrese su edad: ");
                int edad = read.nextInt();
                //Hay que verificar que sea una persona determinada o "mayor de edad" para que pueda alquilar un vehiculo
                while (edad < 18){
                    System.out.println("Tiene que ser mayor de 18 para poder alquilar uno de nuestros vehiculos");
                    System.out.println("Intente de nuevo");
                    System.out.println("Ingrese su edad: ");
                    edad = read.nextInt();
                    persona.setEdad(edad);
                }
                
                setMotivo(persona);
                
                //Mostramos nuevamente la opcion de los vehiculos pero con un formato distinto para que sea mas uniforme y el usuario pueda ingresar su opcion
                System.out.println("");
                System.out.println("Diganos el tipo de vehiculo: ");
                System.out.println("1. Sedan");
                System.out.println("2. SUV");
                System.out.println("3. Pickup");
                System.out.println("4. VAN");
                tipo = read.nextInt();
                
                if (tipo == 1){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("Sedan")){
                            System.out.println("-----------------");
                            System.out.println("Opcion " + i + "\n" + "Marca : " + listado.get(i).getMarca() + ", Nombre: " + listado.get(i).getNombre() + ", Precio: " + listado.get(i).getPrecio());
                            System.out.println("-----------------");
                            System.out.println("");
                        }
                    }
                    //Una vez que se muestra la lista de los vehiculos, le pedimos que ingrese la opcion de los vehiculos
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
                    //Le pediremos la cantidad de dias que alquilara el vehiculo y luego hacer el calculo de lo que se tendra que pagar en total
                    System.out.println("Ingrese la cantidad de dias que alquilara el vehiculo: ");
                    int tiempo = read.nextInt();
                    System.out.println("");
                    listado.get(num);
                    //Uso del metodo
                    Factura(num, tiempo, persona, listado);
                    break;
                }
                else if (tipo == 2){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("SUV")){
                            System.out.println("-----------------");
                            System.out.println("Opcion " + i + "\n" + "Marca : " + listado.get(i).getMarca() + ", Nombre: " + listado.get(i).getNombre() + ", Precio: " + listado.get(i).getPrecio());
                            System.out.println("-----------------");
                            System.out.println("");
                        }
                    }
                    //Una vez que se muestra la lista de los vehiculos, le pedimos que ingrese la opcion de los vehiculos
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
                    //Le pediremos la cantidad de dias que alquilara el vehiculo y luego hacer el calculo de lo que se tendra que pagar en total
                    System.out.println("Ingrese la cantidad de dias que alquilara el vehiculo: ");
                    int tiempo = read.nextInt();
                    System.out.println("");
                    listado.get(num);
                    //Uso del metodo
                    Factura(num, tiempo, persona, listado);
                    break;
                }
                else if (tipo == 3){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("Pickup")){
                            System.out.println("-----------------");
                            System.out.println("Opcion " + i + "\n" + "Marca : " + listado.get(i).getMarca() + ", Nombre: " + listado.get(i).getNombre() + ", Precio: " + listado.get(i).getPrecio());
                            System.out.println("-----------------");
                            System.out.println("");
                        }
                    }
                    //Una vez que se muestra la lista de los vehiculos, le pedimos que ingrese la opcion de los vehiculos
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
                    //Le pediremos la cantidad de dias que alquilara el vehiculo y luego hacer el calculo de lo que se tendra que pagar en total
                    System.out.println("Ingrese la cantidad de dias que alquilara el vehiculo: ");
                    int tiempo = read.nextInt();
                    System.out.println("");
                    listado.get(num);
                    //Uso del metodo
                    Factura(num, tiempo, persona, listado);
                    break;
                }
                else if (tipo == 4){
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("VAN")){
                            System.out.println("-----------------");
                            System.out.println("Opcion " + i + "\n" + "Marca : " + listado.get(i).getMarca() + ", Nombre: " + listado.get(i).getNombre() + ", Precio: " + listado.get(i).getPrecio());
                            System.out.println("-----------------");
                            System.out.println("");
                        }
                    }
                    //Una vez que se muestra la lista de los vehiculos, le pedimos que ingrese la opcion de los vehiculos
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
                    //Le pediremos la cantidad de dias que alquilara el vehiculo y luego hacer el calculo de lo que se tendra que pagar en total
                    System.out.println("Ingrese la cantidad de dias que alquilara el vehiculo: ");
                    int tiempo = read.nextInt();
                    System.out.println("");
                    listado.get(num);
                    //Uso del metodo
                    Factura(num, tiempo, persona, listado);
                    break;
                }
                else {
                    System.out.println("Su opcion no es valida");
                }
                break;
            case 3: 
                System.out.println("¡¡Gracias por su visita, vuelva pronto!!");
                break;
            default:
                System.out.println("La opcion no es valida");
                break;
        }
        
        } while (op!=3);
    }
    
    public static void Factura (int num, int tiempo, Usuario persona, ArrayList<Alquiler> listado){
        //Una vez el usuario termina de ingresar sus datos, se hace uso de un metodo para imrpimir como una factura donde mostramos la informacion del usuario en la clase persona y el vehiculo que selecciono
        //Seguidamente del total a pagar por el vehiculo
        System.out.println("----------ALQUILER COMPLETO----------");
        System.out.println("-------------------------------------");
        System.out.println("--------USUARIO DEL ALQUILER---------");
        System.out.println(persona);
        System.out.println("-------------------------------------");
        System.out.println("---------------VEHICULO--------------");
        System.out.println(listado.get(num));
        System.out.println("El precio a pagar por su alquiler es de: " + tiempo*(listado.get(num).getPrecio()));
        System.out.println("-------------------------------------");
    }
    
    public static void setMotivo (Usuario persona){
        //Para llevar un control sobre el registro del alquiler, se le pide al usuario el motivo por el cual esta solicitando un vehiculo
        Scanner read = new Scanner (System.in);
        System.out.println("INFORMACION ADICIONAL");
        System.out.println("Motivo");
        System.out.println("1. Turismo");
        System.out.println("2. Viaje Familiar");
        System.out.println("3. Trabajo");
        System.out.println("4. Otro");
        int opcion = read.nextInt();
        switch (opcion){
            case 1:
                persona.setMotivo("Turismo");
                break;
            case 2:
                persona.setMotivo("Viaje Familiar");
                break;
            case 3:
                persona.setMotivo("Trabajo");
                break;
            case 4:
                persona.setMotivo("Otro");
                break;
            default:
                System.out.println("La opcion no es valida");
                break;
        }
    }
    
}
