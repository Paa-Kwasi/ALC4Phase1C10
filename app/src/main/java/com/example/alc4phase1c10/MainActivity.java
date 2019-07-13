package com.example.alc4phase1c10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAbout(View view) {
        Intent intent = new  Intent(this, AboutALC.class);
        startActivity(intent);
    }

    public void openProfile(View view) {

        Intent intent = new  Intent(this, Profile.class);
        startActivity(intent);
    }
}
