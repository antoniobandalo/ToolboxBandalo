package com.example.toolboxbandalo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Switch sw = (Switch) findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    imageView.setImageResource(R.drawable.italy);
                } else {
                    // The toggle is disabled
                    imageView.setImageResource(R.drawable.greece);
                }
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void onCheckboxClicked(View view) {

        final TextView numTravelers = (TextView) findViewById(R.id.textView4);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox:
                if (checked)

                break;
            case R.id.checkBox2:
                if (checked)
                    spinner.setVisibility(View.VISIBLE);
                    numTravelers.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void clickMe(View v) {
        Intent intent = new Intent(OtherActivity.this, ServiceTermsActivity.class);
        startActivity(intent);
    }
}
