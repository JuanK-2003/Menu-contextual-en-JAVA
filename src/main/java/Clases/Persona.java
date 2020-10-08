package Clases;

import static Clases.Funtion.Calcular;
import Clases.Funtion.TryFunction;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juan_K
 */
public class Persona implements TryFunction {
    private String Nombre;
    private String DPI;
    private Date Fecha_Naci;
    private int Edad;

    public Persona(){
        
    }
    public Persona(String Nombre, String DPI, Date Fecha_Naci) {
        this.Nombre = Nombre;
        this.DPI = DPI;
        this.Fecha_Naci = Fecha_Naci;
        this.Calcular_Edad();
    }

    public void Calcular_Edad(){
        Calendar c = Calendar.getInstance();
        c.setTime(Fecha_Naci);
        int Año = c.get(Calendar.YEAR);
        int Mes = c.get(Calendar.MONTH)+1;
        int Dia = c.get(Calendar.DAY_OF_MONTH);
        
        this.Edad = Calcular.apply(Año, Mes, Dia);
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public Date getFecha_Naci() {
        return Fecha_Naci;
    }

    public void setFecha_Naci(Date Fecha_Naci) {
        this.Fecha_Naci = Fecha_Naci;
    }
    public int getEdad() {
        return Edad;
    }
    public Object[] getinfo(){
        Object[] d = new Object[3];
        d[0] = this.Nombre;
        d[1] = this.DPI;
        d[2] = this.Edad;
        return d;
    }
    @Override
    public Object apply(Object t, Object u, Object v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
