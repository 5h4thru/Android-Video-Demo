package com.yahoo.palagummi.videodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo); // we can use a video from the internet with its full path

        //videoView.start();

        // Media controller to control the playback of the video
        MediaController mediaController = new MediaController(this);
        // attach the controller to the videoView
        mediaController.setAnchorView(videoView); //videoView becomes the anchor view for the mediaController
        videoView.setMediaController(mediaController);
        // that synchs things up both ways


    }
}
