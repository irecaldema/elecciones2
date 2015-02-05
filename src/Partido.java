import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
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
    static public void mostrar() throws IOException {
        
        ArrayList <Partido> al_party = new ArrayList <Partido> ();


        FileReader fr = new FileReader("listadoPartidos.txt");
        BufferedReader br = new BufferedReader(fr); 
        
        String s; 
        while((s = br.readLine()) != null) { 
            StringTokenizer st = new StringTokenizer(s, ",");
            int contador_token1 = st.countTokens();
            String[] array_separados = new String[contador_token1];
            
            for (int i=0;i<contador_token1;i++)
            {
                array_separados[i] = st.nextToken();
            }
    
            al_party.add(new Partido(array_separados[0],array_separados[1],array_separados[2]));
        }
        for(int i=0; i<al_party.size(); i++) {
            System.out.println("  nombre: "+al_party.get(i).getNombre() +" siglas: "+al_party.get(i).getSiglas()+" presidente: "+ al_party.get(i).getPresi());
        }
    
        // Vaciar el ArrayList
        al_party.clear();
        
    }
}