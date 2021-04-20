package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VocabMainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVocab1, btnVocab2, btnVocab3, btnVocab4;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab_main);

        btnVocab1 = (Button) findViewById(R.id.btnVocab1);
        btnVocab2 = (Button) findViewById(R.id.btnVocab2);
        btnVocab3 = (Button) findViewById(R.id.btnVocab3);
        btnVocab4 = (Button) findViewById(R.id.btnVocab4);

        btnVocab1.setOnClickListener(this);
        btnVocab2.setOnClickListener(this);
        btnVocab3.setOnClickListener(this);
        btnVocab4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.btnVocab1:
                intent = new Intent(this, VocabActivity1.class);
                startActivity(intent);
                break;
            case R.id.btnVocab2:
                intent = new Intent(this, VocabActivity2.class);
                startActivity(intent);
                break;
            case R.id.btnVocab3:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://translate.google.com/#view=home&op=translate&sl=en&tl=uk"));
                startActivity(intent);
                break;
            case R.id.btnVocab4:
                intent = new Intent(this, VocabActivity3.class);
                startActivity(intent);
                break;
        }

    }
}