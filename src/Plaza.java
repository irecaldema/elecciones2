public class Plaza extends EspacioPublico {
    
     //propiedades extension de la clase principal
     private int capacidad;
     
     //metodos extension de la clase principal
     public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
     }
     public int getCapacidad() {
        return capacidad;
     }    
    
     public void mostrar() {
          System.out.println("\nPlaza");
          System.out.println("Nombre: "+getNombre()+" Direccion: "+getDireccion()+" Capacidad: "+getCapacidad());
     }                           
}