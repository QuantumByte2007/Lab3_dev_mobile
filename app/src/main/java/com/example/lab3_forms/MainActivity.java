package com.example.lab3_forms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//references


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name;

    EditText email;
    EditText phone;
    EditText address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        name = findViewById(R.id.name);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),MainActivity2.class);
                String str = name.getText().toString();
                String ph = phone.getText().toString();
                String em = email.getText().toString();
                String add = address.getText().toString();
                intent.putExtra("name",str);
                intent.putExtra("phone",ph);
                intent.putExtra("email",em);
                intent.putExtra("address",add);
                startActivity(intent);

            }
        });







    }
}