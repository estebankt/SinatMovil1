
package com.gadcuenca.guillenduque.sinatmovil.Api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Predio {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("idPredio")
    @Expose
    private long idPredio;
    @SerializedName("codCatastral")
    @Expose
    private String codCatastral;
    @SerializedName("codCatastralAnt")
    @Expose
    private String codCatastralAnt;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("enConflicto")
    @Expose
    private boolean enConflicto;
    @SerializedName("utilidadPublica")
    @Expose
    private Object utilidadPublica;
    @SerializedName("numPropietarios")
    @Expose
    private long numPropietarios;
    @SerializedName("coberturaNativa")
    @Expose
    private Object coberturaNativa;
    @SerializedName("ecosistemaRelevante")
    @Expose
    private EcosistemaRelevante ecosistemaRelevante;
    @SerializedName("ultimoTramitePredio")
    @Expose
    private String ultimoTramitePredio;
    @SerializedName("origen")
    @Expose
    private String origen;
    @SerializedName("informantes")
    @Expose
    private List<Object> informantes = null;
    @SerializedName("conflictos")
    @Expose
    private List<Object> conflictos = null;
    @SerializedName("valoracion")
    @Expose
    private Valoracion valoracion;
    @SerializedName("servicioBasico")
    @Expose
    private ServicioBasico servicioBasico;
    @SerializedName("usoTierra")
    @Expose
    private UsoTierra usoTierra;
    @SerializedName("direccion")
    @Expose
    private Direccion direccion;
    @SerializedName("funcionarioPredios")
    @Expose
    private List<Object> funcionarioPredios = null;
    @SerializedName("recibeNotificaciones")
    @Expose
    private String recibeNotificaciones;
    @SerializedName("geom")
    @Expose
    private String geom;
    @SerializedName("area")
    @Expose
    private double area;
    @SerializedName("tipoPredio")
    @Expose
    private String tipoPredio;
    @SerializedName("observaciones")
    @Expose
    private String observaciones;
    @SerializedName("poligono")
    @Expose
    private Poligono poligono;
    @SerializedName("canton")
    @Expose
    private Canton__ canton;
    @SerializedName("mejoras")
    @Expose
    private List<Object> mejoras = null;
    @SerializedName("bloques")
    @Expose
    private List<Object> bloques = null;
    @SerializedName("pisos")
    @Expose
    private List<Object> pisos = null;
    @SerializedName("propietarios")
    @Expose
    private List<Propietario> propietarios = null;
    @SerializedName("escrituras")
    @Expose
    private List<Escritura> escrituras = null;
    @SerializedName("sinEscrituras")
    @Expose
    private List<Object> sinEscrituras = null;
    @SerializedName("cultivos")
    @Expose
    private List<Cultivo> cultivos = null;
    @SerializedName("documentos")
    @Expose
    private List<Object> documentos = null;
    @SerializedName("resolucionDeclaratoriaPublica")
    @Expose
    private Object resolucionDeclaratoriaPublica;
    @SerializedName("factorDiversificacion")
    @Expose
    private Object factorDiversificacion;

    public long getId() {
        return id;
    }

    public Object getVersion() {
        return version;
    }

    public long getIdPredio() {
        return idPredio;
    }

    public String getCodCatastral() {
        return codCatastral;
    }

    public String getCodCatastralAnt() {
        return codCatastralAnt;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEnConflicto() {
        return enConflicto;
    }

    public Object getUtilidadPublica() {
        return utilidadPublica;
    }

    public long getNumPropietarios() {
        return numPropietarios;
    }

    public Object getCoberturaNativa() {
        return coberturaNativa;
    }

    public EcosistemaRelevante getEcosistemaRelevante() {
        return ecosistemaRelevante;
    }

    public String getUltimoTramitePredio() {
        return ultimoTramitePredio;
    }

    public String getOrigen() {
        return origen;
    }

    public List<Object> getInformantes() {
        return informantes;
    }

    public List<Object> getConflictos() {
        return conflictos;
    }

    public Valoracion getValoracion() {
        return valoracion;
    }

    public ServicioBasico getServicioBasico() {
        return servicioBasico;
    }

    public UsoTierra getUsoTierra() {
        return usoTierra;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public List<Object> getFuncionarioPredios() {
        return funcionarioPredios;
    }

    public String getRecibeNotificaciones() {
        return recibeNotificaciones;
    }

    public String getGeom() {
        return geom;
    }

    public double getArea() {
        return area;
    }

    public String getTipoPredio() {
        return tipoPredio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Poligono getPoligono() {
        return poligono;
    }

    public Canton__ getCanton() {
        return canton;
    }

    public List<Object> getMejoras() {
        return mejoras;
    }

    public List<Object> getBloques() {
        return bloques;
    }

    public List<Object> getPisos() {
        return pisos;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public List<Escritura> getEscrituras() {
        return escrituras;
    }

    public List<Object> getSinEscrituras() {
        return sinEscrituras;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public List<Object> getDocumentos() {
        return documentos;
    }

    public Object getResolucionDeclaratoriaPublica() {
        return resolucionDeclaratoriaPublica;
    }

    public Object getFactorDiversificacion() {
        return factorDiversificacion;
    }

}
