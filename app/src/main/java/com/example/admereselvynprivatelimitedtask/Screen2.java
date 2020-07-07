package com.example.admereselvynprivatelimitedtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        Button gets = (Button) findViewById(R.id.gets);
        Button alrm = (Button) findViewById(R.id.alrm);
        Button cnwl = (Button) findViewById(R.id.cnwl);

        gets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(Screen2.this,LoginScreen.class);
                Screen2.this.startActivity(mainIntent);
                Screen2.this.finish();
            }
        });
        alrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(Screen2.this,LoginScreen.class);
                Screen2.this.startActivity(mainIntent);
                Screen2.this.finish();
            }
        });
        cnwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "TButton has no Functions",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
    }
}
