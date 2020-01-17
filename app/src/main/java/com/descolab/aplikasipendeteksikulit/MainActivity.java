package com.descolab.aplikasipendeteksikulit;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        Button btnUpload = findViewById(R.id.btnUpload);
        Button btnProses = findViewById(R.id.btnProses);

        ImageProcessing();

    }

    private void ImageProcessing() {
        // TODO: 1s/01/2020 Berisikan rumus-rumus
    }
}
