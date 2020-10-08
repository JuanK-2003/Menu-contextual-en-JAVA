package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Juan_K
 */
public class Estudiante extends Persona {
    String Carnet;
    String Carrera;
    ArrayList<Curso> course = new ArrayList<Curso>();
    int c = 0;
    public Estudiante(){
        
    }

    public Estudiante(String Nombre, String DPI, Date Fecha_Naci) {
        super(Nombre, DPI, Fecha_Naci);
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    public void addCurso(String nombre_Curso){
        
    }
}
