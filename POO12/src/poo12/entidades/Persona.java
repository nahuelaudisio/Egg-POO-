package poo12.entidades;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private Date fecha_nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
