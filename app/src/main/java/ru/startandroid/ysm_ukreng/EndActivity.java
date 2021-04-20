package ru
        .startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvEnd2;
    TextView tvEnd4;
    TextView tvEnd3;
    Button btnEnd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);


        tvEnd2 = (TextView) findViewById(R.id.tvEnd2);
        tvEnd4 = (TextView) findViewById(R.id.tvEnd4);
        btnEnd1 = (Button) findViewById(R.id.btnEnd1);
        btnEnd1.setOnClickListener(this);

        Intent intent = getIntent();

        int R = intent.getIntExtra("RCount", 0);
        int W = intent.getIntExtra("WCount", 0);

        tvEnd2.setText(""+R);
        tvEnd4.setText(""+W);


    }

    @Override
    public void onClick(View v) {
        finish();
    }
}