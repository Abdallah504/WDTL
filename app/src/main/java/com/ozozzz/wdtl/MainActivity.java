package com.ozozzz.wdtl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button1;
private Button button2;
private Button button3;
private  Button Trak;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        Trak = (Button)findViewById(R.id.Trak);






        Trak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTracking ();
            }
        });





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTextToSpeech();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpeechToText();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLearnSignLanguage();
            }
        });


    }



    private void openTracking() {
        Intent intent = new Intent(this,Tracking.class);
        startActivity(intent);
    }


    private void openLearnSignLanguage() {
        Intent intent = new Intent(this,LearnSignLanguage.class);
        startActivity(intent);
    }

    private void openSpeechToText() {
        Intent intent=new Intent(this,SpeechToText.class);
        startActivity(intent);
    }

    private void openTextToSpeech() {
        Intent intent=new Intent(this,TextToSpeech.class);
        startActivity(intent);
    }
}
