import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Elecciones {
    public static void main (String args[]) throws IOException 	{
        
        int opcion;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println();
            System.out.println("*** SELECCIONE SU OPCIÓN ***");
            System.out.println("1: Partidos");
            System.out.println("2: Censo");
            System.out.println("3: Plaza");
            System.out.println("0: Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    Partido.mostrar();
                    System.out.println();        
                    break;
                case 2:
                    // censo personas
                    System.out.println();
                    System.out.println("\n Censo: ");
                    Habitante.mostrar();
                    System.out.println();
                    break;
                case 3:
                        Plaza plaza = new Plaza();
        
                        System.out.println("EspacioPublico");
                        System.out.println("    Nombre: ");
                        String nombre=sc.next();
                        plaza.setNombre(nombre);
                        System.out.println("    Direccion: ");
                        String direccion=sc.next();
                        plaza.setDireccion(direccion);
                        System.out.println("    Capacidad: ");
                        int capacidad=sc.nextInt();
                        plaza.setCapacidad(capacidad);
                        
                        System.out.println("\nEspacioPublico");
                        System.out.println("Nombre: "+plaza.getNombre()+" Direccion: "+plaza.getDireccion()+" Capacidad: "+plaza.getCapacidad());
            }
        }while (opcion!=0); 
        System.out.println("\n\nEGUN ONA IZAN!!\n");
    }
}