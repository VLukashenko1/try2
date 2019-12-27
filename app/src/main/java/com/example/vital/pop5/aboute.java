package com.example.vital.pop5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class aboute extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboute);



        Button button = (Button)findViewById(R.id.nazad);
        button.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
