package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView sign_up;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        sign_up= (TextView) findViewById (R.id.sign_up);

        sign_up.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (getApplicationContext (),LogIn.class);
                startActivity (i);
            }
        });






    }
}
