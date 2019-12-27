package com.example.vital.pop5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GoogleMap nMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa23);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng park1 = new LatLng(50.133036, 30.662871);
        mMap.addMarker(new MarkerOptions().position(park1).title("Велика стоянка в Обухові"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(park1, 15));

        nMap = googleMap;

        LatLng parkVelmart = new LatLng(50.131019, 30.657405);
        nMap.addMarker(new MarkerOptions().position(parkVelmart).title("Стоянка в Обухові біля супермаркету"));

        LatLng parkSchool = new LatLng(50.131486, 30.651984);
        nMap.addMarker(new MarkerOptions().position(parkSchool).title("Стоянка біля найкращої школи"));
    }
}
