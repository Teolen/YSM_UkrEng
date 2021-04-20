package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VocabActivity1 extends AppCompatActivity {

    String[] form1 = {"be", "become", "begin", "break", "bring", "build", "buy", "can", "catch",
            "choose", "come", "cost", "cut", "do", "drink", "drive", "eat", "fall", "feel",
            "fight", "find", "fly", "forget", "get", "give", "go", "grow", "have", "hear",
            "hit", "keep", "know", "learn", "leave", "lose", "make", "meet", "pay", "put",
            "read", "ride", "run", "say", "see", "sell", "send", "shut", "sing", "sit",
            "sleep", "speak", "spend", "stand", "steal", "swim", "take", "tell", "think",
            "understand", "wake", "wear", "win", "write"};
    String[] form2 = { "was/were", "became", "began", "broke", "brought", "built", "bought",
            "could", "caught", "chose", "came", "cost", "cut", "did", "drank", "drove", "ate",
            "fell", "felt", "fought", "found", "flew", "forgot", "got", "gave", "went", "grew",
            "had", "heard", "hit", "kept", "knew", "learnt", "left", "lost", "made", "met",
            "paid", "put", "read", "rode", "ran", "said", "saw", "sold", "sent", "shut", "sang",
            "sat", "slept", "spoke", "spent", "stood", "stole", "swam", "took", "told", "thought",
            "understood", "woke", "wore", "win", "wrote"};
    String[] form3 = {"been", "become", "begun", "broken", "brought", "built", "bought",
            "been able", "caught", "chosen", "come", "cost", "cut", "done", "drunk", "driven",
            "eaten", "fallen", "felt", "fought", "found", "flown", "forgotten", "got", "given",
            "gone", "grown", "had", "heard", "hit", "kept", "known", "learnt", "left", "lost",
            "made", "met", "paid", "put", "read", "ridden", "run", "said", "seen", "sold", "sent",
            "shut", "sung", "sat", "slept", "spoken", "spent", "stood", "stolen", "swum", "taken",
            "told", "thought", "understood", "woken", "worn", "won", "written"};
    String[] form4 = {"бути", "ставати", "починати", "ламати", "приносити", "будувати", "купувати",
            "могти", "ловити", "вибирати", "приходити", "коштувати", "вирізати", "робити", "пити",
            "їздити", "їсти", "падати", "відчувати", "боротися", "знаходити", "літати", "забувати",
            "отримувати", "давати", "йти", "рости", "мати", "чути", "бити", "тримати", "знати",
            "вивчати", "залишати", "втрачати", "зробити", "зустрічати", "платити", "класти",
            "читати", "їздити", "бігти", "сказати", "бачити", "продавати", "відправляти",
            "закривати", "співати", "сидіти", "спати", "говорити", "витрачати", "стояти", "красти",
            "плавати", "брати", "розповідати", "думати", "розуміти", "прокидатися", "носити",
            "перемагати", "писати"};

    int[] colors = new int[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab1);

        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);

        LayoutInflater ltInflater = getLayoutInflater();
        for (int i = 0; i < form1.length; i++) {
            View item = ltInflater.inflate(R.layout.item1, linLayout, false);
            TextView tvVocab11 = (TextView) item.findViewById(R.id.tvVocab11);
            tvVocab11.setText(form1[i]);
            TextView tvVocab12 = (TextView) item.findViewById(R.id.tvVocab12);
            tvVocab12.setText(form2[i]);
            TextView tvVocab13 = (TextView) item.findViewById(R.id.tvVocab13);
            tvVocab13.setText(form3[i]);
            TextView tvVocab14 = (TextView) item.findViewById(R.id.tvVocab14);
            tvVocab14.setText(form4[i]);
            item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 2]);
            linLayout.addView(item);
        }
    }
}