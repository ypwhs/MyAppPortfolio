package com.yangpeiwen.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my " + ((Button)v).getText().toString() + " app.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
