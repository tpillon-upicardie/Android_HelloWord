package com.tpillon.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {

    private int count;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        count = 0;
        button = findViewById(R.id.button6);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        count += 100;
        UpdateButtonText();
    }

    public void MaFunction(View view) {
        count++;
        UpdateButtonText();
    }

    private void UpdateButtonText() {
        String value = Integer.toString(count);
        button.setText(value);

    }
}
