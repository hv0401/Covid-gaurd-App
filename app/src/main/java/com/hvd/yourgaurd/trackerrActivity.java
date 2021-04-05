package com.hvd.yourgaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class trackerrActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackerr);

        webView = findViewById(R.id.coronatrackerId);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/search?ei=k7f4XtvzGo7az7sP3LyVoA0&q=corona+live+cases&oq=coona+live+cases&gs_lcp=CgZwc3ktYWIQDFAAWABgjcwUaABwAHgAgAEAiAEAkgEAmAEAqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwibiZb56aTqAhUO7XMBHVxeBdQQ4dUDCAs#spf=1593358569197");
    }
}