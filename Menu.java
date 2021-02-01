package com.example.indonesiasehat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button pkt = (Button) findViewById(R.id.button3);
        Button prfl = (Button) findViewById(R.id.button);
        Button pls = (Button) findViewById(R.id.button2);
        Button out = (Button) findViewById(R.id.button4);
        pkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(com.example.indonesiasehat.Menu.this, com.example.indonesiasehat.Paket.class);
                startActivity(inte);

            }
        });
        prfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(com.example.indonesiasehat.Menu.this, com.example.indonesiasehat.Profile.class);
                startActivity(inte);

            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(com.example.indonesiasehat.Menu.this, com.example.indonesiasehat.Login.class);
                startActivity(inte);

            }
        });


    }
}