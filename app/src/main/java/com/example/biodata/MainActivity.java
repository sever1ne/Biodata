package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mapsDirection;
    Button emailDirection;
    Button phoneDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapsDirection = findViewById(R.id.tbl_alamat);
        emailDirection = findViewById(R.id.tbl_email);
        phoneDirection = findViewById(R.id.tbl_telepon);
    }

    public void MapsIntent(View view) {
        Uri mapsUri;
        mapsUri = Uri.parse("https://goo.gl/maps/3XTqjZdrpJrm7Tr78");
        Intent mapsIntent = new Intent(Intent.ACTION_VIEW, mapsUri);
        startActivity(mapsIntent);
    }

    public void emailIntent(View view) {
        Uri emailUri = Uri.parse("111202012599@mhs.dinus.ac.id");
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + emailUri));
        startActivity(emailIntent);
    }

    public void teleponIntent(View view) {
        String phoneNumber = "082358215937";
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(phoneIntent);
    }
}