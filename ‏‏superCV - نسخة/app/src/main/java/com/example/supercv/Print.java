package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Print extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        TextView a = findViewById(R.id.textView17);
        TextView b = findViewById(R.id.textView18);
        TextView c = findViewById(R.id.textView19);
        TextView d = findViewById(R.id.textView20);
        Button saa = findViewById(R.id.button7);
        Button sd = findViewById(R.id.button6);
        Bundle air = getIntent().getExtras();
        String saw = air.getString("name");
        a.setText(saw);
        String sw = air.getString("namew");
        b.setText(sw);
        String za = air.getString("a");
        c.setText(za);
        String ce = air.getString("x");
        d.setText(ce);
sd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent cf = new Intent(Print.this , its_me.class);
        startActivity(cf);
    }
});
        saa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xx = new Intent(Print.this , Major.class);
                startActivity(xx);
            }
        });

    }
}