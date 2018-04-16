package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SplashScreen2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);
        Button btn_masuk = (Button) findViewById(R.id.btn_masuk);

        btn_masuk.setOnClickListener(this);
    }
        //trebuchet ms, tw cen MT
    @Override
    public void onClick(View v) {
        startActivity(new Intent(SplashScreen2Activity.this,MainActivity.class));
    }
}
