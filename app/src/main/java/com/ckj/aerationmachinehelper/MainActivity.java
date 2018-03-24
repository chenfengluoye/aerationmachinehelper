package com.ckj.aerationmachinehelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MyWebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=(MyWebView)findViewById(R.id.web);
        web.loadUrl("http://39.106.34.156:8080/chattest/index.jsp");
    }
}
