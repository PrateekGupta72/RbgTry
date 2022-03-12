package com.regami.rbgtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.VideoView;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;

public class MainActivity extends AppCompatActivity {
    StyledPlayerView playerView;
    ImageView playBtn, pauseBtn;
    DefaultTimeBar seekBar;
    Context context;

    // player to be attached with video_view
    ExoPlayer player;

    {

        player = new ExoPlayer.Builder(getApplicationContext()).build();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // code for setting up ExoPlayer
        playerView = findViewById(R.id.video_view);
        playBtn = findViewById(R.id.play_btn);
        pauseBtn = findViewById(R.id.pause_btn);
        seekBar = findViewById(R.id.player_seek_bar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
         Uri video= Uri.parse("https://www.youtube.com/watch?v=MdQOXoEMLOs&t=178s");
playerView.setPlayer(player);
        MediaItem mediaItem=MediaItem.fromUri(video);
        player.setMediaItem(mediaItem);
        player.prepare();
        player.play();
//        LoadControl loadControl=new DefaultLoadControl();
//
//        BandwidthMeter bandwidthMeter= new DefaultBandwidthMeter();
//        TrackSelector trackSelector=new DefaultTrackSelector();

    }
}