package com.tpillon.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tpillon.helloworld.R;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }
}
