import java.util.*;
public class Partido{
    private String nombre, siglas, presi;
    /*String[] repres = new String[10];*/
    
    public Partido(){}
    
    /*public Partido(String nombre,String[] repres) {
        this.nombre=nombre;
        this.repres=repres.clone();
    }*/
    
    public Partido(String nombre, String siglas, String presi)    {
        this.nombre=nombre;
        this.siglas=siglas;
        this.presi=presi;
    }
    
    public void setNombre(String nombre)    {
        this.nombre=nombre;
    }
    public void setSiglas(String siglas)    {
        this.siglas=siglas;
    }
    public void setPresi(String presi)    {
        this.presi=presi;
    }
    /*public void setRepres(String[] repres)    {
        this.repres=repres;
    }*/
    
    public String getNombre()    {
        return nombre;
    }
    public String getSiglas()    {
        return siglas;
    }
    public String getPresi()    {
        return presi;
    }       
    /*public String[] getRepres()    {
        return repres;
    }    */
}