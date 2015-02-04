import java.util.*;
public class Inmueble{
    String direccion;
    int poblacion;
    
    public Inmueble(){}
    
    public Inmueble(String direccion,int num_personas){
        this.direccion=direccion;
        this.num_personas=num_personas;
    }
    
    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion=poblacion;
    }
    
    public String getDireccion() {
        return direccion;
    }
    public int getPoblacion() {
        return poblacion;
    }    
}