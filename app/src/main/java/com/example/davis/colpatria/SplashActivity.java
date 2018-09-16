package com.example.davis.colpatria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("user", "Oscar");
        i.putExtra("puntos", "13320");
        startActivity(i);
        finish();
    }
}
