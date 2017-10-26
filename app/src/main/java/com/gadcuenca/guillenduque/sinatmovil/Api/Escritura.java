
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Escritura {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("unidadSuperficie")
    @Expose
    private UnidadSuperficie unidadSuperficie;
    @SerializedName("verificada")
    @Expose
    private Object verificada;
    @SerializedName("requierePerfeccionamientoLegal")
    @Expose
    private Object requierePerfeccionamientoLegal;
    @SerializedName("anyosSinPerfeccLegal")
    @Expose
    private Object anyosSinPerfeccLegal;
    @SerializedName("superficie")
    @Expose
    private Object superficie;
    @SerializedName("nombrePropietarioAnterior")
    @Expose
    private String nombrePropietarioAnterior;
    @SerializedName("apellidosPropietarioAnterior")
    @Expose
    private String apellidosPropietarioAnterior;
    @SerializedName("fechaCelebracion")
    @Expose
    private Object fechaCelebracion;
    @SerializedName("inscritaRegProp")
    @Expose
    private String inscritaRegProp;
    @SerializedName("fechaRegistro")
    @Expose
    private Object fechaRegistro;
    @SerializedName("codCantonRegistro")
    @Expose
    private Object codCantonRegistro;
    @SerializedName("codCantonCelebracion")
    @Expose
    private Object codCantonCelebracion;
    @SerializedName("cuerpoCierto")
    @Expose
    private Object cuerpoCierto;
    @SerializedName("documentoEscritura")
    @Expose
    private String documentoEscritura;
    @SerializedName("celebracionEscritura")
    @Expose
    private String celebracionEscritura;
    @SerializedName("formaAdquisicion")
    @Expose
    private String formaAdquisicion;
    @SerializedName("numeroNotaria")
    @Expose
    private String numeroNotaria;
    @SerializedName("matriculaRegistral")
    @Expose
    private Object matriculaRegistral;
    @SerializedName("precioAcordado")
    @Expose
    private long precioAcordado;
    @SerializedName("anyoRepertorio")
    @Expose
    private Object anyoRepertorio;
    @SerializedName("libroRepertorio")
    @Expose
    private Object libroRepertorio;
    @SerializedName("fojaRepertorio")
    @Expose
    private Object fojaRepertorio;
    @SerializedName("autoridadLugar")
    @Expose
    private Object autoridadLugar;
    @SerializedName("lugarInscripcion")
    @Expose
    private Object lugarInscripcion;
    @SerializedName("usoEstado")
    @Expose
    private Object usoEstado;
    @SerializedName("otroDesc")
    @Expose
    private String otroDesc;
    @SerializedName("observaciones")
    @Expose
    private Object observaciones;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public UnidadSuperficie getUnidadSuperficie() {
        return unidadSuperficie;
    }

    public void setUnidadSuperficie(UnidadSuperficie unidadSuperficie) {
        this.unidadSuperficie = unidadSuperficie;
    }

    public Object getVerificada() {
        return verificada;
    }

    public void setVerificada(Object verificada) {
        this.verificada = verificada;
    }

    public Object getRequierePerfeccionamientoLegal() {
        return requierePerfeccionamientoLegal;
    }

    public void setRequierePerfeccionamientoLegal(Object requierePerfeccionamientoLegal) {
        this.requierePerfeccionamientoLegal = requierePerfeccionamientoLegal;
    }

    public Object getAnyosSinPerfeccLegal() {
        return anyosSinPerfeccLegal;
    }

    public void setAnyosSinPerfeccLegal(Object anyosSinPerfeccLegal) {
        this.anyosSinPerfeccLegal = anyosSinPerfeccLegal;
    }

    public Object getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Object superficie) {
        this.superficie = superficie;
    }

    public String getNombrePropietarioAnterior() {
        return nombrePropietarioAnterior;
    }

    public void setNombrePropietarioAnterior(String nombrePropietarioAnterior) {
        this.nombrePropietarioAnterior = nombrePropietarioAnterior;
    }

    public String getApellidosPropietarioAnterior() {
        return apellidosPropietarioAnterior;
    }

    public void setApellidosPropietarioAnterior(String apellidosPropietarioAnterior) {
        this.apellidosPropietarioAnterior = apellidosPropietarioAnterior;
    }

    public Object getFechaCelebracion() {
        return fechaCelebracion;
    }

    public void setFechaCelebracion(Object fechaCelebracion) {
        this.fechaCelebracion = fechaCelebracion;
    }

    public String getInscritaRegProp() {
        return inscritaRegProp;
    }

    public void setInscritaRegProp(String inscritaRegProp) {
        this.inscritaRegProp = inscritaRegProp;
    }

    public Object getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Object fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Object getCodCantonRegistro() {
        return codCantonRegistro;
    }

    public void setCodCantonRegistro(Object codCantonRegistro) {
        this.codCantonRegistro = codCantonRegistro;
    }

    public Object getCodCantonCelebracion() {
        return codCantonCelebracion;
    }

    public void setCodCantonCelebracion(Object codCantonCelebracion) {
        this.codCantonCelebracion = codCantonCelebracion;
    }

    public Object getCuerpoCierto() {
        return cuerpoCierto;
    }

    public void setCuerpoCierto(Object cuerpoCierto) {
        this.cuerpoCierto = cuerpoCierto;
    }

    public String getDocumentoEscritura() {
        return documentoEscritura;
    }

    public void setDocumentoEscritura(String documentoEscritura) {
        this.documentoEscritura = documentoEscritura;
    }

    public String getCelebracionEscritura() {
        return celebracionEscritura;
    }

    public void setCelebracionEscritura(String celebracionEscritura) {
        this.celebracionEscritura = celebracionEscritura;
    }

    public String getFormaAdquisicion() {
        return formaAdquisicion;
    }

    public void setFormaAdquisicion(String formaAdquisicion) {
        this.formaAdquisicion = formaAdquisicion;
    }

    public String getNumeroNotaria() {
        return numeroNotaria;
    }

    public void setNumeroNotaria(String numeroNotaria) {
        this.numeroNotaria = numeroNotaria;
    }

    public Object getMatriculaRegistral() {
        return matriculaRegistral;
    }

    public void setMatriculaRegistral(Object matriculaRegistral) {
        this.matriculaRegistral = matriculaRegistral;
    }

    public long getPrecioAcordado() {
        return precioAcordado;
    }

    public void setPrecioAcordado(long precioAcordado) {
        this.precioAcordado = precioAcordado;
    }

    public Object getAnyoRepertorio() {
        return anyoRepertorio;
    }

    public void setAnyoRepertorio(Object anyoRepertorio) {
        this.anyoRepertorio = anyoRepertorio;
    }

    public Object getLibroRepertorio() {
        return libroRepertorio;
    }

    public void setLibroRepertorio(Object libroRepertorio) {
        this.libroRepertorio = libroRepertorio;
    }

    public Object getFojaRepertorio() {
        return fojaRepertorio;
    }

    public void setFojaRepertorio(Object fojaRepertorio) {
        this.fojaRepertorio = fojaRepertorio;
    }

    public Object getAutoridadLugar() {
        return autoridadLugar;
    }

    public void setAutoridadLugar(Object autoridadLugar) {
        this.autoridadLugar = autoridadLugar;
    }

    public Object getLugarInscripcion() {
        return lugarInscripcion;
    }

    public void setLugarInscripcion(Object lugarInscripcion) {
        this.lugarInscripcion = lugarInscripcion;
    }

    public Object getUsoEstado() {
        return usoEstado;
    }

    public void setUsoEstado(Object usoEstado) {
        this.usoEstado = usoEstado;
    }

    public String getOtroDesc() {
        return otroDesc;
    }

    public void setOtroDesc(String otroDesc) {
        this.otroDesc = otroDesc;
    }

    public Object getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(Object observaciones) {
        this.observaciones = observaciones;
    }

}
