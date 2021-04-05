package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        if (view.getId()==R.id.aboutcorona){
            Intent intent=new Intent(MainActivity.this,aboutActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.boosthomeId){
            Intent intent=new Intent(MainActivity.this,boostimmuneActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.yogahomeId){
            Intent intent = new Intent(MainActivity.this,yogaActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.remedieshomeId){
            Intent intent = new Intent(MainActivity.this,BuyremediesActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.newsId){
            Intent intent = new Intent(MainActivity.this,newsmainActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.facemaskhomeId){
            Intent intent = new Intent(MainActivity.this,maskActivity.class);
            startActivity(intent);
        }


    }
}