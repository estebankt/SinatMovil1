package com.gadcuenca.guillenduque.sinatmovil.Tools;

import android.util.Log;
import android.util.StringBuilderPrinter;

/**
 * Created by marioguillen on 22/10/17.
 */

public class UTM2LatLong {
    private int zone = 17;
    private double easting;
    private double northing;
    private String southernHemisphere = "ACDEFGHJKLM";

    private double phi1;
    private double fact1;
    private double fact2;
    private double fact3;
    private double fact4;
    private double zoneCM;
    private double _a3;

    protected String getHemisphere(String latZone)
    {
        String hemisphere = "N";

        if ( southernHemisphere.indexOf( latZone ) > -1 )
        {
            hemisphere = "S";
        }

        return hemisphere;
    }

    public double[] convertUTMToLatLong( double easting1, double northing1)
    {
        easting = easting1;
        northing = northing1;

        double[] latlon = { 0.0, 0.0 };
        String latZone = "M";
        String hemisphere = getHemisphere(latZone);
        double latitude = 0.0;
        double longitude = 0.0;

        northing = 10000000 - northing;
        setVariables();
        latitude = 180 * (phi1 - fact1 * (fact2 + fact3 + fact4)) / Math.PI;

        if (zone > 0)
        {
            zoneCM = 6 * zone - 183.0;
        }
        else
        {
            zoneCM = 3.0;

        }

        longitude = zoneCM - _a3;
        if (hemisphere.equals("S"))
        {
            latitude = -latitude;
        }

        latlon[0] = latitude;
        latlon[1] = longitude;

        return latlon;
    }

    protected void setVariables( )
    {
        double a = 6378137;
        double e = 0.081819191;
        double e1sq = 0.006739497;
        double k0 = 0.9996;

        double arc = northing / k0;
        double mu = arc
                / (a * (1 - Math.pow(e, 2) / 4.0 - 3 * Math.pow(e, 4) / 64.0 - 5 * Math.pow(e, 6) / 256.0));

        double ei = (1 - Math.pow((1 - e * e), (1 / 2.0)))
                / (1 + Math.pow((1 - e * e), (1 / 2.0)));

        double ca = 3 * ei / 2 - 27 * Math.pow(ei, 3) / 32.0;

        double cb = 21 * Math.pow(ei, 2) / 16 - 55 * Math.pow(ei, 4) / 32;
        double cc = 151 * Math.pow(ei, 3) / 96;
        double cd = 1097 * Math.pow(ei, 4) / 512;
        phi1 = mu + ca * Math.sin(2 * mu) + cb * Math.sin(4 * mu) + cc * Math.sin(6 * mu) + cd
                * Math.sin(8 * mu);

        double n0 = a / Math.pow((1 - Math.pow((e * Math.sin(phi1)), 2)), (1 / 2.0));

        double r0 = a * (1 - e * e) / Math.pow((1 - Math.pow((e * Math.sin(phi1)), 2)), (3 / 2.0));
        fact1 = n0 * Math.tan(phi1) / r0;

        double _a1 = 500000 - easting;
        double dd0 = _a1 / (n0 * k0);
        fact2 = dd0 * dd0 / 2;

        double t0 = Math.pow(Math.tan(phi1), 2);
        double Q0 = e1sq * Math.pow(Math.cos(phi1), 2);
        fact3 = (5 + 3 * t0 + 10 * Q0 - 4 * Q0 * Q0 - 9 * e1sq) * Math.pow(dd0, 4)
                / 24;

        fact4 = (61 + 90 * t0 + 298 * Q0 + 45 * t0 * t0 - 252 * e1sq - 3 * Q0
                * Q0)
                * Math.pow(dd0, 6) / 720;

        //
        double lof1 = _a1 / (n0 * k0);
        double lof2 = (1 + 2 * t0 + Q0) * Math.pow(dd0, 3) / 6.0;
        double lof3 = (5 - 2 * Q0 + 28 * t0 - 3 * Math.pow(Q0, 2) + 8 * e1sq + 24 * Math.pow(t0, 2))
                * Math.pow(dd0, 5) / 120;
        double _a2 = (lof1 - lof2 + lof3) / Math.cos(phi1);
        _a3 = _a2 * 180 / Math.PI;
    }
}