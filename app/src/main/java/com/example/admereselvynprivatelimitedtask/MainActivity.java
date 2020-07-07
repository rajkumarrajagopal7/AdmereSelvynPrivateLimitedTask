package com.example.admereselvynprivatelimitedtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NextActivity();
    }
    public void NextActivity()
    {
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                Intent mainIntent = new Intent(MainActivity.this,Screen2.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, 1000);

    }
}
