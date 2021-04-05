package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class livenewsActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livenews);

        webView = findViewById(R.id.webview_livenews);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.bbc.com/news");
    }

}