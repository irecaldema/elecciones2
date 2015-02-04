import java.util.*;
public class EspacioPublico{
    String nombre, direccion;
    
    public EspacioPublico(){}
    
    public EspacioPublico(String nombre, String direccion) {
        this.nombre=nombre;
        this.direccion=direccion;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }    
    
    public String getNombre()  {
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }    
}