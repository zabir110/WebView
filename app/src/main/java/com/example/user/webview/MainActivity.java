package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=(WebView) findViewById(R.id.web);

        //to support java script
        web.getSettings().setJavaScriptEnabled(true);

        //load a Url address
        web.loadUrl("http://www.gmail.com");

        //to load anything from our apps not using any browser
         web.setWebViewClient(new MyBrowser());
    }

    private class MyBrowser extends WebViewClient
    {
        //webrequest change kore string dilam....
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


    }
}
