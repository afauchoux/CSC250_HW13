package com.example.adamfauchoux.csc250_hw13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Screen3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen3);
        String theName = this.getIntent().getStringExtra("myName");
        System.out.println(theName);
    }
}
