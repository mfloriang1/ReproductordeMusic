package reproductor_de_musica;

public class nodo {
    
    String nombre, direccion;
    nodo siguiente, anterior;

    public nodo(String nombre, String direccion) {
        //apuntadores
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
