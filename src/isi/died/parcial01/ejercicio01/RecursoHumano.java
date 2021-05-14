package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class RecursoHumano {


    public List<ReciboSueldo> reciboSueldo(List<Empleado> empleados){

        List<ReciboSueldo> listaAux= new ArrayList<>();


        for(Empleado e : empleados){
            listaAux.add(new ReciboSueldo(e));
        }

        return listaAux;
    }

}
