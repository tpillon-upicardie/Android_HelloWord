package com.tpillon.helloworld;

import android.content.Intent;
import android.os.ResultReceiver;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;

/**
 * SOURCE : https://www.tutorialspoint.com/android/android_user_interface_layouts.htm
 */

public class MainActivity extends AppCompatActivity {
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void onClickLinear(View view) {
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }

        public void onClickRelative(View view) {
            Intent intent = new Intent(this,
                                        RelativeActivity.class);
            startActivity(intent);
    }

    public void onClickTable(View view) {
        Intent intent = new Intent(this, TableActivity.class);
        startActivity(intent);
    }

    public void onClickFrame(View view) {
        Intent intent = new Intent(this, FrameActivity.class);
        startActivity(intent);
    }


    public void onClickConstraint(View view) {
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }

    public void onClickTest(View view) {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }
}
