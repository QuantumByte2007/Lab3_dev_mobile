package com.example.lab3_forms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result = findViewById(R.id.result);
        Intent i = getIntent();
        String str = i.getStringExtra("name");
        String em = i.getStringExtra("email");
        String ph = i.getStringExtra("phone");
        String addr = i.getStringExtra("address");
        result.setText("Nom et Prébom :"+str + "\n" + "Email : " + em +"\n" + "Phone : " + ph + "\n" + "Address : " + addr);



    }
}