package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class babavidActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babavid);

        webView = findViewById(R.id.babavideoId);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://firebasestorage.googleapis.com/v0/b/myfire-app-8018c.appspot.com/o/ramdevyoga.mp4?alt=media&token=2c0386b3-5240-45b4-ba5c-c43228e8f795");


    }
}