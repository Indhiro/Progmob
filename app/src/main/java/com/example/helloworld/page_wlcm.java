package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page_wlcm extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_wlcm);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        TextView tampilName = findViewById(R.id.tampil);
        tampilName.setText("Welcome " + name);

//        button = (Button) findViewById(R.id.btnBack);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                back();
//            }
//        });

    }

//    public void back(){
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
}