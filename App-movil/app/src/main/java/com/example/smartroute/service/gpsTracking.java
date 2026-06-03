package com.example.smartroute.service;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.Priority;

public class gpsTracking extends Service {
    private static final String TAG = "gpsTracking";
    private FusedLocationProviderClient fusedLocationClient;
    private LocationCallback locationCallback;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "Service created");

        fusedLocationClient =LocationServices.getFusedLocationProviderClient(this);

        // Configurar como queremos recibi las ubicaciones

        LocationRequest locationRequest = new
                LocationRequest.Builder(Priority.PRIORITY_HIGH_ACCURACY,1000)
                .setMinUpdateIntervalMillis(500).build();

        locationCallback = new LocationCallback(){

            @Override
            public void onLocationResult(LocationResult locationResult) {
                if(locationResult == null){
                    return;
                }
                for (Location location : locationResult.getLocations()){
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    float accuracy = location.getAccuracy();

                    Log.d(TAG, "Location update: " + location.getLatitude() + ", " + location.getLongitude() + " (precisión: " + accuracy + "m)");
                    // Aqui puedes enviar la ubicacion al backend o hacer lo que necesites

                }
            }
        };

    }

}
