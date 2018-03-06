import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Analizador de accesos al servidor.
 * @author (Sergio Acebes)
 * @version (06/03/2018)
 */
public class AnalizadorAccesosAServidor
{
    private ArrayList<Acceso> accesos;
    /**
     * Constructor de objetos de la clase AnalizadorAccesosAServidor.
     */
    public AnalizadorAccesosAServidor() 
    {
        accesos = new ArrayList<>();
    }
    
    /**
     * Analizador de un archivo que introduiremos como parametro.
     * @param archivo - nombre del archivo de log a analizar.
     * 
     */
    public void analizarArchivoDeLog(String archivo)
    {
        accesos.clear();
        File archivoALeer = new File(archivo);
        try {
            Scanner sc = new Scanner(archivoALeer);
            while (sc.hasNextLine()) {
                String lineaLeida = sc.nextLine();               
                String[] elementosLinea = lineaLeida.split(" ");
                Acceso accesoActual = new Acceso(lineaLeida);
                                                               
                
                accesos.add(accesoActual);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Ocurrio algun error al leer el archivo.");
        }
    }
    
    /**
     * Metodo que nos develve la hora con mas accesos al servidor.
     * @return - hora con mas accesos.
     */
    public int obtenerHoraMasAccesos() 
    {
        int valorADevolver = -1;
        
        if (!accesos.isEmpty()) {
            int[] accesosPorHora = new int[24];
    
            for (Acceso accesoActual : accesos) {
                int horaAccesoActual = accesoActual.getHora();
                accesosPorHora[horaAccesoActual] = accesosPorHora[horaAccesoActual] + 1;
            }
            
            int numeroDeAccesosMasAlto = accesosPorHora[0];
            int horaDeAccesosMasAlto = 0;
            for (int i = 0; i < accesosPorHora.length; i++) {
                if (accesosPorHora[i] >= numeroDeAccesosMasAlto) {
                    numeroDeAccesosMasAlto = accesosPorHora[i];
                    horaDeAccesosMasAlto = i;
                }
            }
            
            valorADevolver = horaDeAccesosMasAlto;                      
        }
        
        return valorADevolver;
    }

    public String paginaWebMasSolicitada() 
    {
        return "";
    }
    
    public String clienteConMasAccesosExitosos()
    {
        return "";
    }


}