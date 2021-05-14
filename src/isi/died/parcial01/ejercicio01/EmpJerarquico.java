package isi.died.parcial01.ejercicio01;

import java.util.Calendar;

public class EmpJerarquico extends Empleado{


    @Override
    public Double sueldo(){

        Double sueldoAux = sueldoBasico*1.03;


        for(Gasto g : listGasto){

            sueldoAux+= g.getCostoGasto()*1.1;
        }

        return (Calendar.getInstance().get(Calendar.MONTH)==(Calendar.MARCH))? sueldoAux+(sueldoBasico/2) : sueldoAux;
    }

}
