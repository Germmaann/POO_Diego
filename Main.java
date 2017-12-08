package musica;

import java.io.*;
import java.util.*;

public class Main {
public static BufferedReader teclado = new BufferedReader(new InputStreamReader
        (System.in));

         public static ArrayList<Clasica> Clasicas = new ArrayList<>();
         public static ArrayList<Country> Countrys = new ArrayList<>();
         public static ArrayList<Electronica> Electronicas = new ArrayList<>();
         public static ArrayList<Rock> Rocks = new ArrayList<>();
         
    public static void main(String[] args) throws IOException {
        
        boolean bandera=true;
        
        while(bandera){
            
        System.out.println("==== Bienvenido al menu ====");
        System.out.println("¿A que banda vamos a refistar hoy?");
        System.out.println("1. Clasica \n2. Country");
        System.out.println("3. Electronica \n4 Rock");
        System.out.println("5. Ver bandas de Clasica  \n6 Ver bandas de Country ");
        System.out.println("7. Ver bandas de Electronica \n8 Ver bandas de Rock");
        System.out.println("9. Salir");
        
        try {
        
        int opc=Integer.parseInt(teclado.readLine());
        
        switch(opc){
            case 1:
                crearclasica();
                break;
                
            case 2:
                crearcountry();
                break;
                
            case 3:
                crearelectronica();
                break;
                
            case 4: 
                crearrock();
                break;
                
            case 5:
                imprimirclasica(Clasicas);
                break;
                
            case 6: 
                imprimircountry(Countrys);
                break;
                
            case 7:
                imprimirelectronica(Electronicas);
                break;
                
            case 8:
                imprimirrock(Rocks);
                break;
            
            case 9:
                bandera = false;
                System.out.println("Gracias por utilizar este software");
                break;
                
            default:
                System.out.println("Opcion invalida");
                System.out.println("Intentalo de nuevo");
                break;
                    }
        }catch(NumberFormatException e){
        System.out.println("try again!! Escribe solo numeros");
        System.out.println(e.toString());
        }catch(Exception f){
            System.out.println("Error desconocido contacta al administrador o llama al 01-800-NOFUNCA :c");
        }finally{
            
        }
        
      }
   }

    public static void crearclasica() throws IOException{
        System.out.println("====Agregar banda de musica clasica====");
        
        System.out.println("Escribe el nombre de la Banda");
            String nombre = teclado.readLine();
            
            System.out.println("Escribe los integrantes de la banda");
            int integrantes=Integer.parseInt(teclado.readLine());
            
            System.out.println("Escriba la cantidad de discos actualmente");
            int cantidadDiscos=Integer.parseInt(teclado.readLine());
            
            System.out.println("Ingrese la marca del violin");
            String violin = teclado.readLine();
            
            System.out.println("Ingrese la marca del contrabajo");
            String contrabajo = teclado.readLine();

            System.out.println("Ingrese la marca de la arpa");
            String arpa = teclado.readLine();
            
            System.out.println("Escribe el numero de platillos de la bateria");
            int cantidadPlatillos=Integer.parseInt(teclado.readLine());
        
        Clasica cla = new Clasica( violin,  contrabajo,  arpa,  cantidadPlatillos,  nombre,  integrantes,  cantidadDiscos);
        System.out.println("----------------------------------------------");
        System.out.println("=== Datos del la banda ===");
        System.out.println("Violin: " + cla.getViolin());
        System.out.println("Contrabajo: " + cla.getContrabajo());
        System.out.println("Arpa: " + cla.getArpa());
        System.out.println("CantidadPlatillos: " + cla.getCantidadPlatillos());
        System.out.println("Nombre: " + cla.getNombre());
        System.out.println("Integrantes: " + cla.getIntegrantes());
        System.out.println("Cantidad de Discos: " + cla.getCantidadDiscos());

        cla.grabarAlbum();
        cla.presentacionAntePublico();
        cla.tocarCancion();
        cla.darPresentacion();

        Clasicas.add(cla);
        
        System.out.println("==== Banda Agregada :D ===="); 
    }
    
