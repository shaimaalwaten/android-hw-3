package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Apply extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        Button a = findViewById(R.id.happy);
        Button b = findViewById(R.id.happy2);
        Button c = findViewById(R.id.happy3);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sw = new Intent(Apply.this, Major.class);
                startActivity(sw);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Open = new Intent(Apply.this, Major.class);
                startActivity(Open);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa = new Intent(Apply.this, Major.class);
                startActivity(sa);
            }
        });

    }
}