package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yogaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
    }
    public void onClickyoga(View view){
        if (view.getId()==R.id.babavidId){
            Intent intent = new Intent(yogaActivity.this,babavidActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.fittakvidId){
            Intent intent = new Intent(yogaActivity.this,fittakvidActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.sixposeId){
            Intent intent = new Intent(yogaActivity.this,dubaividActivity.class);
            startActivity(intent);
        }

    }
}