import java.util.*;
public class Inmueble{
    private String direccion;
    private int poblacion;
    
    public Inmueble(){}
    
    public Inmueble(String direccion,int poblacion){
        this.direccion=direccion;
        this.poblacion=poblacion;
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