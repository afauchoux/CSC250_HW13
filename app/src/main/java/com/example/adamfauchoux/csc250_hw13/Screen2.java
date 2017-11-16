package com.example.adamfauchoux.csc250_hw13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Screen2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen2);
        System.out.println(Core.myName);
    }
}
