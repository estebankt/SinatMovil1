
package com.gadcuenca.guillenduque.sinatmovil.Api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Desglose {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("coberturaA")
    @Expose
    private String coberturaA;
    @SerializedName("avaluoDolarMetroA")
    @Expose
    private double avaluoDolarMetroA;
    @SerializedName("coberturaB")
    @Expose
    private Object coberturaB;
    @SerializedName("uso")
    @Expose
    private String uso;
    @SerializedName("avaluoDolarMetroB")
    @Expose
    private Object avaluoDolarMetroB;
    @SerializedName("zonaHomogeneaValoracion")
    @Expose
    private String zonaHomogeneaValoracion;
    @SerializedName("area")
    @Expose
    private double area;
    @SerializedName("avaluoDolarMetro")
    @Expose
    private double avaluoDolarMetro;
    @SerializedName("avaluo")
    @Expose
    private double avaluo;
    @SerializedName("valorFactorFinal")
    @Expose
    private double valorFactorFinal;
    @SerializedName("avaluoTotal")
    @Expose
    private double avaluoTotal;
    @SerializedName("tecnificacion")
    @Expose
    private String tecnificacion;
    @SerializedName("agregacion")
    @Expose
    private String agregacion;
    @SerializedName("factoresDesgloses")
    @Expose
    private List<FactoresDesglose> factoresDesgloses = null;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getCoberturaA() {
        return coberturaA;
    }

    public void setCoberturaA(String coberturaA) {
        this.coberturaA = coberturaA;
    }

    public double getAvaluoDolarMetroA() {
        return avaluoDolarMetroA;
    }

    public void setAvaluoDolarMetroA(double avaluoDolarMetroA) {
        this.avaluoDolarMetroA = avaluoDolarMetroA;
    }

    public Object getCoberturaB() {
        return coberturaB;
    }

    public void setCoberturaB(Object coberturaB) {
        this.coberturaB = coberturaB;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Object getAvaluoDolarMetroB() {
        return avaluoDolarMetroB;
    }

    public void setAvaluoDolarMetroB(Object avaluoDolarMetroB) {
        this.avaluoDolarMetroB = avaluoDolarMetroB;
    }

    public String getZonaHomogeneaValoracion() {
        return zonaHomogeneaValoracion;
    }

    public void setZonaHomogeneaValoracion(String zonaHomogeneaValoracion) {
        this.zonaHomogeneaValoracion = zonaHomogeneaValoracion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAvaluoDolarMetro() {
        return avaluoDolarMetro;
    }

    public void setAvaluoDolarMetro(double avaluoDolarMetro) {
        this.avaluoDolarMetro = avaluoDolarMetro;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    public double getValorFactorFinal() {
        return valorFactorFinal;
    }

    public void setValorFactorFinal(double valorFactorFinal) {
        this.valorFactorFinal = valorFactorFinal;
    }

    public double getAvaluoTotal() {
        return avaluoTotal;
    }

    public void setAvaluoTotal(double avaluoTotal) {
        this.avaluoTotal = avaluoTotal;
    }

    public String getTecnificacion() {
        return tecnificacion;
    }

    public void setTecnificacion(String tecnificacion) {
        this.tecnificacion = tecnificacion;
    }

    public String getAgregacion() {
        return agregacion;
    }

    public void setAgregacion(String agregacion) {
        this.agregacion = agregacion;
    }

    public List<FactoresDesglose> getFactoresDesgloses() {
        return factoresDesgloses;
    }

    public void setFactoresDesgloses(List<FactoresDesglose> factoresDesgloses) {
        this.factoresDesgloses = factoresDesgloses;
    }

}
