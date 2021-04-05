package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fittakvidActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fittakvid);

        webView = findViewById(R.id.fittakvideoId);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://firebasestorage.googleapis.com/v0/b/myfire-app-8018c.appspot.com/o/fittak.mp4?alt=media&token=2d308c77-7336-4bfb-9264-018817d851fd");


    }
}