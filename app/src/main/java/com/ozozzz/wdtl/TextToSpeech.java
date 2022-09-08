package com.ozozzz.wdtl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import java.util.Locale;

public class TextToSpeech extends AppCompatActivity {
private android.speech.tts.TextToSpeech mtts;
private EditText mEditText;
private SeekBar mSeekBarPitch;
private SeekBar mSeekBarSpeed;
private Button mButtonSpeak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        mButtonSpeak=findViewById(R.id.button_speak);
        mtts = new android.speech.tts.TextToSpeech(this, new android.speech.tts.TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == android.speech.tts.TextToSpeech.SUCCESS) {
                    int result = mtts.setLanguage(Locale.ENGLISH);
                    if (result == android.speech.tts.TextToSpeech.LANG_MISSING_DATA || result == android.speech.tts.TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTs", "Language not supported");
                    } else {
                        mButtonSpeak.setEnabled(true);
                    }
                } else {
                    Log.e("TTs", "Initialization failed");
                }
            }

        });


        mEditText=findViewById(R.id.edit_Text);
        mSeekBarPitch=findViewById(R.id.seek_bar_pitch);
        mSeekBarSpeed=findViewById(R.id.seek_bar_speed);

        mButtonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });



    }



    private void speak(){
       String text =mEditText.getText().toString();
        float pitch = (float)mSeekBarPitch.getProgress()/50;
        if(pitch<0.1)pitch = 0.1f;
        float speed=(float) mSeekBarSpeed.getProgress()/50;
        if (speed<0.1)speed=0.1f;

        mtts.setPitch(pitch);
        mtts.setSpeechRate(speed);
        mtts.speak(text, android.speech.tts.TextToSpeech.QUEUE_ADD,null);

    }

    @Override
    protected void onDestroy() {
        if(mtts!=null){
            mtts.stop();
            mtts.shutdown();

        }
        super.onDestroy();
    }
}





