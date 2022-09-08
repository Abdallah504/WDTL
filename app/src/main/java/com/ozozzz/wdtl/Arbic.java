package com.ozozzz.wdtl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Arbic extends AppCompatActivity {
    private Button Letar;
    private Button Nar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbic);
        Letar=(Button)findViewById(R.id.Letar);
        Nar=(Button)findViewById(R.id.Nar);


        Letar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openARletters ();
            }
        });
       Nar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openARNumbers ();
            }
        });
    }

    private void openARNumbers() {
        Intent intent = new Intent(this,ARNumbers.class);
        startActivity(intent);
    }

    private void openARletters() {
        Intent intent = new Intent(this,ARletters.class);
        startActivity(intent);
    }

}

