package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dubaividActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubaivid);

        webView = findViewById(R.id.dubaivideoId);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://firebasestorage.googleapis.com/v0/b/myfire-app-8018c.appspot.com/o/sixposes.mp4?alt=media&token=bf970d5a-70fc-4f9b-8980-9a2c3746451b");

    }
}