package com.example.toolboxbandalo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ServiceTermsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_terms);
    }

    public void clickMe(View v) {
        final TextView confirmation = (TextView) findViewById(R.id.textView2);
        confirmation.setVisibility(View.VISIBLE);
    }
}
