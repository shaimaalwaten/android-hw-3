package com.example.supercv;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.dynamic.IFragmentWrapper;

public class Major extends AppCompatActivity {
    ImageView imageView;
    Button button;

    private static final int IMAGE_PICK_CODE =1000;
    private static final int PERMISSION_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
         Button as = findViewById(R.id.button);
         ImageView ae = findViewById(R.id.imageView);
        final EditText s = findViewById(R.id.a);
        final EditText sha = findViewById(R.id.e);
        final EditText sa = findViewById(R.id.se);
        final EditText z = findViewById(R.id.c);
        Button two = findViewById(R.id.button2);

        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent ;
                                       intent=new Intent(Major. this ,Print.class);
                                       intent.putExtra("name",s.getText().toString());
                                       intent.putExtra("namew", sha.getText().toString());
                                       intent.putExtra("a", sa.getText().toString());
                                       intent.putExtra("x", z.getText().toString());
                                       startActivity(intent);

                                   }
                               });

                as.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                                    == PackageManager.PERMISSION_DENIED) {
                                String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                                requestPermissions(permissions, PERMISSION_CODE);
                            } else {
                                pickImageFromGallery();
                            }
                        } else {
                            pickImageFromGallery();
                        }
                    }
                });


    }

    private void pickImageFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/^");
        startActivityForResult(intent, IMAGE_PICK_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_CODE:{
                if (grantResults.length > 0 && grantResults [0] ==
                        PackageManager.PERMISSION_GRANTED){
                    pickImageFromGallery();
                }
                else  {
                    Toast.makeText(this, "Canceld!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE){
            imageView.setImageURI(data.getData());
        }
    }
}