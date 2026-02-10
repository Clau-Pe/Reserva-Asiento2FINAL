import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List<Ticket> listaTickets = new ArrayList<>();

    //Constructores
    public Cliente() {

    }

    public Cliente(int id, String dni, String nombre, String apellido, List<Ticket> listaTickets) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaTickets = new ArrayList<>();
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Ticket> getListaTickets() {
        return listaTickets;
    }

    //Método seguro para agregar tickets
    public void agregarTicket(Ticket ticket) {
        listaTickets.add(ticket);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numTickets=" + (listaTickets != null ? listaTickets.size() : 0) +
                '}';
    }
}
