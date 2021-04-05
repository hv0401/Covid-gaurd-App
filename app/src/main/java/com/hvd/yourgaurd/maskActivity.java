package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mask);
    }
    public void onMask(View view){
        if (view.getId()==R.id.facemaskkId){
            Intent intent = new Intent(maskActivity.this,maskvidActivity.class);
            startActivity(intent);
        }
    }
}