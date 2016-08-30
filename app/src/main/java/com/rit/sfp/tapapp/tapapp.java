package com.rit.sfp.tapapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tapapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapapp);
    }

    //Toast is a popup window
    //Length_Long makes the toast stay for a while
    public void onButtonTap(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "Ouch!",Toast.LENGTH_LONG);

        //To get the popup to show up
        myToast.show();
    }
}
