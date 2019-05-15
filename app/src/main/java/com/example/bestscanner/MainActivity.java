package com.example.bestscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (OpenCVLoader.initDebug()) {
            Toast.makeText(getApplicationContext(), "OPENCV Init success", Toast.LENGTH_SHORT);
        }
        else {
            Toast.makeText(getApplicationContext(), "OPENCV Init failed", Toast.LENGTH_SHORT);
        }
    }
}
