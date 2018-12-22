package com.example.mercury.my_code;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Scroller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);
    }

    public void change_font(View view){
        TextView changeFont = findViewById(R.id.story_textView); // Assign changeFont to be the object referring to the textView in activity_scroller as id "change_font"
        Typeface font = Typeface.createFromAsset(getAssets(), "font/myfont.ttf"); // Assign fonts object to refer to the fonts saved in said file, by specifying relative path
        changeFont.setTypeface(font); // Sets the typeface in the textView to whatever we want.
    }
}