        public static void crearcountry() throws IOException{
        System.out.println("====Agregar banda de musica conuntry====");
        
        System.out.println("Escribe el nombre de la Banda");
            String nombre = teclado.readLine();
            
            System.out.println("Escribe los integrantes de la banda");
            int integrantes=Integer.parseInt(teclado.readLine());
            
            System.out.println("Escriba la cantidad de discos actualmente");
            int cantidadDiscos=Integer.parseInt(teclado.readLine());
            
            System.out.println("Ingrese la marca del banjo");
            String banjo = teclado.readLine();
            
            System.out.println("Ingrese la marca del armonica");
            String armonica = teclado.readLine();

            System.out.println("Ingrese la marca de la contrabajo");
            String contrabajo = teclado.readLine();
            
            System.out.println("Ingrese la marca del triangulo");
            String triangulo = teclado.readLine();
        
        Country coun = new Country(  banjo,  armonica,  contrabajo,  triangulo,  nombre,  integrantes,  cantidadDiscos);
        System.out.println("----------------------------------------------");
        System.out.println("=== Datos del la banda ===");
        System.out.println("Banjo: " + coun.getBanjo());
        System.out.println("Armonica: " + coun.getArmonica());
        System.out.println("Contrabajo: " + coun.getContrabajo());
        System.out.println("Triangulo: " + coun.getTriangulo());
        System.out.println("Nombre: " + coun.getNombre());
        System.out.println("Integrantes: " + coun.getIntegrantes());
        System.out.println("CantidadDiscos: " + coun.getCantidadDiscos());

        coun.grabarAlbum();
        coun.presentacionAntePublico();
        coun.tocarCancion();
        coun.darConcierto();

        Countrys.add(coun);
        
        System.out.println("==== Banda Agregada :D ===="); 
    }
        
        public static void crearelectronica() throws IOException{
        System.out.println("====Agregar banda de musica electronica====");
        
        System.out.println("Escribe el nombre de la Banda");
            String nombre = teclado.readLine();
            
            System.out.println("Escribe los integrantes de la banda");
            int integrantes=Integer.parseInt(teclado.readLine());
            
            System.out.println("Escriba la cantidad de discos actualmente");
            int cantidadDiscos=Integer.parseInt(teclado.readLine());
            
            System.out.println("Ingrese la marca del la mezcladora");
            String mezcladora = teclado.readLine();
            
            System.out.println("Ingrese la marca del piano electrico");
            String electrico = teclado.readLine();

            System.out.println("Ingrese la cantidad de sintetizadores");
            int sintetizadores=Integer.parseInt(teclado.readLine());
            
            System.out.println("Ingrese la marca del tornamesas");
            String tornamesas = teclado.readLine();
        
        Electronica elec = new Electronica( mezcladora,  electrico,  sintetizadores,  tornamesas,  nombre,  integrantes,  cantidadDiscos);
        System.out.println("----------------------------------------------");
        System.out.println("=== Datos del la banda ===");
        System.out.println("Mezcladora: " + elec.getMezcladora());
        System.out.println("Piano electrico: " + elec.getPianoElectrico());
        System.out.println("Sintetizadores: " + elec.getCantidadSintetizadores());
        System.out.println("Tornamesas: " + elec.getTornamesas());
        System.out.println("Nombre: " + elec.getNombre());
        System.out.println("Integrantes: " + elec.getIntegrantes());
        System.out.println("CantidadDiscos: " + elec.getCantidadDiscos());

        elec.grabarAlbum();
        elec.presentacionAntePublico();
        elec.tocarCancion();
        elec.darFestival();

        Electronicas.add(elec);
        
        System.out.println("==== Banda Agregada :D ===="); 
    }
        
