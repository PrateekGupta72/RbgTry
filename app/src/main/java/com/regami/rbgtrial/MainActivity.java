package com.regami.rbgtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView rbg= findViewById(R.id.RbgVideo);
        rbg.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=d-iwHP7vMd8&list=PLu0W_9lII9aiL0kysYlfSOUgY5rNlOhUd&index=10"));
        rbg.start();
    }
}