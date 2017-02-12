package ddalton.daltonapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LunchMenu extends AppCompatActivity {
    TextView DisplayMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_menu);

        DisplayMenu=(TextView)findViewById(R.id.LunchMenuText);

        new doit().execute();

    }

    public class doit extends AsyncTask<Void,Void,Void>{
        String words;

        @Override
        protected Void doInBackground(Void... params) {
            System.out.println("parsing");
            try {
                Document doc = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                words=doc.select("table.cafeteria tbody tr td").eq(3).text();
            }catch(Exception e){e.printStackTrace();}
            return null;
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            DisplayMenu.setText(words);
        }
    }
}
