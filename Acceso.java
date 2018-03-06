/**
 * Simulacion de acceso al servidor.
 * @author (Sergio Acebes)
 * @version (06/03/2018)
 */

public class Acceso
{
    private String ip;
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String paginaWeb;
    private int codigoServidor;
    /**
     * Constructor de objetos de la clase Acceso.
     * @param datos - Cadena con todos los datos del acceso 
     * separado por espacios(ip,año,mes,dia,hora,minuto,pagina web y codigo servidor).
     */
    public Acceso(String datos)
    {
        String[] datosAccesos = datos.split(" ");
        this.ip = datosAccesos[0];
        this.ano = Integer.parseInt(datosAccesos[1].substring(1,4));
        this.mes = Integer.parseInt(datosAccesos[2]);
        this.dia = Integer.parseInt(datosAccesos[3]);;
        this.hora = Integer.parseInt(datosAccesos[4]);
        this.minutos = Integer.parseInt(datosAccesos[5].substring(0,1));
        this.paginaWeb = datosAccesos[6];
        this.codigoServidor =  Integer.parseInt(datosAccesos[7]);
    }

    /**
     * Devuelve el año del acceso.
     * @return - año.
     */
    public int getAno() 
    {
        return ano;
    }

    /**
     * Devuelve el mes del acceso.
     * @return - mes.
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * Devuelve el dia del acceso.
     * @return - dia.
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * Devuelve la hora del acceso.
     * @return - hora.
     */
    public int getHora()
    {
        return hora;
    }

    /**
     * Devuelve el minuto del acceso.
     * @return - minutos.
     */
    public int getMinutos()
    {
        return minutos;
    }
    
}