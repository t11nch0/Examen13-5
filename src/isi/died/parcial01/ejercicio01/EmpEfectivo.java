package isi.died.parcial01.ejercicio01;

import java.util.Calendar;

public class EmpEfectivo extends Empleado{


    @Override
    public Double sueldo(){

        Double sueldoAux= (sueldoBasico* 0.86);

        for(Gasto g : listGasto){
            if(g.getGastoAprobado())
                sueldoAux+= g.getCostoGasto();
        }

        return (Calendar.getInstance().get(Calendar.MONTH)==(Calendar.MARCH))? sueldoAux+(sueldoBasico/2) : sueldoAux;

    }
}
