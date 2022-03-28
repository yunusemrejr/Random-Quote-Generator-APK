package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView txt;
Button btn;
String[] quoteArray = new String[] {"\n" +
        "“Be yourself; everyone else is already taken.”\n" +
        "― Oscar Wilde","“Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.”\n" +
        "― Albert Einstein","“So many books, so little time.”\n" +
        "― Frank Zappa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.textViewYEV);
        btn=(Button) findViewById(R.id.buttonYEV);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Random generator = new Random();
                int randomQuote = generator.nextInt(quoteArray.length);
                txt.setText(quoteArray[randomQuote]);

            }

        });
    }
}