package isi.died.parcial01.ejercicio01;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class ReciboSueldoTest {
    @Test

    public void test1(){

        Empleado e= new EmpEfectivo();

        e.dni= 02021321652;
        e.email= "ayudaVoyAColapsar@gmail.com";
        e.fechaContratacion= Calendar.getInstance().getTime();
        e.nombre= "Martin";
        Gasto gastadoMes= new Gasto(5465,true,100);
        e.listGasto.add(gastadoMes);

        ReciboSueldo recibo= new ReciboSueldo(e);

        assertEquals(recibo.getClass(), ReciboSueldo.class);
        assertEquals(recibo.getTotalPago(),e.sueldo());

    }

}