        public static void crearrock() throws IOException{
        System.out.println("====Agregar banda de rock====");
        
        System.out.println("Escribe el nombre de la Banda");
            String nombre = teclado.readLine();
            
            System.out.println("Escribe los integrantes de la banda");
            int integrantes=Integer.parseInt(teclado.readLine());
            
            System.out.println("Escriba la cantidad de discos actualmente");
            int cantidadDiscos=Integer.parseInt(teclado.readLine());
            
            System.out.println("Ingrese la marca de la guitarra electrica");
            String guitarraElectrica = teclado.readLine();
            
            System.out.println("Ingrese la marca de la bateria");
            String bateria = teclado.readLine();

            System.out.println("Ingrese la marca del bajo");
            String bajo = teclado.readLine();
            
            System.out.println("Ingrese la marca del piano");
            String piano = teclado.readLine();
        
        Rock roc = new Rock( guitarraElectrica,  bateria,  bajo,  piano,  nombre,  integrantes,  cantidadDiscos);
        System.out.println("----------------------------------------------");
        System.out.println("=== Datos del la banda ===");
        System.out.println("Guitarra Electrica: " + roc.getGuitarraElectrica());
        System.out.println("Bateria: " + roc.getBateria());
        System.out.println("Bajo: " + roc.getBajo());
        System.out.println("Piano: " + roc.getPiano());
        System.out.println("Nombre: " + roc.getNombre());
        System.out.println("Integrantes: " + roc.getIntegrantes());
        System.out.println("CantidadDiscos: " + roc.getCantidadDiscos());

        roc.grabarAlbum();
        roc.presentacionAntePublico();
        roc.tocarCancion();
        roc.darConcierto();

        Rocks.add(roc);
        
        System.out.println("==== Banda Agregada :D ===="); 
    }
    
    public static void imprimirclasica(ArrayList<Clasica> lista){
        System.out.println("====Banda Agregadas====");

        for(int i=0; i<lista.size(); i++){
        System.out.println((i+1));
        System.out.println("----------------------------------------------");
                System.out.println("=== Datos de la Banda ===");
                System.out.println("violin: " + lista.get(i).getViolin());
                System.out.println("contrabajo: " + lista.get(i).getContrabajo());
                System.out.println("arpa: " + lista.get(i).getArpa());
                System.out.println("cantidadPlatillos: " + lista.get(i).getCantidadPlatillos());
                System.out.println("nombre: " + lista.get(i).getNombre());
                System.out.println("integrantes: " + lista.get(i).getIntegrantes());
                System.out.println("cantidadDiscos: " + lista.get(i).getCantidadDiscos());

        }
    }
    
    public static void imprimircountry(ArrayList<Country> lista){
        System.out.println("====Banda Agregadas====");

        for(int i=0; i<lista.size(); i++){
        System.out.println((i+1));
        System.out.println("----------------------------------------------");
                System.out.println("=== Datos de la Banda ===");
                System.out.println("Banjo: " + lista.get(i).getNombre());
                System.out.println("Armonica: " + lista.get(i).getArmonica());
                System.out.println("Contrabajo: " + lista.get(i).getContrabajo());
                System.out.println("Triangulo: " + lista.get(i).getTriangulo());
                System.out.println("nombre: " + lista.get(i).getNombre());
                System.out.println("integrantes: " + lista.get(i).getIntegrantes());
                System.out.println("cantidadDiscos: " + lista.get(i).getCantidadDiscos());

        }
    }
    
    public static void imprimirelectronica(ArrayList<Electronica> lista){
        System.out.println("====Banda Agregadas====");

        for(int i=0; i<lista.size(); i++){
        System.out.println((i+1));
        System.out.println("----------------------------------------------");
                System.out.println("=== Datos de la Banda ===");
                System.out.println("Mezcladora: " + lista.get(i).getMezcladora());
                System.out.println("Piano electrico: " + lista.get(i).getPianoElectrico());
                System.out.println("Cantidad Sintetizadores: " + lista.get(i).getCantidadSintetizadores());
                System.out.println("Tornamesas: " + lista.get(i).getTornamesas());
                System.out.println("Nombre: " + lista.get(i).getNombre());
                System.out.println("Integrantes: " + lista.get(i).getIntegrantes());
                System.out.println("CantidadDiscos: " + lista.get(i).getCantidadDiscos());
        }
    }
    
    public static void imprimirrock(ArrayList<Rock> lista){
        System.out.println("====Banda Agregadas====");

        for(int i=0; i<lista.size(); i++){
        System.out.println((i+1));
        System.out.println("----------------------------------------------");
                System.out.println("=== Datos de la Banda ===");
                System.out.println("Guitarra Electrica: " + lista.get(i).getGuitarraElectrica());
                System.out.println("Bateria: " + lista.get(i).getBateria());
                System.out.println("Bajo: " + lista.get(i).getBajo());
                System.out.println("Piano: " + lista.get(i).getPiano());
                System.out.println("nombre: " + lista.get(i).getNombre());
                System.out.println("integrantes: " + lista.get(i).getIntegrantes());
                System.out.println("cantidadDiscos: " + lista.get(i).getCantidadDiscos());

        }
    }
}