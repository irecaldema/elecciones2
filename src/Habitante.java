import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Habitante{
    private String nombre, apellido1, apellido2, direccion;
    private int edad;
    
    public Habitante(){}
    
    public Habitante(String nombre, String apellido1, String apellido2, int edad, String direccion){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
        this.direccion=direccion;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setApellido1(String apellido1) {
        this.apellido1=apellido1;
    }
    public void setApellido2(String apellido2) {
        this.apellido2=apellido2;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public void setDireccion(String direccion) {
        this.direccion=direccion;
    } 

    public String getNombre() {
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public int getEdad() {
        return edad;
    }    
    public String getDireccion() {
        return direccion;
    } 
    
    static public void mostrar() throws IOException {
        
        FileReader fr2 = new FileReader("censo.txt");
        BufferedReader br2 = new BufferedReader(fr2); 
        String s2; 
                
        ArrayList <Habitante> al_habi = new ArrayList <Habitante>();

        while((s2 = br2.readLine()) != null) { 
            String[] separadas = s2.split(",");
            
            if (Integer.parseInt(separadas[3])>=18) {
                al_habi.add(new Habitante(separadas[0],separadas[1],separadas[2],Integer.parseInt(separadas[3]),separadas[4]));
            }
        }
        for(int i=0; i<al_habi.size(); i++) {
			    System.out.println("  nombre: "+al_habi.get(i).getNombre() +" primer apellido: "+al_habi.get(i).getApellido1()+" segundo apellido: "+ al_habi.get(i).getApellido2()+" edad: "+ al_habi.get(i).getEdad()+" direccion: "+ al_habi.get(i).getDireccion());
		}

        // Vaciar el ArrayList
        al_habi.clear();
    }    
}