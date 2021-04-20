package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnWords, btnVocab, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWords = (Button) findViewById(R.id.btnWords);
        btnVocab = (Button) findViewById(R.id.btnVocab);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnWords.setOnClickListener(this);
        btnVocab.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       Intent intent;
        switch(v.getId()) {
            case R.id.btnWords:
                intent = new Intent(this, WordsMainActivity.class);
                    startActivity(intent);
                break;
            case R.id.btnVocab:
                intent = new Intent(this, VocabMainActivity.class);
                    startActivity(intent);
                break;
            case R.id.btnExit:
                finish();
                break;
        }
    }
}