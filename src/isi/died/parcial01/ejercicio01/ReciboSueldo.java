package isi.died.parcial01.ejercicio01;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class ReciboSueldo {

    private static Integer contador= 0;
    private Integer numeroRecibo;
    private Integer mesRecibo;
    private Double totalPago;
    private Empleado punteroEmpleado;

    public ReciboSueldo(Empleado e){
        this.numeroRecibo= contador++;
        this.mesRecibo= Calendar.getInstance().get(Calendar.MONTH);
        this.totalPago= e.sueldo();
        this.punteroEmpleado= e;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        ReciboSueldo.contador = contador;
    }

    public Integer getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(Integer numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public Integer getMesRecibo() {
        return mesRecibo;
    }

    public void setMesRecibo(Integer mesRecibo) {
        this.mesRecibo = mesRecibo;
    }

    public Double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }

    public Empleado getPunteroEmpleado() {
        return punteroEmpleado;
    }

    public void setPunteroEmpleado(Empleado punteroEmpleado) {
        this.punteroEmpleado = punteroEmpleado;
    }
}
