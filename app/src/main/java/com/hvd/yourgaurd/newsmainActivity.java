package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class newsmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsmain);
    }
    public void onNews(View view){
        if (view.getId()==R.id.livenewsId){
            Intent intent = new Intent(newsmainActivity.this,livenewsActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.trackerId){
            Intent intent = new Intent(newsmainActivity.this,trackerrActivity.class);
            startActivity(intent);
        }

    }
}