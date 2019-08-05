package com.naom.alcphase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Welcome;
    private Button About;
    private Button MyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Welcome = findViewById(R.id.welcome);
        About = findViewById(R.id.about);
        MyProfile = findViewById(R.id.myprofile);

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity.this, AboutALC.class);
                startActivity(x);

            }
        });

        MyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(MainActivity.this, MyProfile.class);
                startActivity(y);
            }
        });
    }
}
