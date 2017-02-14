package ddalton.daltonapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class LunchMenu extends AppCompatActivity {
    TextView DisplayMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cafeteria Menu");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_menu);

        DisplayMenu=(TextView)findViewById(R.id.LunchMenuText);

        new doit().execute();

    }

    public class doit extends AsyncTask<Void,Void,Void>{
        String words;
        String text;


        @Override
        protected Void doInBackground(Void... params) {
            String weekday_name = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis());
            System.out.println(weekday_name);

            if (weekday_name.toString().compareTo("Monday") == 0) {
                try {
                    Document document = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                    words = document.select("table.cafeteria tbody tr td").eq(3).html();
                    String temp = words.replace("<br>", "$$$");
                    Document doc1 = Jsoup.parse(temp);
                    text = doc1.body().text().replace("$$$", "\n").toString();
                    System.out.println(text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
            else if (weekday_name.toString().compareTo("Tuesday") == 0) {
                try {
                    Document document = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                    words = document.select("table.cafeteria tbody tr td").eq(9).html();
                    String temp = words.replace("<br>", "$$$");
                    Document doc1 = Jsoup.parse(temp);
                    text = doc1.body().text().replace("$$$", "\n").toString();
                    System.out.println(text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            return null;
            }
            else if (weekday_name.toString().compareTo("Wednesday") == 0) {
                try {
                    Document document = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                    words = document.select("table.cafeteria tbody tr td").eq(15).html();
                    String temp = words.replace("<br>", "$$$");
                    Document doc1 = Jsoup.parse(temp);
                    text = doc1.body().text().replace("$$$", "\n").toString();
                    System.out.println(text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
            else if (weekday_name.toString().compareTo("Thursday") == 0) {
                try {
                    Document document = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                    words = document.select("table.cafeteria tbody tr td").eq(21).html();
                    String temp = words.replace("<br>", "$$$");
                    Document doc1 = Jsoup.parse(temp);
                    text = doc1.body().text().replace("$$$", "\n").toString();
                    System.out.println(text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
            else if (weekday_name.toString().compareTo("Friday") == 0) {
                try {
                    Document document = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                    words = document.select("table.cafeteria tbody tr td").eq(27).html();
                    String temp = words.replace("<br>", "$$$");
                    Document doc1 = Jsoup.parse(temp);
                    text = doc1.body().text().replace("$$$", "\n").toString();
                    System.out.println(text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
            else return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            DisplayMenu.setText(text);
        }
    }
}
