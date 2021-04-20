package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TimesActivity extends AppCompatActivity {

    ImageView ivTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);

        ivTimes = (ImageView) findViewById(R.id.ivTimes);

        Intent intent = getIntent();

        int TIME = intent.getIntExtra("Time", 0);

        if (TIME == 1)
            ivTimes.setImageResource(R.drawable.present);
        else if (TIME == 2)
            ivTimes.setImageResource(R.drawable.past);
        else if (TIME == 3)
            ivTimes.setImageResource(R.drawable.future);
        else finish();
    }
}