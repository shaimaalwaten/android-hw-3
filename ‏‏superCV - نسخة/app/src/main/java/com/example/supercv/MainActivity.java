package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Co = findViewById(R.id.button5);
        Button abo = findViewById(R.id.button4);
        Button app = findViewById(R.id.button3);

        Co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Open = new Intent(MainActivity.this, Contact.class);
                startActivity(Open);
            }
        });
        abo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab = new Intent(MainActivity.this, AboutUs.class);
                startActivity(ab);
            }
        });
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asb = new Intent(MainActivity.this, Apply.class);
                startActivity(asb);

            }
        });
    }
}