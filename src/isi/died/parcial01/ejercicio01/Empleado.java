package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Empleado{

    protected Integer dni;
    protected String nombre;
    protected Date fechaContratacion;
    protected String email;
    protected List<Gasto> listGasto= new ArrayList<>();
    protected static Double sueldoBasico =10000.0;


    public abstract Double sueldo();
}
