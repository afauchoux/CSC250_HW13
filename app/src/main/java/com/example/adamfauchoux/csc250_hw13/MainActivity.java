package com.example.adamfauchoux.csc250_hw13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button page2Button;
    private Button page3Button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.page2Button = (Button)this.findViewById(R.id.page2Button);
        this.page3Button = (Button)this.findViewById(R.id.page3Button);
    }

    public void onNextPageButtonPressed(View v)
    {
        if(v == this.page2Button)
        {
            Intent i = new Intent(this, Screen2.class);
            Core.myName = "Adam";
            this.startActivity(i);
        }
        else if(v == this.page3Button)
        {
            Intent i = new Intent(this, Screen3.class);
            i.putExtra("myName", "Adam");
            this.startActivity(i);
        }
    }

}
