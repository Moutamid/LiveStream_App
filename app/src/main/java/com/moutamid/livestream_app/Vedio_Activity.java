package com.moutamid.livestream_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import pl.droidsonroids.gif.GifImageView;

public class Vedio_Activity extends AppCompatActivity {

    TextView link;
    TextView name;
    GifImageView gif2;
    ImageView play , pause , forward , backward;
    ImageView inc_brightness;
    ImageView dec_brightness;
    RelativeLayout layout_options;
    VideoView videoView;

    Handler handler = new Handler();
    Runnable runnable;

    SeekBar seekBar;

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);

        videoView = findViewById(R.id.videoView);
        link = findViewById(R.id.link);
        name = findViewById(R.id.name);
        gif2 = findViewById(R.id.gif2);

        play = findViewById(R.id.btn_play);
        pause = findViewById(R.id.btn_pause);
        forward = findViewById(R.id.btn_next);
        backward = findViewById(R.id.btn_back);
        inc_brightness = findViewById(R.id.inc_brightness);
        dec_brightness = findViewById(R.id.dec_brightness);

        layout_options = findViewById(R.id.layout_options);
        layout_options.setVisibility(View.VISIBLE);

        myHandler();
        pause.setVisibility(View.VISIBLE);

        seekBar = findViewById(R.id.seek_bar);
        //playerPosition = findViewById(R.id.player_positiom);
        //playerDuration = findViewById(R.id.player_duration);

        runnable = new Runnable() {
            @Override
            public void run() {
                seekBar.setProgress(videoView.getCurrentPosition());
                handler.postDelayed(this::run , 500);
            }
        };

        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_options.setVisibility(View.VISIBLE);
                myHandler();
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            link.setText(bundle.getString("link"));
            name.setText(bundle.getString("name"));
        }

        ConnectivityManager conMgr = (ConnectivityManager) getSystemService (Context.CONNECTIVITY_SERVICE);
        // ARE WE CONNECTED TO THE NET
        if (conMgr.getActiveNetworkInfo() != null
                && conMgr.getActiveNetworkInfo().isAvailable()
                && conMgr.getActiveNetworkInfo().isConnected()) {
            playVedio();
        } else {
            Toast.makeText(Vedio_Activity.this, "Internet is not available...", Toast.LENGTH_SHORT).show();
        }

        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);

        inc_brightness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            }
        });

        dec_brightness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause.setVisibility(View.VISIBLE);
                play.setVisibility(View.GONE);
                videoView.start();
                myHandler();
            }
        });

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.GONE);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.GONE);
                if (videoView.isPlaying()) {
                    videoView.pause();
                    handler.removeCallbacks(runnable);
                    layout_options.setVisibility(View.VISIBLE);
                } else {

                }
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (videoView != null) {
                    int currentPosition = videoView.getCurrentPosition();
                    int seekForwardTime = 10 * 1000;
                    if (currentPosition + seekForwardTime <= videoView.getDuration()) {
                        videoView.seekTo(currentPosition + seekForwardTime);
                    } else {
                        videoView.seekTo(videoView.getDuration());
                    }
                }
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (videoView != null) {
                    int currentPosition = videoView.getCurrentPosition();
                    int seekBackwardTime = 10 * 1000;
                    if (currentPosition - seekBackwardTime >= 0) {
                        videoView.seekTo(currentPosition - seekBackwardTime);
                    } else {
                        videoView.seekTo(0);
                    }
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Vedio_Activity.this, "You Cannot Seek in Live Streaming", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void playVedio() {
        String videoUrl = link.getText().toString().trim();
        Uri uri = Uri.parse(videoUrl);
        videoView.setVideoURI(uri);
        videoView.start();
    }

    private void myHandler() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                layout_options.setVisibility(View.GONE);
            }
        },SPLASH_TIME_OUT);
    }
}
