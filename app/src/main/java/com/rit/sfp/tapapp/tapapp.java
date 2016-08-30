package com.rit.sfp.tapapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class tapapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapapp);
    }

    //V2 print a number from an array
    public void onButtonTap(View v){
        Random rnd = new Random();
        int [] myArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int response = myArray[rnd.nextInt(10)];
        StringBuilder myMsg = new StringBuilder();
        myMsg.append("Your secret number is: " + response);
        Toast myToast = Toast.makeText(getApplicationContext(), myMsg, Toast.LENGTH_LONG);
        myToast.show();
    }

}
