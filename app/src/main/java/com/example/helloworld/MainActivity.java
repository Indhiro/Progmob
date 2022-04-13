package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    TextView klikRegis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klikRegis=(TextView)findViewById(R.id.clickRegis);
        klikRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        EditText username =findViewById(R.id.usernameEt);

//        button1 = (Button) findViewById(R.id.clickRegis);
        button = (Button) findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                welcome();
                String name = username.getText().toString();
                Intent intent = new Intent(MainActivity.this,page_wlcm.class);
                intent.putExtra("NAME",name);
                startActivity(intent);
            }
        });
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openRegis();
//            }
//        });
    }

//    public void openRegis(){
//        Intent intent = new Intent(this, RegisterActivity.class);
//        startActivity(intent);
//    }
//
    public void welcome() {
        Intent intent = new Intent(this, page_wlcm.class);

        startActivity(intent);
    }
    }
