package com.example.codered;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddNewField extends AppCompatActivity {

    Button CompleteAddField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_field);
        CompleteAddField = findViewById(R.id.Finesh_button);

        CompleteAddField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomePage.class);
                startActivity(i);

            }
        })
        ;}}