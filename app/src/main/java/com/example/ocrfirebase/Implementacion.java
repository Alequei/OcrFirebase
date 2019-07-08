package com.example.ocrfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Implementacion extends AppCompatActivity {
    Button escaner,ocr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implementacion);
        escaner=(Button)findViewById(R.id.escaner);
        ocr=(Button)findViewById(R.id.ocr);

        escaner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                intent = new Intent(getApplicationContext(),Barras.class);

                startActivity(intent);
            }
        });
        ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                intent = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
