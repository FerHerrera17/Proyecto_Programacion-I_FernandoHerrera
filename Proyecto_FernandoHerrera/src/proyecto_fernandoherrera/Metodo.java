/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_fernandoherrera;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author herre
 */
class Metodo {
    public char[] Placa (){
        //Uso de un random para poder generar un numero de placa distinto para cada vehiculo que sea alquilado
        Random ale = new Random();
        //Definimos un array de tipo char para que de esa manera podamos usar tanto letras como numeros para hacaer la placa vehicular
        //El arreglo tendra un tamaño de 7 porque contiene 3 series de letras y 4 de numeros
        char [] placa_vehiculo = new char [7];
        
        //Declaramos dos variables que nos ayudaran a manejar las letras y los numeros de las placas
        int letra;
        int num;
        
        //Se inicializa un ciclo for hasta 3 ya que son 3 letras que incluye la placa
        for (int i = 0; i < 3; i++) {
            //Por cada vuelta se generara un numero aleatorio que nos dira la letra que ira
            letra = ale.nextInt(26);
            //Luego esta el switch donde cada numero representa la opcion de la letra
            //Asi mismo, cuando entre en una opcion, en la posicion i dentro del arreglo se agregara la letra
            switch (letra){
                case 0:
                    placa_vehiculo[i] = 'A';
                    break;
                case 1:
                    placa_vehiculo[i] = 'B';
                    break;
                case 2:
                    placa_vehiculo[i] = 'C';
                    break;
                case 3:
                    placa_vehiculo[i] = 'D';
                    break;
                case 4:
                    placa_vehiculo[i] = 'E';
                    break;
                case 5:
                    placa_vehiculo[i] = 'F';
                    break;
                case 6:
                    placa_vehiculo[i] = 'G';
                    break;
                case 7:
                    placa_vehiculo[i] = 'H';
                    break;
                case 8:
                    placa_vehiculo[i] = 'I';
                    break;
                case 9:
                    placa_vehiculo[i] = 'J';
                    break;
                case 10:
                    placa_vehiculo[i] = 'K';
                    break;
                case 11:
                    placa_vehiculo[i] = 'L';
                    break;
                case 12:
                    placa_vehiculo[i] = 'M';
                    break;
                case 13:
                    placa_vehiculo[i] = 'N';
                    break;
                case 14:
                    placa_vehiculo[i] = 'O';
                    break;
                case 15:
                    placa_vehiculo[i] = 'P';
                    break;
                case 16:
                    placa_vehiculo[i] = 'Q';
                    break;
                case 17:
                    placa_vehiculo[i] = 'R';
                    break;
                case 18:
                    placa_vehiculo[i] = 'S';
                    break;
                case 19:
                    placa_vehiculo[i] = 'T';
                    break;
                case 20:
                    placa_vehiculo[i] = 'U';
                    break;
                case 21:
                    placa_vehiculo[i] = 'V';
                    break;
                case 22:
                    placa_vehiculo[i] = 'W';
                    break;
                case 23:
                    placa_vehiculo[i] = 'X';
                    break;
                case 24:
                    placa_vehiculo[i] = 'Y';
                    break;
                case 25:
                    placa_vehiculo[i] = 'Z';
                    break;
            }
        }
        
        for (int j = 3; j < 7; j++) {
                
                num = ale.nextInt(10);
                switch (num){
                case 0:
                    placa_vehiculo[j] = '0';
                    break;
                case 1:
                    placa_vehiculo[j] = '1';
                    break;
                case 2:
                    placa_vehiculo[j] = '2';
                    break;
                case 3:
                    placa_vehiculo[j] = '3';
                    break;
                case 4:
                    placa_vehiculo[j] = '4';
                    break;
                case 5:
                    placa_vehiculo[j] = '5';
                    break;
                case 6:
                    placa_vehiculo[j] = '6';
                    break;
                case 7:
                    placa_vehiculo[j] = '7';
                    break;
                case 8:
                    placa_vehiculo[j] = '8';
                    break;
                case 9:
                    placa_vehiculo[j] = '9';
                    break;
                }
        }
        
     return placa_vehiculo;   
    }
    
    
    public void setMotivo (Usuario persona){
        //Para llevar un control sobre el registro del alquiler, se le pide al usuario el motivo por el cual esta solicitando un vehiculo
        Scanner read = new Scanner (System.in);
        System.out.println("INFORMACION ADICIONAL");
        System.out.println("Motivo");
        System.out.println("1. Turismo");
        System.out.println("2. Viaje Familiar");
        System.out.println("3. Trabajo");
        System.out.println("4. Otro");
        int opcion = read.nextInt();
        
        while (opcion < 1 || opcion > 4){
            System.out.print("Opcion incorrecta, ingrese de nuevo: ");
            opcion = read.nextInt();
        }
        
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
    
    //Metodo para dar la lista de los vehiculos que tenemos disponibles
    public void ListaVehiculos (ArrayList<Alquiler> listado){
        Scanner read = new Scanner (System.in);
        int tipo;
        int op;
        do {
            System.out.println("Desea ver la lista por tipo o por marca?");
            System.out.println("1. Tipo");
            System.out.println("2. Marca");
            System.out.println("3. Cerrar Pestana");
            op = read.nextInt();
            
            switch (op){
                case 1:
                    do{
                        System.out.println("1. Sedan");
                        System.out.println("2. SUV");
                        System.out.println("3. Pickup");
                        System.out.println("4. VAN");
                        System.out.println("5. Cerrar Listado");
                        tipo = read.nextInt();
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
                    } while (tipo != 5);
                    break;
                case 2:
                    //Menu de marcas para que el usuario las visualice y luego ingrese su respuesta
                        System.out.println("Las marcas disponibles son: ");
                        System.out.println("-> Kia");
                        System.out.println("-> Toyota");
                        System.out.println("-> Chevrolet");
                        System.out.println("-> Volkswagen");
                        System.out.println("-> Mitsubishi");
                        System.out.println("-> Nissan");
                        String marca = read.next();
                        tipo = 0;
                        
                        //Ciclo for que nos ayuda a recorrer la lista en busca del auto con el metodo recursivo
                        for (int i = 0; i < listado.size(); i++) {
                            if (listado.get(i).getMarca().equalsIgnoreCase(marca)){
                                System.out.println(buscarVehiculo(listado, marca, tipo));
                                tipo++;
                            }
                            else {
                                System.out.println("No tenemos registro de ese vehiculo, verifique que ha sido ingresado correctamente");
                                break;
                            }
                        }
                        
                        
                    break;
            }
            
            
                  
            System.out.println("");
        } while (op != 3);
    }
    
    //Metodo recursivo que lo usamos para buscar vehiculos por sus marcas
    public Alquiler buscarVehiculo (ArrayList<Alquiler> listado, String marca, int tipo){
        //Lo que hace el caso base es evaluar toda la ArrayList para poder buscar, por eso retornamos null
        //Cuando tipo sea mayor o igual a la logitud del ArryaList es porque termino de recorrerla
        if (tipo >= listado.size()){
            return null;
        }
        //Esta condicion nos ayuda a devolver el auto que estamos buscando por su marca
        else if (listado.get(tipo).getMarca().equalsIgnoreCase(marca)){
            return listado.get(tipo);
        }
        //Aqui sumamos la variable tipo para que se siga llamando el metodo y para asi evaluar cada indice que tiene
        return buscarVehiculo(listado, marca, tipo+1);
    }
}