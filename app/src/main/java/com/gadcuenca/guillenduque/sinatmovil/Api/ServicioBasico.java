
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServicioBasico {

    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("aguaConsumoHumano")
    @Expose
    private AguaConsumoHumano aguaConsumoHumano;
    @SerializedName("instalacionElectrica")
    @Expose
    private InstalacionElectrica instalacionElectrica;
    @SerializedName("eliminacionExcretas")
    @Expose
    private EliminacionExcretas eliminacionExcretas;
    @SerializedName("viaAcceso")
    @Expose
    private ViaAcceso viaAcceso;
    @SerializedName("comunicacion")
    @Expose
    private Comunicacion comunicacion;
    @SerializedName("otraVia")
    @Expose
    private OtraVia otraVia;
    @SerializedName("metodoRiego")
    @Expose
    private MetodoRiego metodoRiego;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public AguaConsumoHumano getAguaConsumoHumano() {
        return aguaConsumoHumano;
    }

    public void setAguaConsumoHumano(AguaConsumoHumano aguaConsumoHumano) {
        this.aguaConsumoHumano = aguaConsumoHumano;
    }

    public InstalacionElectrica getInstalacionElectrica() {
        return instalacionElectrica;
    }

    public void setInstalacionElectrica(InstalacionElectrica instalacionElectrica) {
        this.instalacionElectrica = instalacionElectrica;
    }

    public EliminacionExcretas getEliminacionExcretas() {
        return eliminacionExcretas;
    }

    public void setEliminacionExcretas(EliminacionExcretas eliminacionExcretas) {
        this.eliminacionExcretas = eliminacionExcretas;
    }

    public ViaAcceso getViaAcceso() {
        return viaAcceso;
    }

    public void setViaAcceso(ViaAcceso viaAcceso) {
        this.viaAcceso = viaAcceso;
    }

    public Comunicacion getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(Comunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }

    public OtraVia getOtraVia() {
        return otraVia;
    }

    public void setOtraVia(OtraVia otraVia) {
        this.otraVia = otraVia;
    }

    public MetodoRiego getMetodoRiego() {
        return metodoRiego;
    }

    public void setMetodoRiego(MetodoRiego metodoRiego) {
        this.metodoRiego = metodoRiego;
    }

}
