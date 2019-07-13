package com.example.alc4phase1c10;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView simpleWebView = findViewById(R.id.wvAboutALC);
        // specify the url of the web page in loadUrl function
        String url = "https://andela.com/alc/";
        // simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.setWebViewClient(new WebViewClient()
        {
            @Override public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
            {
                handler.proceed();
            }
        });

        simpleWebView.loadUrl(url);
    }



}
