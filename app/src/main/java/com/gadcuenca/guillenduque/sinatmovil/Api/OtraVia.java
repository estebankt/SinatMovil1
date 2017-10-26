
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OtraVia {

    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("acuatica")
    @Expose
    private boolean acuatica;
    @SerializedName("aerea")
    @Expose
    private boolean aerea;
    @SerializedName("ferrea")
    @Expose
    private boolean ferrea;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public boolean isAcuatica() {
        return acuatica;
    }

    public void setAcuatica(boolean acuatica) {
        this.acuatica = acuatica;
    }

    public boolean isAerea() {
        return aerea;
    }

    public void setAerea(boolean aerea) {
        this.aerea = aerea;
    }

    public boolean isFerrea() {
        return ferrea;
    }

    public void setFerrea(boolean ferrea) {
        this.ferrea = ferrea;
    }

}
