package com.example.admereselvynprivatelimitedtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Button mobile=(Button) findViewById(R.id.mobile);
        Button facebook=(Button) findViewById(R.id.facebook);
        Button google=(Button) findViewById(R.id.google);
        Button mail=(Button) findViewById(R.id.mail);
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginScreen.this,Login.class);
                LoginScreen.this.startActivity(i);
                LoginScreen.this.finish();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "TButton has no Functions",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "TButton has no Functions",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
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
