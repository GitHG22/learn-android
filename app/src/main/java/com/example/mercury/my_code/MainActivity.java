package com.example.mercury.my_code;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("MainActivity", "HelloWorld");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void sayHello(View v){
       Button button = findViewById(R.id.button_scroller);
       Intent scroller = new Intent(this, Scroller.class);
       button.setText(R.string.button_scroller_change);
       Toast.makeText(this, "Magic!", Toast.LENGTH_LONG).show();
       startActivity(scroller);
    }

    protected void showCounter(View view){
        Intent counter = new Intent(this, counter.class);
        startActivity(counter);

    }

}
