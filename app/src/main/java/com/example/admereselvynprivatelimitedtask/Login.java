package com.example.admereselvynprivatelimitedtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Login extends AppCompatActivity{
    private static final String id= "status";
    private static final String TAG = "MyActivity";
    private Button login;
    private EditText mobileinput,passwordinput;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mobileinput = (EditText) findViewById(R.id.mobileinput);
        passwordinput = (EditText) findViewById(R.id.passwordinput);
        login = (Button) findViewById(R.id.button);
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postdata();
            }
        });
    }

       public void postdata()
        {
            RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

            final JSONObject object = new JSONObject();
            try {
                //input your API parameters//
                String input1=mobileinput.getText().toString();
                String input2=passwordinput.getText().toString();
                object.put("mobile",input1);
                object.put("password",input2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            // Enter the correct url for your api service site
            String url = "https://mekvahan.com/api/android_intern_task";
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, object,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            String r=response.toString();
                            try {
                                JSONObject n=new JSONObject(r);
                                String a=n.getString("status");
                                if(a.contains("true"))
                                {
                                    Toast toast = Toast.makeText(getApplicationContext(),
                                            "SuccessfullyLogged In",
                                            Toast.LENGTH_SHORT);
                                    toast.show();
                                }
                                else{
                                    Toast toast = Toast.makeText(getApplicationContext(),
                                            r,
                                            Toast.LENGTH_SHORT);
                                    toast.show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
            requestQueue.add(jsonObjectRequest);
        }
    }
