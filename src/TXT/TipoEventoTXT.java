package TXT;

import Datos.TipoEvento;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author JafetDG
 */
public class TipoEventoTXT {

    public static final String NameTXT = "TipoEvento.txt";

    public static void AnnadirData(ArrayList lista) {
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (TipoEvento tipoEvento : (ArrayList<TipoEvento>) lista) {
                bufferedWriter.write(tipoEvento.getTipoEvento() + "\n");
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

        try {

            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                TipoEvento t = new TipoEvento();
                delimitar.useDelimiter(",");

                t.setTipoEvento(delimitar.next());

                System.out.println(t.getTipoEvento() + "\n");

                listaEvento.add(t);
            }

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaEvento;

    }

}
