package com.naom.alcphase1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.graphics.Paint.UNDERLINE_TEXT_FLAG;

public class MyProfile extends AppCompatActivity {

    private ImageView Image;
    private TextView Name, Track, Country, Email, Contact, Slack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);


        Image = findViewById(R.id.imageView);
        Name = findViewById(R.id.name);
        Track = findViewById(R.id.track);
        Country = findViewById(R.id.country);
        Email = findViewById(R.id.email);
        Contact = findViewById(R.id.contact);
        Slack = findViewById(R.id.slackname);

        Name.setPaintFlags(Name.getPaintFlags() | UNDERLINE_TEXT_FLAG);


    }
}
