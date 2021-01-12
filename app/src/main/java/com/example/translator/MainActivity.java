package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers1=(TextView)findViewById(R.id.numbers);
        TextView family1=(TextView)findViewById(R.id.family);
        TextView colors1=(TextView)findViewById(R.id.colors);
        TextView phrases1=(TextView)findViewById(R.id.phrases);
        numbers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });

        family1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
            }
        });

        colors1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });
        phrases1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });
    }



}