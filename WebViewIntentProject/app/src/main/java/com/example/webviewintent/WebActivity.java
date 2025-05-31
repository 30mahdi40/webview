package com.example.webviewintent;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        String url = getIntent().getStringExtra("url");
        if (url != null && !url.startsWith("http")) {
            url = "http://" + url;
        }
        webView.loadUrl(url);
    }
}