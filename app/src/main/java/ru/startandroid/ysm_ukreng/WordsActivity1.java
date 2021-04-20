package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class WordsActivity1 extends AppCompatActivity implements View.OnClickListener {

    TextView tvCount11, tvCount12, tvQuest1;
    ImageView ivQuest1;
    Button bAnsw11, bAnsw12, bAnsw13, bAnsw14, bNext1;

    String[] Quest1;

    String[] RAnsw;

    String answ;

    int Count, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words1);

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

        tvCount11 = (TextView) findViewById(R.id.tvCount11);
        tvCount12 = (TextView) findViewById(R.id.tvCount12);
        ivQuest1 = (ImageView) findViewById(R.id.ivQuest1);
        tvQuest1 = (TextView) findViewById(R.id.tvQuest1);
        bAnsw11 = (Button) findViewById(R.id.bAnsw11);
        bAnsw12 = (Button) findViewById(R.id.bAnsw12);
        bAnsw13 = (Button) findViewById(R.id.bAnsw13);
        bAnsw14 = (Button) findViewById(R.id.bAnsw14);
        bNext1 = (Button) findViewById(R.id.bNext1);

        bAnsw11.setOnClickListener(this);
        bAnsw12.setOnClickListener(this);
        bAnsw13.setOnClickListener(this);
        bAnsw14.setOnClickListener(this);
        bNext1.setOnClickListener(this);

        SetNewTestRes(i);

        bNext1.setClickable(false);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (this, EndActivity.class);
        switch(v.getId()) {
            case R.id.bAnsw11:
                GreenRight();
                if (!(bAnsw11.getText().toString()).equalsIgnoreCase(RAnsw[i]))
                    bAnsw11.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                answ = bAnsw11.getText().toString();
                    break;
            case R.id.bAnsw12:
                GreenRight();
                if (!(bAnsw12.getText().toString()).equalsIgnoreCase(RAnsw[i]))
                    bAnsw12.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                answ = bAnsw12.getText().toString();
                break;
            case R.id.bAnsw13:
                GreenRight();
                if (!(bAnsw13.getText().toString()).equalsIgnoreCase(RAnsw[i]))
                    bAnsw13.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                answ = bAnsw13.getText().toString();
                break;
            case R.id.bAnsw14:
                GreenRight();
                if (!(bAnsw14.getText().toString()).equalsIgnoreCase(RAnsw[i]))
                    bAnsw14.setBackgroundColor(Color.RED);
                    ChangeClickable(false,true);
                answ = bAnsw14.getText().toString();
                break;
            case R.id.bNext1:
                if (answ.equalsIgnoreCase(RAnsw[i]))
                    Count++;
                if (i < Quest1.length-1) {

                    i++;
                    SetNewTestRes(i);
                    ChangeClickable(true, false);
                }
                else
                    {
                    intent.putExtra("RCount", Count);
                    intent.putExtra("WCount", i-Count+1);
                    startActivity(intent);
                    finish();
                    };
                break;
        }
    }

    public void ChangeClickable(boolean a, boolean b) {
        bAnsw11.setClickable(a);
        bAnsw12.setClickable(a);
        bAnsw13.setClickable(a);
        bAnsw14.setClickable(a);
        bNext1.setClickable(b);
    }
    public void GreenRight()
    {
        if ((bAnsw11.getText().toString()).equalsIgnoreCase(RAnsw[i]))
            bAnsw11.setBackgroundColor(Color.GREEN);
        else if ((bAnsw12.getText().toString()).equalsIgnoreCase(RAnsw[i]))
            bAnsw12.setBackgroundColor(Color.GREEN);
        else if ((bAnsw13.getText().toString()).equalsIgnoreCase(RAnsw[i]))
            bAnsw13.setBackgroundColor(Color.GREEN);
        else if ((bAnsw14.getText().toString()).equalsIgnoreCase(RAnsw[i]))
            bAnsw14.setBackgroundColor(Color.GREEN);
    }
    public void SetNewTestRes(int a)
    {
        tvCount11.setText("N"+(i+1));
        tvCount12.setText(Count+"/"+(i-Count));
        int resID = getResources().getIdentifier(RAnsw[i] , "drawable", getPackageName());
        ivQuest1.setImageResource(resID);
        tvQuest1.setText(Quest1[i]);

        Random random = new Random();
        int[] arr1 = {0,0,0,0};
        int[] arr2 ={0,0,0,0};
        arr2[0] = i;
        boolean AlreadyThere;
        for (int j1 = 0; j1 < 4;)
        {
            AlreadyThere=false;
            int newRandom = random.nextInt(4);
            for (int jk1=0; jk1 < j1; jk1++)
            {
                if (arr1[jk1] == newRandom)
                {
                    AlreadyThere = true;
                    break;
                }
            }
            if (!AlreadyThere)
            {
                arr1[j1] =newRandom;
                j1++;
            }

        }
        for (int j2 = 1; j2 < 4;)
        {
            AlreadyThere=false;
            int newRandom = random.nextInt(Quest1.length);
            for (int jk2=0; jk2 < j2; jk2++)
            {
                if (arr2[jk2] == newRandom)
                {
                    AlreadyThere = true;
                    break;
                }
            }
            if (!AlreadyThere)
            {
                arr2[j2] =newRandom;
                j2++;
            }
        }

        for (int j3=0; j3<4; j3++)
        {
            switch (arr1[j3])
            {
                case 0:
                    bAnsw11.setText(RAnsw[arr2[j3]]);
                    break;
                case 1:
                    bAnsw12.setText(RAnsw[arr2[j3]]);
                    break;
                case 2:
                    bAnsw13.setText(RAnsw[arr2[j3]]);
                    break;
                case 3:
                    bAnsw14.setText(RAnsw[arr2[j3]]);
                    break;

            }
        }

        bAnsw11.setBackgroundColor(Color.argb(100, 200, 200, 200));
        bAnsw12.setBackgroundColor(Color.argb(100, 200, 200, 200));
        bAnsw13.setBackgroundColor(Color.argb(100, 200, 200, 200));
        bAnsw14.setBackgroundColor(Color.argb(100, 200, 200, 200));
    }

}