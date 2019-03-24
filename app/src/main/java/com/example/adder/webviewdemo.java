package com.example.adder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class webviewdemo extends AppCompatActivity {
    WebView ourBrow ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewdemo);

        ourBrow = findViewById(R.id.brow);
        ourBrow.setWebViewClient(new MyBrowser());
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.loadUrl("http://www.telusko.com");
    }

    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
          view.loadUrl(url);
          return true;
        }
    }
}
