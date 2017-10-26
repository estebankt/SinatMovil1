package com.gadcuenca.guillenduque.sinatmovil.Tools;


import android.util.Base64;


/**
 * Created by marioguillen on 7/9/17.
 */

public class Tools {

    public String makeUrl (double x, double y){

        String minx = String.valueOf(x);
        String miny = String.valueOf(y);
        String maxx = String.valueOf(x+1);
        String maxy = String.valueOf(y+1);

        //SINAT
        String url = "http://192.168.20.37/sinat_cantonal_platform/api/predios" +
                "?maxx=" + maxx +
                "&maxy=" + maxy +
                "&minx=" + minx +
                "&miny=" + miny +
                "&levantamiento=false";
        return url;
    }

    public String makeAuthHeader(String user, String password){
        String base = user + ":" + password;
        String authHeader = "Basic " + Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);
        return authHeader;
    }

    public String [] parsePoligono (String poligono){
        poligono = poligono.substring(27, poligono.length()-3);
        poligono = poligono.replace(", ", ",");
        String [] poligonoParsed = poligono.split(",");
        return poligonoParsed;
    }
    
}
