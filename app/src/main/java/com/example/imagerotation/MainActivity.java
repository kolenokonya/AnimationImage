package com.example.imagerotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
    }


    public void GoLeft(View view) {
        final Animation left = AnimationUtils.loadAnimation(
                this, R.anim.rotateleft);
        img.startAnimation(left);
    }

    public void GoRight(View view) {
        final Animation right = AnimationUtils.loadAnimation(
                this, R.anim.rotateright);
        img.startAnimation(right);

    }

    public void Hide(View view) {
        final Animation hide = AnimationUtils.loadAnimation(
                this, R.anim.alphahide);
        img.startAnimation(hide);

    }

    public void appear(View view) {
        final Animation appear = AnimationUtils.loadAnimation(
                this, R.anim.alpha);
        img.startAnimation(appear);
    }
}