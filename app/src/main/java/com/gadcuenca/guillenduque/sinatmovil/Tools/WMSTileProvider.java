package com.gadcuenca.guillenduque.sinatmovil.Tools;

import android.util.Log;

import com.google.android.gms.maps.model.UrlTileProvider;

public abstract class WMSTileProvider extends UrlTileProvider {

    private final String TAG = this.getClass().getSimpleName() + " Mario dice ";
	
	// Web Mercator n/w corner of the map.
	private static final double[] TILE_ORIGIN = {-20037508.34789244, 20037508.34789244};
/*  private static final double[] TILE_ORIGIN = {-8766409.902203,-939258.203807};*/

    //array indexes for that data
	private static final int ORIG_X = 0;
    private static final int ORIG_Y = 1; // "
    
    // Size of square world map in meters, using WebMerc projection.
    private static final double MAP_SIZE = 20037508.34789244 * 2;
//    private static final double MAP_SIZE = 4.007501669578488E7;
    
    // array indexes for array to hold bounding boxes.
    protected static final int MINX = 0;
    protected static final int MAXX = 1;
    protected static final int MINY = 2;
    protected static final int MAXY = 3;
    
    // Construct with tile size in pixels, normally 256, see parent class.
    public WMSTileProvider(int x, int y) {
    	super(x, y);
    }
     
    // Return a web Mercator bounding box given tile x/y indexes and a zoom
    // level.
	protected double[] getBoundingBox(int x, int y, int zoom) {
        Log.i(TAG, "Map Size: "+ String.valueOf(MAP_SIZE));
        double tileSize = MAP_SIZE / Math.pow(2, zoom);
        Log.i(TAG, "X: "+ String.valueOf(x));
        Log.i(TAG, "Y: "+ String.valueOf(y));
        Log.i(TAG, "Tile Size: "+ String.valueOf(tileSize));
        Log.i(TAG, "Zoom: "+ String.valueOf(zoom));
    	double minx = TILE_ORIGIN[ORIG_X] + x * tileSize;
    	double maxx = TILE_ORIGIN[ORIG_X] + (x+1) * tileSize;
    	double miny = TILE_ORIGIN[ORIG_Y] - (y+1) * tileSize;
    	double maxy = TILE_ORIGIN[ORIG_Y] - y * tileSize;

        double[] bbox = new double[4];

        bbox[MINX] = minx;
    	bbox[MINY] = miny;
    	bbox[MAXX] = maxx;
    	bbox[MAXY] = maxy;

    	return bbox;
    }
	
}