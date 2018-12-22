package com.example.mercury.my_code;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class counter extends AppCompatActivity {

    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        showCount = (TextView) findViewById(R.id.counter_text);
    }

    public void increment(View view){
        count++;
        showCount.setText(Integer.toString(count));
    }

    public void decrement(View view) {
        if(count>0){
            count--;
            showCount.setText(Integer.toString(count));
        }
        else {
            Toast.makeText(this, "Counter cannot be negative", Toast.LENGTH_SHORT).show();
        }
    }
}
