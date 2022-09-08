package com.ozozzz.wdtl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Englsh extends AppCompatActivity {
    private Button Lett;
    private Button Nmmm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englsh);
        Lett = (Button)findViewById(R.id.Lett);
        Nmmm = (Button)findViewById(R.id.Nmmm);

        Lett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEglet ();
            }
        });

        Nmmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEgnum ();
            }
        });
    }

    private void openEgnum() {
        Intent intent=new Intent(this,Egnum.class);
        startActivity(intent);
    }

    private void openEglet() {
        Intent intent=new Intent(this,Eglet.class);
        startActivity(intent);
    }
}
