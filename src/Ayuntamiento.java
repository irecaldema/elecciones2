import java.util.*;
public class Ayuntamiento{
    private String direccion;
    private int poblacion;
    
    public Ayuntamiento(){};
    
    public Ayuntamiento( String direccion, int poblacion) {
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