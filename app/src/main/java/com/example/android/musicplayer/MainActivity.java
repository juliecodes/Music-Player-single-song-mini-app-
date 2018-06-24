package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer = MediaPlayer.create(this, R.raw.double_home);


        Button playButton = (Button) findViewById(R.id.btn_play);
        // Set a click listener on that image
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playButton is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button pauseButton = (Button) findViewById(R.id.btn_pause);
        // Set a click listener on that image
        pauseButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playButton is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause(); // no need to call prepare(); create() does that for you
            }
        });

        Button stopButton = (Button) findViewById(R.id.btn_stop);
        // Set a click listener on that image
        stopButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playButton is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop(); // no need to call prepare(); create() does that for you

            }
        });



    }
}
