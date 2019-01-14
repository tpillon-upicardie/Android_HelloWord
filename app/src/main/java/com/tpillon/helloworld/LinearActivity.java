package com.tpillon.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

public class LinearActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        // collect elements
        Switch orientationSelector = findViewById(R.id.switch_orientation);
        linearLayout = findViewById(R.id.linearLayout);

        // add listener on switch element
        orientationSelector.setOnCheckedChangeListener(this);
    }

    //function call during switch value change
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // change the orientation
        linearLayout.setOrientation(isChecked ? LinearLayout.VERTICAL : LinearLayout.HORIZONTAL);
    }
}
