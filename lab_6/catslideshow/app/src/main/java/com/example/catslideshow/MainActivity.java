package com.example.catslideshow;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView catImageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views from layout
        catImageView = findViewById(R.id.catImageView);
        progressBar = findViewById(R.id.progressBar);

        // Start frame animation
        catImageView.setBackgroundResource(R.drawable.frame_animation);
        AnimationDrawable animationDrawable = (AnimationDrawable) catImageView.getBackground();
        animationDrawable.start();

        // Start AsyncTask to fetch and display cat images
        new CatImages(catImageView, progressBar).execute();
    }

    private class CatImages {
        public CatImages(ImageView catImageView, ProgressBar progressBar) {
        }

        public void execute() {
        }
    }
}
