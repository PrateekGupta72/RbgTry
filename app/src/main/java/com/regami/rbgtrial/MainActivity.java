package com.regami.rbgtrial;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.DefaultTimeBar;

public class MainActivity extends AppCompatActivity {

    ImageView playBtn, pauseBtn;
    DefaultTimeBar seekBar;
    Context context;

    // player to be attached with video_view

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ExoPlayer player= new ExoPlayer.Builder(this).build();
        // code for setting up ExoPlayer
            StyledPlayerView playerView;
        playerView = findViewById(R.id.video_view);
        playBtn = findViewById(R.id.play_btn);
        pauseBtn = findViewById(R.id.pause_btn);
        seekBar=findViewById(R.id.exo_progress);
       playerView.setPlayer(player);
   //     getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
      //   Uri video= Uri.parse("https://www.youtube.com/watch?v=MdQOXoEMLOs&t=178s");
playerView.setPlayer(player);
        MediaItem mediaItem=MediaItem.fromUri("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
        player.addMediaItem(mediaItem);
        player.prepare();
  playBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          player.setPlayWhenReady(true);
playBtn.setVisibility(View.GONE);
pauseBtn.setVisibility(View.VISIBLE);
      }
  });
            pauseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    player.setPlayWhenReady(false);
                    pauseBtn.setVisibility(View.GONE);
                    playBtn.setVisibility(View.VISIBLE);

                }
            });
        player.play();
//        LoadControl loadControl=new DefaultLoadControl();
//
//        BandwidthMeter bandwidthMeter= new DefaultBandwidthMeter();
//        TrackSelector trackSelector=new DefaultTrackSelector();

    }
}