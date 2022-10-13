package com.marathidevelopers.bsc_agri;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;

public class insta extends AppCompatActivity {

    WebView app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta);
        app= (WebView)findViewById(R.id.insta1);
        app.loadUrl("https://instagram.com/agricos_legends?igshid=YmMyMTA2M2Y=");

}}
