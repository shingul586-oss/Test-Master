package com.testmaster.mcq;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 protected void onCreate(Bundle b){super.onCreate(b);WebView w=new WebView(this);w.setWebViewClient(new WebViewClient());w.getSettings().setJavaScriptEnabled(true);w.getSettings().setDomStorageEnabled(true);w.loadUrl("file:///android_asset/index.html");setContentView(w);}
}