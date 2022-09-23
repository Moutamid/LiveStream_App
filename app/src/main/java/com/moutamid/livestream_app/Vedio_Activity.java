package com.moutamid.livestream_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class Vedio_Activity extends AppCompatActivity {

    TextView link;
    GifImageView gif2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);

        VideoView videoView = findViewById(R.id.videoView);
        link = findViewById(R.id.link);
        gif2 = findViewById(R.id.gif2);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            link.setText(bundle.getString("link"));
        }

        String videoUrl = link.getText().toString().trim();
        Uri uri = Uri.parse(videoUrl);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

}