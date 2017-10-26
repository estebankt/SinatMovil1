package com.gadcuenca.guillenduque.sinatmovil;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.gadcuenca.guillenduque.sinatmovil.Api.*;
import com.gadcuenca.guillenduque.sinatmovil.Modelos.UserPredio;
import com.gadcuenca.guillenduque.sinatmovil.Tools.Tools;
import com.gadcuenca.guillenduque.sinatmovil.Tools.UTM2LatLong;
import com.gadcuenca.guillenduque.sinatmovil.Tools.WMSProvider;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import com.gadcuenca.guillenduque.sinatmovil.Tools.TileProviderFactory;
import com.gadcuenca.guillenduque.sinatmovil.Tools.LatLong2UTM;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, ActivityCompat.OnRequestPermissionsResultCallback {

    //Crear objeto tipo GoogleMap
    private GoogleMap mMap;

    //Inicializando tools
    private Tools tool = new Tools();

    //Reciviendo usuario y contraseña de la LoginActivity
    private String user = "encuestador";
    private String password = "encuestador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        TileProvider wmsTileProvider = TileProviderFactory.getTileProvider(providers[0]);
        mMap.addTileOverlay(new TileOverlayOptions().tileProvider(wmsTileProvider)).setZIndex(2.0f);

        TileProvider wmsTileProvider1 = TileProviderFactory.getTileProvider(providers[1]);
        mMap.addTileOverlay(new TileOverlayOptions().tileProvider(wmsTileProvider1)).setZIndex(3.0f);

        TileProvider wmsTileProvider2 = TileProviderFactory.getTileProvider(providers[2]);
        mMap.addTileOverlay(new TileOverlayOptions().tileProvider(wmsTileProvider2)).setZIndex(4.0f);

        TileProvider wmsTileProvider3 = TileProviderFactory.getTileProvider(providers[3]);
        mMap.addTileOverlay(new TileOverlayOptions().tileProvider(wmsTileProvider3)).setZIndex(5.0f);

        TileProvider wmsTileProvider4 = TileProviderFactory.getTileProvider(providers[4]);
        mMap.addTileOverlay(new TileOverlayOptions().tileProvider(wmsTileProvider4)).setZIndex(6.0f);

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) ==
                        PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setMyLocationButtonEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this, new String[] {
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION }, 1);
        }

        mMap.setMapStyle(new MapStyleOptions(getResources().getString(R.string.style_json)));

        LatLng cuenca = new LatLng(-2.935043038345798 , -79.01616163551807);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cuenca, 17));


        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {

            public void onMapLongClick(LatLng point) {
                //Okhttp3 para monitorear requests:
                OkHttpClient.Builder okhttpClientBuilder = new OkHttpClient.Builder();

                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

                if (BuildConfig.DEBUG) {
                    okhttpClientBuilder.addInterceptor(interceptor);
                }

                //Inicializando el cosntructor de Retrofit para manejar tranacciones REST
                Retrofit.Builder builder = new Retrofit.Builder()
                        .baseUrl("http://192.168.20.37/sinat_cantonal_platform/api/security/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okhttpClientBuilder.build());

                Retrofit retrofit = builder.build();


                Log.d("Mario Dice: ","Map clicked [" + point.latitude + " / " + point.longitude + "]");

                LatLong2UTM UTM = new LatLong2UTM();
                double [] UTMPoint = UTM.convertLatLonToUTM(point.latitude, point.longitude);

                final UTM2LatLong LatLong = new UTM2LatLong();
                double [] LatLongPoint = LatLong.convertUTMToLatLong(UTMPoint[0], UTMPoint[1]);

                String predioUrl = tool.makeUrl(UTMPoint[0], UTMPoint[1]);

                Log.d("Mario Dice: ","PredioUrl" + predioUrl);

                String userAuth = tool.makeAuthHeader(user, password);

                UserPredio predio = retrofit.create(UserPredio.class);
                Call<List<Predio>> call = predio.getPredio(predioUrl, userAuth);

                call.enqueue(new Callback<List<Predio>>() {
                    @Override
                    public void onResponse(Call<List<Predio>> call, Response<List<Predio>> response) {
                        switch (response.code()) {
                            case 200:
                                ArrayList<Predio> predioList = (ArrayList<Predio>) response.body();
                                String [] poligono = tool.parsePoligono(predioList.get(0).getGeom());

                                PolygonOptions rectOptions = new PolygonOptions()
                                        .zIndex(7.0f)
                                        .fillColor(0x33FF0000)
                                        .strokeColor(Color.RED)
                                        .strokeWidth(3.0f)
                                        .clickable(true);

                                for (int i = 0; i < poligono.length; i++) {

                                    String [] poligonoArray = poligono[i].split(" ");
                                    double [] poligonoDouble = {Double.parseDouble(poligonoArray[0]), Double.parseDouble(poligonoArray[1])};

                                    poligonoDouble = LatLong.convertUTMToLatLong(poligonoDouble[0], poligonoDouble[1]);
                                    Log.d("Mario Dice: ","poligono latlong"+String.valueOf(poligonoDouble[0])+","+ String.valueOf(poligonoDouble[1]));

                                    rectOptions.add(new LatLng(poligonoDouble[0],poligonoDouble[1]));

                                }

                                mMap.addPolygon(rectOptions);

                                break;
                            case 401:
                                Toast.makeText(MapsActivity.this, "401: Not ", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                break;
                        }
                    }
                    @Override
                    public void onFailure(Call<List<Predio>> call, Throwable t) {
//                        Log.e("--fail--", t.getMessage());
                        String poly = "SRID=32717;MULTIPOLYGON (((720329.4800000004 9675422.51, 720342.1500000004 9675420.85, 720350.25 9675420.85, 720360.4299999997 9675423.34, 720369.9800000004 9675426.66, 720378.7000000002 9675430.82, 720384.3099999996 9675434.97, 720387.8399999999 9675439.75, 720396.5599999996 9675442.24, 720405.0300000003 9675453.79, 720412.1100000003 9675445.07, 720421.9299999997 9675439.15, 720428.7599999998 9675436, 720437.5300000003 9675434.27, 720444.5 9675433.16, 720433.6100000003 9675407.91, 720429.1200000001 9675379.32, 720426.6200000001 9675342.44, 720426.1500000004 9675326.15, 720426.1500000004 9675318.15, 720423.46 9675308.33, 720421.9100000001 9675296.52, 720401.4900000002 9675237.34, 720382.8200000003 9675196.68, 720371.5599999996 9675174.15, 720374.9299999997 9675154.3, 720373.1699999999 9675147.22, 720372.8300000001 9675144.45, 720375.21 9675132.74, 720376.3799999999 9675126.93, 720378.1900000004 9675114.78, 720380.7300000004 9675097.76, 720383.7300000004 9675080.9, 720384.25 9675080.9, 720372.46 9675027.06, 720372.0300000003 9675025.08, 720312.0999999996 9675071.37, 720288.5499999998 9675103.67, 720272.9500000002 9675182.81, 720241.46 9675204.02, 720217.3700000001 9675213.37, 720201.0300000003 9675246.81, 720174.5 9675278.68, 720156.9100000001 9675302.51, 720134.3200000003 9675327.93, 720092.3700000001 9675256.94, 720080.0700000003 9675261.3, 720062.0300000003 9675266.32, 720041.4800000004 9675270.15, 720019.3499999996 9675277.7, 720003.25 9675285.16, 720133.75 9675516.49, 720159.6799999997 9675562.46, 720210.8300000001 9675534.97, 720204.8499999996 9675487.6, 720223.79 9675479.62, 720245.7999999998 9675471.1, 720261.5800000001 9675462.59, 720276.7400000002 9675458.85, 720284.8399999999 9675452.62, 720290.4500000002 9675446.6, 720306.0199999996 9675434.97, 720319.9299999997 9675426.46, 720329.4800000004 9675422.51)))";
                        String [] poligono = tool.parsePoligono(poly);

                        PolygonOptions rectOptions = new PolygonOptions()
                                .zIndex(7.0f)
                                .fillColor(0x33FF0000)
                                .strokeColor(Color.RED)
                                .strokeWidth(3.0f)
                                .clickable(true);


                        for (int i = 0; i < poligono.length; i++) {

                            String [] poligonoArray = poligono[i].split(" ");
                            double [] poligonoDouble = {Double.parseDouble(poligonoArray[0]), Double.parseDouble(poligonoArray[1])};

                            poligonoDouble = LatLong.convertUTMToLatLong(poligonoDouble[0], poligonoDouble[1]);
                            Log.d("Mario Dice: ","poligono latlong"+String.valueOf(poligonoDouble[0])+","+ String.valueOf(poligonoDouble[1]));

                            rectOptions.add(new LatLng(poligonoDouble[0],poligonoDouble[1]));

                        }

                        mMap.addPolygon(rectOptions);

                        Toast.makeText(MapsActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }
                });

            }



        });

        mMap.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() {
            @Override
            public void onPolygonClick(Polygon polygon) {
                Toast.makeText(MapsActivity.this, "Menu Predio", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private WMSProvider[] providers = {
            new WMSProvider()
                    .url("http://ide.cuenca.gob.ec/geoserver/geovisor/wms/")
                    .layers("ortofoto2010"),
            new WMSProvider()
                    .url("http://ide.cuenca.gob.ec/geoserver/geovisor/wms/")
                    .layers("poligonos_rurales"),
            new WMSProvider()
                    .url("http://ide.cuenca.gob.ec/geoserver/geovisor/wms/")
                    .layers("predios_urbanos"),
            new WMSProvider()
                    .url("http://ide.cuenca.gob.ec/geoserver/geovisor/wms/")
                    .layers("manzanas"),
            new WMSProvider()
                    .url("http://ide.cuenca.gob.ec/geoserver/geovisor/wms/")
                    .layers("predios_sinat"),
            new WMSProvider()
                    .url("http://192.168.20.37/sinat_cantonal_wms/map/predial_completo")
                    .layers("poligonos,predios")
                    .crs("EPSG:32717")
                    .styles("poligonos_pol,predios_pol")
    };
}

