//import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Elecciones {
    public static void main (String args[]) throws IOException 	{
        String nombre_hab, siglas, presi, nombre_rep, nombre_par, nombre_esp, direccion_hab, direccion_ayu, direccion_esp, direccion_inmu, apellido1, apellido2;
        /*String[] repres = new String[10];*/
        int edad, poblacion_ayu, poblacion_inmu;
        char opcion, opcion2;

        Partido party = new Partido();
        Inmueble inmu = new Inmueble();
        Habitante habi = new Habitante();
        EspacioPublico espacio = new EspacioPublico();
        Ayuntamiento ayu = new Ayuntamiento();
/*
        System.out.println("\n Habitante");
        System.out.println("\n nombre: " + nombre_hab + "\n apellido 1: " + apellido1 + "\n apellido 2: " + apellido2 + "\n direccion: " + direccion_hab + "\n edad: " + edad);
        System.out.println();
        
        System.out.println("\n EspacioPublico");
        System.out.println("\n nombre_esp: " + nombre_esp + "\n direccion: " + direccion_esp);
        System.out.println();

        System.out.println("\n Ayuntamiento");
        System.out.println("\n direccion: " + direccion_ayu + "\n poblacion: " + poblacion_ayu); 
        System.out.println();
        
        System.out.println();
        System.out.println("\n Partidos que van a participar en las elecciones: ");
*/
        
        FileReader fr = new FileReader("listadoPartidos.txt");
        BufferedReader br = new BufferedReader(fr); 
        
        String s; 
        /*
        while((s = br.readLine()) != null) 
        { 
            lista_partidos.add(s);
            //System.out.println(s);
        }
        System.out.println("muestra el contenido del arraylist");
        for(int i=0; i<lista_partidos.size(); i++)
		{
			System.out.println("    "+lista_partidos.get(i));
		}
        */
        // Vaciar el ArrayList
		//lista_partidos.clear();
		
        //ArrayList <Partido> al_party = new ArrayList <Partido> ();	
       /* String[] a_party = new String[3];
        System.out.println("los partidos que se presentan a las elecciones");
	    while((s = br.readLine()) != null) 
        { 
            a_party=s.split(",");
            for(int y=0; y<3; y++)
            { 
                if (y==0)
                {
                    System.out.print("nombre : ");
                }
                else if (y==1)
                {
                    System.out.print("  siglas: ");
                }
                else
                {
                    System.out.print("  presidente: ");
                }
                System.out.print(" " + a_party[y]);
            }
            System.out.println();
        }*/
        /*for(int i=0; i<a_party.size(); i++)
		{
			System.out.println("    "+a_party.get(i));
		}*/
         
        ArrayList <Partido> al_party = new ArrayList <Partido> ();
        String zzz1="", zzz2="", zzz3=""; 

        while((s = br.readLine()) != null) 
        { 
            StringTokenizer st = new StringTokenizer(s, ",");
            int contador_token1 = st.countTokens();
            String[] array_separados = new String[contador_token1];
            
            for (int i=0;i<contador_token1;i++)
            {
                array_separados[i] = st.nextToken();
            }
            /*array_separados[0] = st.nextToken();
			array_separados[1] = st.nextToken();
			array_separados[2] = st.nextToken();*/

            al_party.add(new Partido(array_separados[0],array_separados[1],array_separados[2]));
        }
        for(int i=0; i<al_party.size(); i++)
        {
            System.out.println("  nombre: "+al_party.get(i).getNombre() +" siglas: "+al_party.get(i).getSiglas()+" presidente: "+ al_party.get(i).getPresi());
        }
            
        // Vaciar el ArrayList
        al_party.clear();
        
        System.out.println();
        System.out.println();        
        
        // censo personas
        System.out.println("\n Censo: ");
        FileReader fr2 = new FileReader("censo.txt");
        BufferedReader br2 = new BufferedReader(fr2); 
        String s2; 
                
        ArrayList <Habitante> al_habi = new ArrayList <Habitante> ();

        while((s2 = br2.readLine()) != null) 
        { 
            String[] separadas = s2.split(",");
            
            if (Integer.parseInt(separadas[3])>=18)
            {
                al_habi.add(new Habitante(separadas[0],separadas[1],separadas[2],Integer.parseInt(separadas[3]),separadas[4]));
            }
        }
            for(int i=0; i<al_habi.size(); i++)
		    {
			    System.out.println("  nombre: "+al_habi.get(i).getNombre() +" primer apellido: "+al_habi.get(i).getApellido1()+" segundo apellido: "+ al_habi.get(i).getApellido2()+" edad: "+ al_habi.get(i).getEdad()+" direccion: "+ al_habi.get(i).getDireccion());
		    }

            // Vaciar el ArrayList
            al_habi.clear();
        
     
        System.out.println("\n\nEGUN ONA IZAN!!\n");
    }
}