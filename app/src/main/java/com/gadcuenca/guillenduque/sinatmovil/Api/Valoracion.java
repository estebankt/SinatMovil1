
package com.gadcuenca.guillenduque.sinatmovil.Api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Valoracion {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("fecha")
    @Expose
    private long fecha;
    @SerializedName("avaluo")
    @Expose
    private double avaluo;
    @SerializedName("avaluoSueloBruto")
    @Expose
    private double avaluoSueloBruto;
    @SerializedName("avaluoConstruccion")
    @Expose
    private long avaluoConstruccion;
    @SerializedName("avaluoMejoras")
    @Expose
    private long avaluoMejoras;
    @SerializedName("avaluoTotal")
    @Expose
    private double avaluoTotal;
    @SerializedName("desgloses")
    @Expose
    private List<Desglose> desgloses = null;
    @SerializedName("desglosesEdificaciones")
    @Expose
    private List<Object> desglosesEdificaciones = null;
    @SerializedName("desglosesMejoras")
    @Expose
    private List<Object> desglosesMejoras = null;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    public double getAvaluoSueloBruto() {
        return avaluoSueloBruto;
    }

    public void setAvaluoSueloBruto(double avaluoSueloBruto) {
        this.avaluoSueloBruto = avaluoSueloBruto;
    }

    public long getAvaluoConstruccion() {
        return avaluoConstruccion;
    }

    public void setAvaluoConstruccion(long avaluoConstruccion) {
        this.avaluoConstruccion = avaluoConstruccion;
    }

    public long getAvaluoMejoras() {
        return avaluoMejoras;
    }

    public void setAvaluoMejoras(long avaluoMejoras) {
        this.avaluoMejoras = avaluoMejoras;
    }

    public double getAvaluoTotal() {
        return avaluoTotal;
    }

    public void setAvaluoTotal(double avaluoTotal) {
        this.avaluoTotal = avaluoTotal;
    }

    public List<Desglose> getDesgloses() {
        return desgloses;
    }

    public void setDesgloses(List<Desglose> desgloses) {
        this.desgloses = desgloses;
    }

    public List<Object> getDesglosesEdificaciones() {
        return desglosesEdificaciones;
    }

    public void setDesglosesEdificaciones(List<Object> desglosesEdificaciones) {
        this.desglosesEdificaciones = desglosesEdificaciones;
    }

    public List<Object> getDesglosesMejoras() {
        return desglosesMejoras;
    }

    public void setDesglosesMejoras(List<Object> desglosesMejoras) {
        this.desglosesMejoras = desglosesMejoras;
    }

}
