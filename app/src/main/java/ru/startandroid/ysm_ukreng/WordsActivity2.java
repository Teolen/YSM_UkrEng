package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;

public class WordsActivity2 extends AppCompatActivity implements View.OnClickListener {

    ImageView ivQuest2;
    TextView tvQuest2, tvCount21, tvCount22, tvRAnsw2;
    EditText etAnsw2;
    Button bNext2, bNext3;

    String[] Quest1;
    String[] RAnsw;


    int Count, Answ, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words2);

        i = 0;
        Count = 0;

        Intent intent = getIntent();
        int Part = intent.getIntExtra("Part", 1);
        switch (Part) {
            case 1:
                RAnsw = getResources().getStringArray(R.array.engwords1);
                Quest1 = getResources().getStringArray(R.array.ukrwords1);
                break;
            case 2:
                RAnsw = getResources().getStringArray(R.array.engwords2);
                Quest1 = getResources().getStringArray(R.array.ukrwords2);
                break;
            case 3:
                RAnsw = getResources().getStringArray(R.array.engwords3);
                Quest1 = getResources().getStringArray(R.array.ukrwords3);
                break;
            case 4:
                RAnsw = getResources().getStringArray(R.array.engwords4);
                Quest1 = getResources().getStringArray(R.array.ukrwords4);
                break;
            case 5:
                RAnsw = getResources().getStringArray(R.array.engwords5);
                Quest1 = getResources().getStringArray(R.array.ukrwords5);
                break;
        }

        tvCount21 = (TextView) findViewById(R.id.tvCount21);
        tvCount22 = (TextView) findViewById(R.id.tvCount22);
        ivQuest2 = (ImageView) findViewById(R.id.ivQuest2);
        tvQuest2 = (TextView) findViewById(R.id.tvQuest2);
        etAnsw2 = (EditText) findViewById(R.id.etAnsw2);
        tvRAnsw2 = (TextView) findViewById(R.id.tvRAnsw2);
        bNext2 = (Button) findViewById(R.id.bNext2);
        bNext2.setOnClickListener(this);
        bNext2.setText("Перевірка");
        etAnsw2.setTextColor(Color.BLACK);
        SetNewTestRes(i);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (this, EndActivity.class);

        if (((tvRAnsw2.getText().toString()).equalsIgnoreCase("")) && !((etAnsw2.getText().toString()).equalsIgnoreCase("")))
        {
            if ((etAnsw2.getText().toString()).equalsIgnoreCase(RAnsw[i]))
            {
                etAnsw2.setTextColor(Color.GREEN);
                tvRAnsw2.setText("ВІРНО!");
                Count++;
            }
            else {
                etAnsw2.setTextColor(Color.RED);
                tvRAnsw2.setText(RAnsw[i]);
            }
            bNext2.setText("ДАЛІ");
            i++;
        }
        else if (i <= Quest1.length-1)
        {
         SetNewTestRes(i);
        }

        else {
            intent.putExtra("RCount", Count);
            intent.putExtra("WCount", i - Count);
            startActivity(intent);
            finish();
        }


    }

    public void SetNewTestRes(int a)
    {
        tvCount21.setText("N"+(i+1));
        tvCount22.setText(Count+"/"+(i-Count));
        int resID = getResources().getIdentifier(RAnsw[i] , "drawable", getPackageName());
        ivQuest2.setImageResource(resID);
        tvQuest2.setText(Quest1[i]);
        etAnsw2.setText("");
        tvRAnsw2.setText("");
        bNext2.setText("Перевірка");
        etAnsw2.setTextColor(Color.BLACK);
    }

}