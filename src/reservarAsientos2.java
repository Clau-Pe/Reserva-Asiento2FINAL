import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class reservarAsientos2 {

    public static void main(String[] args) {

        //Creacion BBDD logica
          List<Ticket> listaTickets = new ArrayList<Ticket>();
          List<Cliente> listaClientes = new ArrayList<Cliente>();

        //Alta Clientes
        Cliente client1 = new Cliente();
        client1.setId(1);
        client1.setDni("35716836");
        client1.setNombre("Claudia");
        client1.setApellido("Penón");


        Cliente client2 = new Cliente();
        client2.setId(2);
        client2.setDni("18642550");
        client2.setNombre("Marina");
        client2.setApellido("Sales");

        Cliente client3 = new Cliente();
        client3.setId(3);
        client3.setDni("11979216");
        client3.setNombre("Carmelo");
        client3.setApellido("Barrios");


        //Instanciacion de la clase Ticket - Contructor y Gettter & Setters
        Ticket ticket1 = new Ticket();
        ticket1.setNumero(1);
        ticket1.setFila(0);
        ticket1.setAsiento(0);
        ticket1.setFechaCompra(new Date());
        ticket1.setFechaValidez(new Date());
        ticket1.setPrecio(1200.50);
        ticket1.setCliente(client1);

        Ticket ticket2 = new Ticket(2, 0, 1, new Date(), new Date(), 1800.50, client1);
        Ticket ticket3 = new Ticket(3, 8, 3, new Date(), new Date(), 999.00, client2);
        Ticket ticket4 = new Ticket(4, 5, 4, new Date(2026 - 02 - 01), new Date(), 500.00, client3);

        //Agrego elementos a la Collection Ticket (BBDD logica)
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        listaTickets.add(ticket4);

        //Agregar elementos a la Collection Cliente (BBDD logica)
        listaClientes.add(client1);
        listaClientes.add(client2);
        listaClientes.add(client3);

        //Agrego los tickets al cliente
        client1.agregarTicket(ticket1);
        client1.agregarTicket(ticket2);
        client2.agregarTicket(ticket3);
        client3.agregarTicket(ticket4);


        //Recorrer collection Ticket y function suma de precios
        double suma = 0;
        for (Ticket tic : listaTickets) {
            suma = suma + tic.getPrecio();
        }

        System.out.println("\n El precio de todos los tickets de la coleccion es " + suma);

        //Recorrer collection Ticket y mostrar datos tickets segun filas
        // Pedir datos al usuario
        Scanner datos = new Scanner(System.in);
        System.out.println("\n Ingrese un numero de fila");
        int fila = datos.nextInt();
        boolean verify = false;

        for (Ticket tic : listaTickets) {
            if (tic.getFila() == fila) {
                System.out.println(tic.toString());
                verify = true;
            }
        }
        if (verify != true) {
            System.out.println("No se encontraron datos para la fila señalada");
        }
        //Recorrer collection Cliente y mostrar datos tickets segun Clientes (1 -n)
        // Pedir datos al usuario
        Scanner data = new Scanner(System.in);
        System.out.println("\n Ingrese un numero de cliente (1, 2 o 3)");
        int id_cliente = data.nextInt();


        for (Cliente cli : listaClientes) {
            if (cli.getId() == id_cliente) {
                System.out.println(cli.toString());
            }
        }
    }
}

