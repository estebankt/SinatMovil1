package com.gadcuenca.guillenduque.sinatmovil.Tools;

/**
 * Created by marioguillen on 23/10/17.
 */

public class WMSProvider {
    public String crs = "EPSG:900913";
    public String url;
    public String layers;
    public String styles = "";
    public String transparent = "true";

    public WMSProvider() {
    }

    public WMSProvider layers(String layers) {
        this.layers = layers;
        return this;
    }

    public WMSProvider url(String url) {
        this.url = url;
        return this;
    }

    public WMSProvider crs(String crs) {
        this.crs = crs;
        return this;
    }

    public WMSProvider styles(String styles) {
        this.styles = styles;
        return this;
    }

    public WMSProvider transparent(boolean transparent) {
        this.transparent = Boolean.toString(transparent);
        return this;
    }
}
