package com.example.todaywearapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView mTextView = (TextView)  findViewById(R.id.txtDate);
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d - yyyy");
        mTextView.setText("Today is "+ dateFormat.format(today));

    }
}