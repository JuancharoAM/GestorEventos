package TXT;

import Datos.Usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JafetDG
 */
public class LoginTXT 
{
    
     static String NameTXT = "Usuarios.txt";
    
    public static void AnnadirData(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (Usuario usuario : (ArrayList<Usuario>)lista)
                {
                    bufferedWriter.write(usuario.getUserName() + "," + usuario.getPassword() + "\n");
                }
                bufferedWriter.close();
                System.out.println("El archivo ha sido creado exitosamente");
        }
        catch(Exception e)
        {
            System.out.println("Error al guardar los datos de usuario el en txt");
        }
        finally
        {
            if(fileWriter!=null)
            {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
    
    
    /*------------------------------------------------------------------------------------------------------------------*/
        
    
    public static ArrayList LeerData() 
    {
        File file = new File(NameTXT);
        ArrayList listaUsuario = new ArrayList();
        Scanner scanner;

        try 
        {
            
            scanner = new Scanner(file);
  
        while (scanner.hasNextLine()) 
        {
        String linea = scanner.nextLine();
        Scanner delimitar = new Scanner(linea);
        Usuario u = new Usuario();
            delimitar.useDelimiter("\\s*,\\s*");
        
        u.setUserName(delimitar.next());
        u.setPassword(delimitar.next());
            
        System.out.println(u.getUserName() + "," + u.getPassword() + "\n");
        listaUsuario.add(u);
        }

        scanner.close();

    } catch (Exception e) {
        System.out.println("Error al traer los datos del Usuario.txt \n" 
                + "Revisar el metodo LeerData()");
    }

    return listaUsuario;
    
    }
    
    /*------------------------------------------------------------------------------------------------------------------*/
    
    /*Metodo para validar el usuario en el FRMLogin*/
    public static boolean validarUsuario(String nombreUsuario, String contrasena) {
        ArrayList<Usuario> listaUsuarios = LoginTXT.LeerData();
        boolean usuarioValido = false;

        for (Usuario u : listaUsuarios) {
            if (u.getUserName().equals(nombreUsuario) && u.getPassword().equals(contrasena)) {
                usuarioValido = true;
                break;
            }
        }
        
        return usuarioValido;
    
    }
    
}
