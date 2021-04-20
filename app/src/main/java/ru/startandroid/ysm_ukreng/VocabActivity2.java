package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VocabActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button bVocab22, bVocab23, bVocab24;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab2);

        bVocab22 = (Button) findViewById(R.id.bVocab22);
        bVocab23 = (Button) findViewById(R.id.bVocab23);
        bVocab24 = (Button) findViewById(R.id.bVocab24);

        bVocab22.setOnClickListener(this);
        bVocab23.setOnClickListener(this);
        bVocab24.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (this, TimesActivity.class);
        switch(v.getId())
        {
            case R.id.bVocab22:
                i=1;
                intent.putExtra("Time", i);
                startActivity(intent);
                break;
            case R.id.bVocab23:
                i=2;
                intent.putExtra("Time", i);
                startActivity(intent);
                break;
            case R.id.bVocab24:
                i=3;
                intent.putExtra("Time", i);
                startActivity(intent);
                break;
        }

    }
}