import java.util.Scanner;
import java.io.IOException;
public class Elecciones {
    public static void main (String args[]) throws IOException 	{
        
        int opcion, opcion2;
        
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println();
            System.out.println("***1 SELECCIONE SU OPCIÓN 1***");
            System.out.println("1: Partidos");
            System.out.println("2: Censo");
            System.out.println("3: EspacioPublico");
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
                    do {
                        System.out.println("***2 SELECCIONE SU OPCIÓN 2***");
                        System.out.println("1: Plaza");
                        System.out.println("0: Salir");
                        opcion2 = sc.nextInt();
                        switch (opcion2) {   
                            case 1:    
                                Plaza plaza = new Plaza();
                
                                System.out.println("EspacioPublico");
                                System.out.println("    Nombre: ");
                                plaza.setNombre(sc.next());
                                System.out.println("    Direccion: ");
                                plaza.setDireccion(sc.next());
                                System.out.println("    Capacidad: ");
                                plaza.setCapacidad(sc.nextInt());
                                
                                plaza.mostrar();

                                break;
                        }        
                        
                    }while (opcion2!=0); 
            }
        }while (opcion!=0); 
        System.out.println("\n\nEGUN ONA IZAN!!\n");
    }
}