/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_fernandoherrera;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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
        
        
        //Variable que se manejara para la clase llamada Metodo
        Metodo prog = new Metodo();
        
        
        //Autos de tipo Sedan
        listado.add(new Alquiler("Sedan", "Kia", "Morning", 1200, 1));
        listado.add(new Alquiler("Sedan", "Kia", "Picanto", 1000, 6));
        listado.add(new Alquiler("Sedan", "Kia", "Soluto", 1500, 4));
        listado.add(new Alquiler("Sedan", "Kia", "Rio", 1200, 3));
        
        //Auto de tipo SUV
        listado.add(new Alquiler("SUV", "Toyota", "Rush", 1800, 4));
        listado.add(new Alquiler("SUV", "Chevrolet", "Captiva", 2000, 5));
        listado.add(new Alquiler("SUV", "Volkswagen", "Nivus", 1800, 3));
        listado.add(new Alquiler("SUV", "Kia", "Seltos", 1800, 6));
        listado.add(new Alquiler("SUV", "Kia", "Sportage", 2000, 4));
        listado.add(new Alquiler("SUV", "Mitsubishi", "Montero Sport", 2500, 5));
        listado.add(new Alquiler("SUV", "Toyota", "Prado", 2500, 6));
        
        //Autos de tipo Pickup
        listado.add(new Alquiler("Pickup", "Nissan", "Frontier", 1800, 3));
        listado.add(new Alquiler("Pickup", "Chevrolet", "Colorado", 1800, 3));
        
        //Autos de tipo VAN
        listado.add(new Alquiler("VAN", "Toyota", "Hiace", 2400, 4));
        
        int op;        
        
        //Menu introductorio para el alquiler
        do {
            System.out.println("-------------------------------------------");
            System.out.println("BIENVENIDOS A NUESTRO ALQUILER DE VEHICULOS");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("--------------MENU DE OPCIONES-------------");
            System.out.println("1. Busqueda por Tipo");
            System.out.println("2. Alquilar");
            System.out.println("3. Reservaciones");
            System.out.println("4. Salir del sistema");
            op = read.nextInt();
        
        switch (op){
            case 1: 
                //En esta primera opcion, al usario se la da la oportunidad de ver todos los vehiculos que hay y asi escoger el que mejor le convenga
                System.out.println("Aqui le dejamos un catalogo de nuestros mejores vehiculos");
                System.out.println("Diganos el tipo de vehiculo que desea ver: ");
                //Llamamos al metodo "ListaVehiculos" de la clase metodo para mostrarle al usuario un menu de opciones
                prog.ListaVehiculos(listado);
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
                persona.setEdad(edad);
                System.out.println("");
                //Hay que verificar que sea una persona determinada o "mayor de edad" para que pueda alquilar un vehiculo
                while (edad < 18){
                    System.out.println("Tiene que ser mayor de 18 para poder alquilar uno de nuestros vehiculos");
                    System.out.println("Intente de nuevo");
                    System.out.println("Ingrese su edad: ");
                    edad = read.nextInt();
                    persona.setEdad(edad);
                }
                
                //Dejamos un registro sobre el motivo del porque el usuario esta alquilando un vehiculo
                prog.setMotivo(persona);
                
                //Mostramos nuevamente la opcion de los vehiculos pero con un formato distinto para que sea mas uniforme y el usuario pueda ingresar su opcion
                System.out.println("");
                System.out.println("Diganos el tipo de vehiculo: ");
                System.out.println("1. Sedan");
                System.out.println("2. SUV");
                System.out.println("3. Pickup");
                System.out.println("4. VAN");
                int tipo = read.nextInt();
                
                if (tipo == 1){
                    
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getTipo().equals("Sedan")){
                            System.out.println("-----------------");
                            System.out.println("Opcion " + i + "\n" + "Marca : " + listado.get(i).getMarca() + ", Nombre: " + listado.get(i).getNombre() + ", Precio: " + listado.get(i).getPrecio());
                            System.out.println("Unidades Disponibles: " + listado.get(i).getCantidad());
                            System.out.println("-----------------");
                            System.out.println("");
                            
                            
                        }
                    }
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
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
                            System.out.println("Unidades Disponibles: " + listado.get(i).getCantidad());
                            System.out.println("-----------------");
                        }
                    }
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
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
                            System.out.println("Unidades Disponibles: " + listado.get(i).getCantidad());
                            System.out.println("-----------------");
                            System.out.println("");
                        }
                    }
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
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
                            System.out.println("Unidades Disponibles: " + listado.get(i).getCantidad());
                            System.out.println("-----------------");
                            System.out.println("");
                            
                        }
                    }
                    System.out.println("Ingrese la opcion del vehiculo que desea: ");
                    int num = read.nextInt();
                    System.out.println("Ingrese la cantidad de dias que alquilara el vehiculo: ");
                    int tiempo = read.nextInt();
                    System.out.println("");
                    listado.get(num);
                    //Uso del metodo
                    Factura(num, tiempo, persona, listado);
                    
                    
                    
                    break;   
                }
                break;
            case 3:
                
                //Iniciare una matriz en esta opcion para poder tener el manejo de las reservaciones futuras
                System.out.println("-----MENU DE RESERVACIONES-----");
                System.out.print("Cuantas reservaciones desea hacer (1, 2 , 3): ");
                int reservaciones = read.nextInt();
                String [][] historial = new String [reservaciones][4];
                int contReservaciones = 0;
                
                
                do { 
                    //Ciclo while que se repetira las veces que el usuario ingreso en reservaciones
                    //Con una variable contador de reservaciones, cada respuesta del usuario lo guardamos en las posiciones de la matriz
                    System.out.print("Ingrese su primer nombre: ");
                    read.next();
                    String name = read.next();
                    historial[contReservaciones][0] = name;
                
                
                    System.out.print("Ingrese su primer apellido: ");
                    String name2 = read.next();
                    historial[contReservaciones][1] = name2;
                    System.out.println("");
                
                
                    System.out.println("Que tipo de Vehiculo desea reservar: ");
                    System.out.println("1. Sedan");
                    System.out.println("2. SUV");
                    System.out.println("3. Pickup");
                    System.out.println("4. Van");
                    int type = read.nextInt();
                
                    while (type < 1 || type > 4){
                        System.out.println("Ingrese una opcion valida");
                        type = read.nextInt();
                    }
                    switch (type){
                        case 1:
                            historial[contReservaciones][2] = "Sedan";
                            break;
                        case 2: 
                            historial[contReservaciones][2] = "SUV";
                            break;
                        case 3:
                            historial[contReservaciones][2] = "Pickup";
                            break;
                        case 4:
                            historial[contReservaciones][2] = "Van";
                            break;
                    }
                    System.out.println("");
                    System.out.println("Ingrese su forma de pago: ");
                    System.out.println("1. Efectivo");
                    System.out.println("2. Tarjeta");
                    int pago = read.nextInt();
                    
                    while (pago < 1 || pago > 2 ){
                        System.out.println("Su opcion no es valida, intente de nuevo");
                        System.out.println("1. Efectivo");
                        System.out.println("2. Tarjeta");
                        pago = read.nextInt();
                    }
                    
                    switch (pago){
                        case 1:
                            historial[contReservaciones][3] = "Efectivo";
                            break;
                        case 2:
                            historial[contReservaciones][3] = "Tarjeta";
                            break;
                    }
                contReservaciones++;
                } while (contReservaciones < reservaciones);
                
                System.out.println("");
                System.out.println("----------RESERVACION(ES)----------");
                for (int i = 0; i < reservaciones; i++) {
                    System.out.println("Numero de reservacion #" + (i+1));
                    for (int j = 0; j < 4; j++) {
                        System.out.print("[" + historial[i][j] + "]");
                        
                    }
                    System.out.println("");
                    System.out.println("");
                }
                break;
            case 4: 
                System.out.println("¡¡Gracias por su visita, vuelva pronto!!");
                break;
            default:
                System.out.println("La opcion que ingreso no es valida");
            
        }
        
        } while (op!=4);
    }
    
    public static void Factura (int num, int tiempo, Usuario persona, ArrayList<Alquiler> listado){
        Metodo prog = new Metodo();
        //Una vez el usuario termina de ingresar sus datos, se hace uso de un metodo para imrpimir como una factura donde mostramos la informacion del usuario en la clase persona y el vehiculo que selecciono
        //Seguidamente del total a pagar por el vehiculo
        System.out.println("----------ALQUILER COMPLETO----------");
        System.out.println("-------------------------------------");
        System.out.println("--------USUARIO DEL ALQUILER---------");
        System.out.println(persona);
        System.out.println("-------------------------------------");
        System.out.println("---------------VEHICULO--------------");
        System.out.println(listado.get(num));
        listado.get(num).setCantidad(listado.get(num).getCantidad()-1);
        System.out.println("Unidades Restantes: " + listado.get(num).getCantidad());
        System.out.println("El precio a pagar por su alquiler es de: " + tiempo*(listado.get(num).getPrecio()));
        System.out.println("La placa de su vehiculo es: " + Arrays.toString(prog.Placa()));
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("");
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
    
    public static void HistorialAlquiler (String [][] historial){
        for (int i = 0; i < historial.length; i++) {
            System.out.println("Numero de Alquiler: " + (i+1));
            for (int j = 0; j < historial.length; j++) {
                System.out.println("[" + historial[i][j]+ "]");
                
            }
        }
    }
    
    
    
}
