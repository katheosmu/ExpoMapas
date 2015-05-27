package mainactivity.katherineosorio.com.expomapas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends ActionBarActivity {

    private GoogleMap map;
    private CameraUpdate cameraUpdate;

    private final LatLng LOCATION_HOME = new LatLng(6.205662, -75.588472);
    private final LatLng LOCATION_UDEA = new LatLng(6.304909, -75.566285);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map =((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
        map.addMarker(new MarkerOptions().position(LOCATION_HOME).title("My Home").snippet("Carrera 44 # 4 sur 35").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.addMarker(new MarkerOptions().position(LOCATION_UDEA).title("Universit of Antoquia").snippet("Calle 67 # 53-108"));
    }

    public void onClickHome(View view){
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(LOCATION_HOME,16);
        map.animateCamera(cameraUpdate);
    }

    public void onClickU(View view){
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(LOCATION_UDEA,16);
        map.animateCamera(cameraUpdate);
    }


}
