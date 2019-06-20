package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        getSupportActionBar().hide();


    }

    public void click (View v){
        Intent intent;
        switch (v.getId()){
            case R.id.signin1:
                intent = new Intent(MainActivity.this,signup.class);
                break;
            case R.id.signin2: // R.id.textView2
                intent = new Intent(this, signup.class);
                break;
        }
       startActivity(intent);

    }
}
