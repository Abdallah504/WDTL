package com.ozozzz.wdtl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnSignLanguage extends AppCompatActivity {
   private Button Arrr;
    private Button Ennn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_sign_language);
        Arrr=(Button)findViewById(R.id.Arrr);
        Ennn=(Button)findViewById(R.id.Ennn);


        Arrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArbic();
            }
        });
        Ennn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglsh();
            }
        });
    }

    private void openEnglsh() {
        Intent intent = new Intent(this,Englsh.class);
        startActivity(intent);
    }




    private void openArbic() {
        Intent intent = new Intent(this,Arbic.class);
        startActivity(intent);
    }
}
