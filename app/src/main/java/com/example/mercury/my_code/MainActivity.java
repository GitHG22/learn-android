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

/*    public MainActivity activity;

    @Override
    public void onAttach(Activity activity){
        this.activity = activity;
    }*/



    public void sayHello(View v){
       Button thebutton = findViewById(R.id.first_button);
       Intent scroller = new Intent(this, Scroller.class);
       thebutton.setText(R.string.first_button_change);
       Toast.makeText(this, "Magic!", Toast.LENGTH_LONG).show();
       startActivity(scroller);
    }

}
