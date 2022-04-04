package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class temp extends AppCompatActivity {


    TextView name_txt;
    ImageView one_img,two_img,three_img,four_img,five_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        binding();

        one_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(temp.this,one_temp.class);
                startActivity(intent);

            }
        });
        two_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(temp.this,two_temp.class);
                startActivity(intent);

            }
        });
        three_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(temp.this,three_temp.class);
                startActivity(intent);

            }
        });
        four_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(temp.this,four_temp.class);
                startActivity(intent);

            }
        });
    }

    private void binding() {

        one_img = findViewById(R.id.one_img);
        two_img = findViewById(R.id.two_img);
        three_img = findViewById(R.id.three_img);
        four_img = findViewById(R.id.four_img);

    }
}