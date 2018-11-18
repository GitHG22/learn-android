package com.example.mercury.my_code;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity", "HelloWorld");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    System.out.println("hey");
}
