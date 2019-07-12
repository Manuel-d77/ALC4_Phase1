package com.example.manuel.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    private WebView myWebView;
    private String url= "https://andela.com/alc/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        myWebView = (WebView) findViewById(R.id.webView1);

        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler errorHandler, SslError sslError){
                errorHandler.proceed();
            }
        });
        //myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl(url);

    }
}
