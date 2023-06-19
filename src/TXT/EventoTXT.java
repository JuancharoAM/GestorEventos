package TXT;

import Datos.Evento;
import Datos.TicketComprado;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author JafetDG
 */
public class EventoTXT {

    public static final String NameTXT = "Eventos.txt";
    public static final String FORMATO_FECHA = "dd-MM-yyyy";

    public static void AnnadirData(ArrayList lista) {
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Evento evento : (ArrayList<Evento>) lista) {
                bufferedWriter.write(evento.getTipoEvento() + "," + evento.getNombre() + "," + convertirFechaTipoDate(evento.getFecha())+ "," + evento.getHora() + "," + evento.getTotalEntradas() + "," + evento.getEntradasDisponibles() + "," + String.join("&", evento.getColaBloques()) + "\n");
            }
            bufferedWriter.close();
            System.out.println("El archivo ha sido creado exitosamente");
        } catch (Exception e) {
            System.out.println("Error al guardar los datos del evento el en txt");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*------------------------------------------------------------------------------------------------------------------*/
    public static ArrayList LeerData() {
        File file = new File(NameTXT);
        ArrayList listaEvento = new ArrayList();
        Scanner scanner;
        Queue<String> colaBloques = null;
        String opcionesBloques;

        try {

            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                Evento t = new Evento();
                delimitar.useDelimiter(",");

                t.setTipoEvento(delimitar.next());
                t.setNombre(delimitar.next());
                String fechaTexto = delimitar.next();
                Date fecha = convertirFechaTipoString(fechaTexto);//Se pasa el String date a Date
                t.setFecha(fecha);
                t.setHora(delimitar.next());
                t.setTotalEntradas(Integer.parseInt(delimitar.next()));
                t.setEntradasDisponibles(Integer.parseInt(delimitar.next()));
                opcionesBloques = delimitar.next();
                if (!opcionesBloques.isEmpty()) {
                    colaBloques = new LinkedList<>(Arrays.asList(opcionesBloques.split("&")));

                }
                t.setColaBloques(colaBloques);

                //System.out.println(t.getTipoEvento() + "," + t.getNombre() + "," + t.getFecha() + "," + t.getHora() + "," + t.getTotalEntradas() + "," + t.getEntradasDisponibles() + "," + colaBloques + "\n");

                listaEvento.add(t);
            }

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaEvento;

    }

    public static void AnnadirComprados(Stack pilaComprados) {
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter("TicketsComprados.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (TicketComprado compradoTeatral : (Stack<TicketComprado>) pilaComprados) {
                bufferedWriter.write(compradoTeatral.getNombre() + "," + compradoTeatral.getFecha() + "," + compradoTeatral.getHora() + "," + compradoTeatral.getBloque() + "," + compradoTeatral.getNumero() + "\n");
            }
            bufferedWriter.close();
            System.out.println("El archivo ha sido creado exitosamente");
        } catch (Exception e) {
            System.out.println("Error al guardar los datos del evento el en txt");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static Stack LeerComprados() {
        File file = new File("TicketsComprados.txt");
        Stack pilaComprados = new Stack();
        Scanner scanner;

        try {

            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                TicketComprado t = new TicketComprado();
                delimitar.useDelimiter("\\s*,\\s*");

                t.setNombre(delimitar.next());
                t.setFecha(delimitar.next());
                t.setHora(delimitar.next());
                t.setBloque(delimitar.next());
                t.setNumero(delimitar.next());

                pilaComprados.push(t);
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error al traer los datos del Gestion_Teatrales.txt \n"
                    + "Revisar el metodo LeerData()");
        }

        return pilaComprados;

    }

    public static Date convertirFechaTipoString(String fecha) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMATO_FECHA);
        Date date = formatter.parse(fecha);
        return date;
    }

    public static String convertirFechaTipoDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMATO_FECHA);
        return formatter.format(date);
    }
}
