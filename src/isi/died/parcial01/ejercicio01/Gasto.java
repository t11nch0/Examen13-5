package isi.died.parcial01.ejercicio01;

public class Gasto {

    private Integer numComprobante;
    private Boolean gastoAprobado;
    private Integer costoGasto;

    public Integer getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(Integer numComprobante) {
        this.numComprobante = numComprobante;
    }

    public Boolean getGastoAprobado() {
        return gastoAprobado;
    }

    public void setGastoAprobado(Boolean gastoAprobado) {
        this.gastoAprobado = gastoAprobado;
    }

    public Integer getCostoGasto() {
        return costoGasto;
    }

    public void setCostoGasto(Integer costoGasto) {
        this.costoGasto = costoGasto;
    }

    public Gasto(Integer num, Boolean aprobado, Integer costo){
        this.numComprobante=num;
        this.gastoAprobado=aprobado;
        this.costoGasto=costo;
    }
}
