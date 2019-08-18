package com.example.examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this,R.raw.sixth);

        final TextView mnumber,textView;

        mnumber = findViewById(R.id.mnumber);

        textView = findViewById(R.id.done);

        new CountDownTimer(10000,1000){

            public  void onTick(long millisecondsUntilDone){

                mnumber.setText("Time: "+String.valueOf(millisecondsUntilDone/2000));
            }

            public void onFinish(){

                textView.setText("Done.!!!");
                m1.start();

            }

        }.start();

    }
}
