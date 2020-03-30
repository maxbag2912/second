package com.mabo.testblanktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "KLJLKJFKLAJSF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int[] price = new int[]{5,100,20,66,16};
        //price = new int[]{5,99,21,67,16};
        //price = null;
        int discount = 50;
        //discount = -5;
        //discount = 100;
        int offset = 1;
        int readLength = 3;

        int[] arr = new Main().decryptData(price, discount, offset, readLength);
        try {
            for (int i : arr) {
                Log.d(TAG, i + "");
            }
        } catch (NullPointerException e){
            Log.d(TAG, e.toString());
        }
        this.finish();
    }
}
