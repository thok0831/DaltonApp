package ddalton.daltonapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParseMenu extends AppCompatActivity {
    TextView texx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_lunch_menu);

        texx=(TextView)findViewById(R.id.tex1);

        Button but=(Button) findViewById(R.id.but1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("parse button pressed");
                new doit().execute();
            }
        });

    }

    public class doit extends AsyncTask<Void,Void,Void>{
        String words;

        @Override
        protected Void doInBackground(Void... params) {
            System.out.println("parsing");
            try {
                Document doc = Jsoup.connect("http://daltonschool.kr/homeeng/04schoollife/040203schoollife.html").get();
                words=doc.text();
            }catch(Exception e){e.printStackTrace();}
            return null;
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            texx.setText(words);
        }
    }
}
