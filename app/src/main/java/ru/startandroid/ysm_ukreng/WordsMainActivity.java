package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class WordsMainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] part = {"Частина 1", "Частина 2","Частина 3","Частина 4","Частина 5"};
    Button btnWords1, btnWords2,btnWords3;
    Spinner spWords;
    int selectPart;
    String selectItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__words_main);

        //selectPart = "Part 1";

        btnWords1 = (Button) findViewById(R.id.btnWords1);
        btnWords2 = (Button) findViewById(R.id.btnWords2);
        btnWords3 = (Button) findViewById(R.id.btnWords3);

        btnWords1.setOnClickListener(this);
        btnWords2.setOnClickListener(this);
        btnWords3.setOnClickListener(this);

        spWords = (Spinner) findViewById(R.id.spWords);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        selectPart = spWords.getSelectedItemPosition()+1;
        //selectItem = spWords.getSelectedItem().toString();
                switch(v.getId()) {
            case R.id.btnWords1:
                intent = new Intent(this, WordsActivity1.class);
                intent.putExtra("Part", selectPart);
                startActivity(intent);
                break;
            case R.id.btnWords2:
                intent = new Intent(this, WordsActivity2.class);
                intent.putExtra("Part", selectPart);
                startActivity(intent);
                break;
            case R.id.btnWords3:
                intent = new Intent(this,WordsActivity3.class);
                //intent.putExtra("Part", selectPart);
                startActivity(intent);
                //if (selectPart == 3)btnWords3.setText("3я позишон");
                break;
        }
    }


}