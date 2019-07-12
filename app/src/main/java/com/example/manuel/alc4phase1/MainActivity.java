package com.example.manuel.alc4phase1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button about, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about= (Button) findViewById(R.id.aboutButton);
        profile = (Button) findViewById(R.id.profileButton);

        about.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_intent= new  Intent(MainActivity.this, AboutActivity.class);
                startActivity(about_intent);
            }
        });

        profile.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_intent= new  Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(profile_intent);

            }
        });
    }

}
