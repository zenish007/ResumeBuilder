package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button create_btn,view_btn,download_btn,feedback_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        create_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Create Resume", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Data.class);
                startActivity(intent);
            }
        });

        view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "View Resume", Toast.LENGTH_SHORT).show();

            }
        });

        download_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Downloading...", Toast.LENGTH_SHORT).show();

            }
        });

        feedback_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Thanks For Feedback.", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void binding() {

        create_btn = findViewById(R.id.create_btn);
        view_btn = findViewById(R.id.view_btn);
        download_btn = findViewById(R.id.download_btn);
        feedback_btn = findViewById(R.id.feedback_btn);

    }
}