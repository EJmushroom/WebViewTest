package com.example.user.webviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView=findViewById<WebView>(R.id.webview)
        webView.settings.javaScriptEnabled=true
        setContentView(webView)
        webView.webViewClient=WebViewClient()
        webView.loadUrl("https://www.cks1020.com/index.php")
    }
}
