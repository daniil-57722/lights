package com.example.lights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    public LinearLayoutCompat layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
    }
    public void bgred(View view){
        int color = Color.RED;
        layout.setBackgroundColor(color);
    }
    public void bgyellow(View view){
        int color = Color.YELLOW;
        layout.setBackgroundColor(color);
    }
    public void bggreen(View view){
        int color = Color.GREEN;
        layout.setBackgroundColor(color);
    }
}