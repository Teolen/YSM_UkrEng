package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WordsActivity3 extends AppCompatActivity implements View.OnClickListener {

    TextView tvCount31, tvCount32, tvQuest31, tvQuest32;
    Button bAnsw31, bAnsw32, bAnsw33, bAnsw34, bNext3;
    int i, Answ, Count;

    String[] Quest1 = {"My friends (run)____ to the dinnig room", "We (eat)____ pasta for dinner yesterday",
            "Mark (live)____ in the city", "We (swim)____ to the other waterside",
            "You (leave)____ the room", "I (go)____ to the library",
            "Olya (climb)____ the tree at 10 p.m.", "I (go)____ to school",
            "Maria (tell)____ the story", "William (go)____ to the store"};
    String[] Quest2 = {"(Мої друзі бігають у їдальню)", "(Ми їли пасту на вечерю вчора)",
            "(Марк живе у місті)", "(Ми пливемо до іншого берега)", "(Ти покинув кімнату)",
            "(Я ходжу в бібліотеку)", "(Оля вилазила на дерево о 10-ій вечора)", "(Я йду до школи)",
            "(Марія розповіла історію)", "(Вільям йде до магазину)"};
    String[] Answ1 ={"were running","was ate","lives","swim","was leaving","go","climbed","go","told","went"};
    String[] Answ2 ={"run","eaten","are living","are swimming","leave","is going","were climbing","am going","tell","goes"};
    String[] Answ3 ={"runs","eat","were living","am swimming","left","went","climb","goes","tells","is going"};
    String[] Answ4 ={"are running","were eating","lived","swam","are leaving","goes","was climbing","are going","is telling","was going"};
    String[] RAnsw ={"run", "were eating", "lives", "are swimming", "left", "go", "was climbing",
            "am going", "told", "is going"};
    int[] RNum ={2,4,1,2,3,1,4,2,1,3};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words3);

        i = 0;
        Count = 0;

        tvCount31 = (TextView) findViewById(R.id.tvCount31);
        tvCount32 = (TextView) findViewById(R.id.tvCount32);
        tvQuest31 = (TextView) findViewById(R.id.tvQuest31);
        tvQuest32 = (TextView) findViewById(R.id.tvQuest32);
        bAnsw31 = (Button) findViewById(R.id.bAnsw31);
        bAnsw32 = (Button) findViewById(R.id.bAnsw32);
        bAnsw33 = (Button) findViewById(R.id.bAnsw33);
        bAnsw34 = (Button) findViewById(R.id.bAnsw34);
        bNext3 = (Button) findViewById(R.id.bNext3);

        bAnsw31.setOnClickListener(this);
        bAnsw32.setOnClickListener(this);
        bAnsw33.setOnClickListener(this);
        bAnsw34.setOnClickListener(this);
        bNext3.setOnClickListener(this);

        SetNewTestRes(i);

        bNext3.setClickable(false);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (this, EndActivity.class);
        switch(v.getId()) {
            case R.id.bAnsw31:
                Answ = 1;
                GreenRight();
                if (Answ != RNum[i])
                    bAnsw31.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                break;
            case R.id.bAnsw32:
                Answ = 2;
                GreenRight();
                if (Answ != RNum[i])
                    bAnsw32.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                break;
            case R.id.bAnsw33:
                Answ = 3;
                GreenRight();
                if (Answ != RNum[i])
                    bAnsw33.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                break;
            case R.id.bAnsw34:
                Answ = 4;
                GreenRight();
                if (Answ != RNum[i])
                    bAnsw34.setBackgroundColor(Color.RED);
                ChangeClickable(false,true);
                break;
            case R.id.bNext3:
                if (Answ == RNum[i])
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
        bAnsw31.setClickable(a);
        bAnsw32.setClickable(a);
        bAnsw33.setClickable(a);
        bAnsw34.setClickable(a);
        bNext3.setClickable(b);
    }
    public void GreenRight()
    {
        if (RNum[i] == 1)
            bAnsw31.setBackgroundColor(Color.GREEN);
        else if (RNum[i] == 2)
            bAnsw32.setBackgroundColor(Color.GREEN);
        else if (RNum[i] == 3)
            bAnsw33.setBackgroundColor(Color.GREEN);
        else if (RNum[i] == 4)
            bAnsw34.setBackgroundColor(Color.GREEN);
    }
    public void SetNewTestRes(int a)
    {
        tvCount31.setText("N"+(i+1));
        tvCount32.setText(Count+"/"+(i-Count));
        tvQuest31.setText(Quest1[i]);
        tvQuest32.setText(Quest2[i]);
        bAnsw31.setText(Answ1[i]);
        bAnsw32.setText(Answ2[i]);
        bAnsw33.setText(Answ3[i]);
        bAnsw34.setText(Answ4[i]);
        bAnsw31.setBackgroundColor(Color.argb(100, 200, 200, 200));
        bAnsw32.setBackgroundColor(Color.argb(100, 200, 200, 200));
        bAnsw33.setBackgroundColor(Color.argb(100, 200, 200, 200));
        bAnsw34.setBackgroundColor(Color.argb(100, 200, 200, 200));
    }

}