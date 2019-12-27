package com.example.vital.pop5;

import android.content.Intent;
import android.os.Bundle;

import com.example.vital.pop5.ui.login.LoginActivity;
import com.example.vital.pop5.ui.login.LoginViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
Button button;
Button button2;
Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent2 = new Intent(MainActivity.this, MapsActivity.class);
                Snackbar.make(view, "Буде відкрито карту", Snackbar.LENGTH_LONG).setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(intent2);
                    }
                }).show();
            }
        });
        button = (Button)findViewById(R.id.obuh);
        button2 = (Button) findViewById(R.id.kuiv);
        button3 = (Button) findViewById(R.id.reg);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.abus) {
            Intent intent = new Intent (this, aboute.class);
            startActivity(intent);
        }
        if (id == R.id.action_settings){
            Intent intent = new Intent(this, setting.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.obuh:
            Intent intent = new Intent (this, MapsActivity.class);
            startActivity(intent);
            break;
            case R.id.kuiv:
            Intent intent2 = new Intent (this, Kuiv.class);
            startActivity(intent2);
            break;
            case R.id.reg:
                Intent intent3 = new Intent (this, LoginActivity.class);
                startActivity(intent3);
            default: return;
        }
    }

}
