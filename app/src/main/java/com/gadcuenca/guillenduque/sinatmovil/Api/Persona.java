
package com.gadcuenca.guillenduque.sinatmovil.Api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Persona {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("tipoPersona")
    @Expose
    private String tipoPersona;
    @SerializedName("nombres")
    @Expose
    private Object nombres;
    @SerializedName("apellidos")
    @Expose
    private Object apellidos;
    @SerializedName("codCedula")
    @Expose
    private Object codCedula;
    @SerializedName("verificada")
    @Expose
    private Object verificada;
    @SerializedName("annoNacimiento")
    @Expose
    private Object annoNacimiento;
    @SerializedName("razonSocial")
    @Expose
    private Object razonSocial;
    @SerializedName("ruc")
    @Expose
    private Object ruc;
    @SerializedName("nombreMinisterio")
    @Expose
    private Object nombreMinisterio;
    @SerializedName("numeroAcuerdoMinisterial")
    @Expose
    private Object numeroAcuerdoMinisterial;
    @SerializedName("numeroRegistro")
    @Expose
    private long numeroRegistro;
    @SerializedName("fechaInscripcion")
    @Expose
    private Object fechaInscripcion;
    @SerializedName("inscritaMinisterio")
    @Expose
    private boolean inscritaMinisterio;
    @SerializedName("validacionRUC")
    @Expose
    private Object validacionRUC;
    @SerializedName("correoElectronico")
    @Expose
    private Object correoElectronico;
    @SerializedName("telefono")
    @Expose
    private Object telefono;
    @SerializedName("documentos")
    @Expose
    private List<Object> documentos = null;
    @SerializedName("tipoDocumento")
    @Expose
    private Object tipoDocumento;
    @SerializedName("rucCCValidado")
    @Expose
    private boolean rucCCValidado;
    @SerializedName("anyosPosesion")
    @Expose
    private Object anyosPosesion;

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

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Object getNombres() {
        return nombres;
    }

    public void setNombres(Object nombres) {
        this.nombres = nombres;
    }

    public Object getApellidos() {
        return apellidos;
    }

    public void setApellidos(Object apellidos) {
        this.apellidos = apellidos;
    }

    public Object getCodCedula() {
        return codCedula;
    }

    public void setCodCedula(Object codCedula) {
        this.codCedula = codCedula;
    }

    public Object getVerificada() {
        return verificada;
    }

    public void setVerificada(Object verificada) {
        this.verificada = verificada;
    }

    public Object getAnnoNacimiento() {
        return annoNacimiento;
    }

    public void setAnnoNacimiento(Object annoNacimiento) {
        this.annoNacimiento = annoNacimiento;
    }

    public Object getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(Object razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Object getRuc() {
        return ruc;
    }

    public void setRuc(Object ruc) {
        this.ruc = ruc;
    }

    public Object getNombreMinisterio() {
        return nombreMinisterio;
    }

    public void setNombreMinisterio(Object nombreMinisterio) {
        this.nombreMinisterio = nombreMinisterio;
    }

    public Object getNumeroAcuerdoMinisterial() {
        return numeroAcuerdoMinisterial;
    }

    public void setNumeroAcuerdoMinisterial(Object numeroAcuerdoMinisterial) {
        this.numeroAcuerdoMinisterial = numeroAcuerdoMinisterial;
    }

    public long getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(long numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Object getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Object fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isInscritaMinisterio() {
        return inscritaMinisterio;
    }

    public void setInscritaMinisterio(boolean inscritaMinisterio) {
        this.inscritaMinisterio = inscritaMinisterio;
    }

    public Object getValidacionRUC() {
        return validacionRUC;
    }

    public void setValidacionRUC(Object validacionRUC) {
        this.validacionRUC = validacionRUC;
    }

    public Object getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(Object correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Object getTelefono() {
        return telefono;
    }

    public void setTelefono(Object telefono) {
        this.telefono = telefono;
    }

    public List<Object> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Object> documentos) {
        this.documentos = documentos;
    }

    public Object getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Object tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public boolean isRucCCValidado() {
        return rucCCValidado;
    }

    public void setRucCCValidado(boolean rucCCValidado) {
        this.rucCCValidado = rucCCValidado;
    }

    public Object getAnyosPosesion() {
        return anyosPosesion;
    }

    public void setAnyosPosesion(Object anyosPosesion) {
        this.anyosPosesion = anyosPosesion;
    }

}
