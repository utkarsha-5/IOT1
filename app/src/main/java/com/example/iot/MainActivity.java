package com.example.iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.buttonprofile);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprofile();
            }
        });
        b5=findViewById(R.id.buttonplan);
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      openplan();
                                  }
                              }
        );
        b2=findViewById(R.id.buttonBooking);
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      openbooking();
                                  }
                              }
        );
        b3=findViewById(R.id.buttonfindhouse);
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      openhouse();
                                  }
                              }
        );
        b4=findViewById(R.id.buttonsupport);
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      opensupport();
                                  }
                              }
        );
        b6=findViewById(R.id.buttondevelopers);
        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      opendevelopers();
                                  }
                              }
        );
    }
    public void openprofile()
    {
        Intent intent=new Intent(this,PROFILE.class);
        startActivity(intent);
    }
    public void openplan()
    {
        Intent intent=new Intent(this,PLAN.class);
        startActivity(intent);
    }
    public void openbooking()
    {
        Intent intent=new Intent(this,BOOKING.class);
        startActivity(intent);
    }
    public void openhouse()
    {
        Intent intent=new Intent(this,FIND_HOME.class);
        startActivity(intent);

    }
    public void opensupport()
    {
        Intent intent=new Intent(this,SUPPORT.class);
        startActivity(intent);
    }
    public void opendevelopers()
    {
        Intent intent=new Intent(this,DEVELOPERS.class);
        startActivity(intent);
    }

}