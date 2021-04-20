package ru.startandroid.ysm_ukreng;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VocabActivity3 extends AppCompatActivity {

    String[] Eng1 = { "air", "area", "arm", "art", "author", "baby", "back", "ball",
            "bank", "bed", "board", "boat", "body", "book", "box", "boy", "brother", "business",
            "camera", "car", "card", "change", "cheese", "child", "church", "city", "community",
            "company", "country", "cup", "daughter", "day", "doctor", "dog", "door", "drawing",
            "driver", "drop", "East", "education", "egg", "end", "eye", "face", "fact", "family",
            "father", "fish", "floor", "fly", "food", "force", "friend", "game", "girl",
            "government", "group", "gun", "guy", "hair", "hand", "head", "health", "heart",
            "history", "home", "hospital", "hour", "house", "idea", "information", "issue",
            "job", "kind", "law", "leg", "level", "life", "line", "lot", "man", "map", "member",
            "minute", "moment", "money", "month", "morning", "mother", "movie", "music", "name",
            "night", "North", "number", "office", "other", "parent", "part", "party", "people",
            "person", "picture", "place", "power", "president", "problem", "question", "reading",
            "reason", "research", "result", "right", "room", "school", "service", "side", "sister",
            "son", "South", "sport", "spring", "star", "state", "station", "store", "story",
            "street", "student", "study", "table", "teacher", "team", "television", "thing",
            "ticket", "time", "town", "train", "tree", "wall", "water", "way", "week", "window",
            "woman", "word", "work", "world", "year"};
    String[] Ukr1 = {"повітря", "територія", "рука", "мистецтво", "письменник", "немовля",
            "спина, назад", "м'яч", "банк", "ліжко", "дошка", "човен", "тіло", "книга", "коробка",
            "хлопчик", "брат", "бізнес, справа", "камера", "автомобіль", "картка", "зміна", "сир",
            "дитина", "церква", "велике місто", "спільнота", "компанія", "країна", "чашка",
            "дочка", "день", "лікар",  "собака", "двері", "малювання", "водій", "капля", "схід",
            "освіта", "яйце", "кінець", "око", "лице", "факт", "сім'я", "батько", "риба",
            "підлога", "муха, літати", "їжа", "сила", "друг", "гра", "дівчина", "влада", "група",
            "зброя", "хлопець", "волосся", "кисть", "голова", "здоров'я", "серце", "історія",
            "дім", "лікарня", "година", "будинок", "ідея", "інформація", "діло, випадок",
            "робота", "вид, сорт", "закон", "нога", "рівень", "життя", "лінія", "партія, багато",
            "чоловік, людина", "карта", "член", "хвилина", "момент", "гроші", "місяць", "ранок",
            "матір", "фільм", "музика", "ім'я", "ніч", "північ", "номер", "офіс", "інший",
            "батько, матір", "частина", "вечірка", "люди", "людина", "картинка", "місце",
            "міць, енергія", "президент", "проблема", "запитання", "читання", "причина",
            "пошук, дослідження", "результат", "правильний, право", "кімната", "школа", "послуга",
            "сторона", "сестра", "син", "південь", "спорт", "весна", "зірка", "штат", "станція",
            "магазин", "розповідь, історія", "вулиця", "учень, студент", "навчання", "стіл",
            "вчитель", "команда", "телебачення", "річ", "білет", "час", "містечко", "потяг",
            "дерево", "стіна", "вода", "шлях, спосіб", "тиждень", "вікно", "жінка", "слово",
            "робота", "світ", "рік"};

    int[] colors = new int[2];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab3);

        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout1);

        LayoutInflater ltInflater = getLayoutInflater();
        for (int i = 0; i < Eng1.length; i++) {
            View item = ltInflater.inflate(R.layout.item2, linLayout, false);
            TextView tvVocab41 = (TextView) item.findViewById(R.id.tvVocab41);
            tvVocab41.setText(Eng1[i]);
            TextView tvVocab42 = (TextView) item.findViewById(R.id.tvVocab42);
            tvVocab42.setText(Ukr1[i]);
            item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 2]);
            linLayout.addView(item);
        }
    }
}