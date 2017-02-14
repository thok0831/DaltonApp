package ddalton.daltonapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SchoolNews extends AppCompatActivity {
    TextView title0;
    TextView content0;
    TextView title1;
    TextView content1;
    TextView title2;
    TextView content2;
    TextView title3;
    TextView content3;
    TextView title4;
    TextView content4;
    TextView title5;
    TextView content5;
    TextView title6;
    TextView content6;
    TextView title7;
    TextView content7;
    TextView title8;
    TextView content8;
    TextView title9;
    TextView content9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("School News");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_news);

        title0=(TextView)findViewById(R.id.title0);
        content0=(TextView)findViewById(R.id.content0);
        title1=(TextView)findViewById(R.id.title1);
        content1=(TextView)findViewById(R.id.content1);
        title2=(TextView)findViewById(R.id.title2);
        content2=(TextView)findViewById(R.id.content2);
        title3=(TextView)findViewById(R.id.title3);
        content3=(TextView)findViewById(R.id.content3);
        title4=(TextView)findViewById(R.id.title4);
        content4=(TextView)findViewById(R.id.content4);
        title5=(TextView)findViewById(R.id.title5);
        content5=(TextView)findViewById(R.id.content5);
        title6=(TextView)findViewById(R.id.title6);
        content6=(TextView)findViewById(R.id.content6);
        title7=(TextView)findViewById(R.id.title7);
        content7=(TextView)findViewById(R.id.content7);
        title8=(TextView)findViewById(R.id.title8);
        content8=(TextView)findViewById(R.id.content8);
        title9=(TextView)findViewById(R.id.title9);
        content9=(TextView)findViewById(R.id.content9);


        new doit().execute();

    }

    public class doit extends AsyncTask<Void,Void,Void> {
        String ptitle0;
        String pcontent0;
        String ptitle1;
        String pcontent1;
        String ptitle2;
        String pcontent2;
        String ptitle3;
        String pcontent3;
        String ptitle4;
        String pcontent4;
        String ptitle5;
        String pcontent5;
        String ptitle6;
        String pcontent6;
        String ptitle7;
        String pcontent7;
        String ptitle8;
        String pcontent8;
        String ptitle9;
        String pcontent9;

        String ppcontent0;
        String ppcontent1;
        String ppcontent2;
        String ppcontent3;
        String ppcontent4;
        String ppcontent5;
        String ppcontent6;
        String ppcontent7;
        String ppcontent8;
        String ppcontent9;



        @Override
        protected Void doInBackground(Void... params) {
            System.out.println("parsing");
            try {
                Document doc = Jsoup.connect("http://www.cdshighschool.com/").get();
                ptitle0 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(0).text();
                pcontent0 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(0).html();
                ptitle1 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(1).text();
                pcontent1 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(1).html();
                ptitle2 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(2).text();
                pcontent2 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(2).text();
                ptitle3 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(3).text();
                pcontent3 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(3).html();
                ptitle4 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(4).text();
                pcontent4 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(4).html();
                ptitle5 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(5).text();
                pcontent5 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(5).html();
                ptitle6 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(6).text();
                pcontent6 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(6).html();
                ptitle7 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(7).text();
                pcontent7 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(7).html();
                ptitle8 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(8).text();
                pcontent8 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(8).html();
                ptitle9 = doc.select("div#wsite-content div.blog-post div.blog-header h2.blog-title").eq(9).text();
                pcontent9 = doc.select("div#wsite-content div.blog-post div.blog-content").eq(9).html();

                String temp0 = pcontent0.replace("<br>", "$$$");
                Document doc0 = Jsoup.parse(temp0);
                ppcontent0 = doc0.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent0);

                String temp1 = pcontent1.replace("<br>", "$$$");
                Document doc1 = Jsoup.parse(temp1);
                ppcontent1 = doc1.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent1);

                String temp2 = pcontent2.replace("<br>", "$$$");
                Document doc2 = Jsoup.parse(temp2);
                ppcontent2 = doc2.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent2);

                String temp3 = pcontent3.replace("<br>", "$$$");
                Document doc3 = Jsoup.parse(temp3);
                ppcontent3 = doc3.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent3);

                String temp4 = pcontent4.replace("<br>", "$$$");
                Document doc4 = Jsoup.parse(temp4);
                ppcontent4 = doc4.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent4);

                String temp5 = pcontent5.replace("<br>", "$$$");
                Document doc5 = Jsoup.parse(temp5);
                ppcontent5 = doc5.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent5);

                String temp6 = pcontent6.replace("<br>", "$$$");
                Document doc6 = Jsoup.parse(temp6);
                ppcontent6 = doc6.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent6);

                String temp7 = pcontent7.replace("<br>", "$$$");
                Document doc7 = Jsoup.parse(temp7);
                ppcontent7 = doc7.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent7);

                String temp8 = pcontent8.replace("<br>", "$$$");
                Document doc8 = Jsoup.parse(temp8);
                ppcontent8 = doc8.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent8);

                String temp9 = pcontent9.replace("<br>", "$$$");
                Document doc9 = Jsoup.parse(temp9);
                ppcontent9 = doc9.body().text().replace("$$$", "\n").toString();
                System.out.println(ppcontent9);



            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            title0.setText(ptitle0);
            content0.setText(ppcontent0);
            title1.setText(ptitle1);
            content1.setText(ppcontent1);
            title2.setText(ptitle2);
            content2.setText(ppcontent2);
            title3.setText(ptitle3);
            content3.setText(ppcontent3);
            title4.setText(ptitle4);
            content4.setText(ppcontent4);
            title5.setText(ptitle5);
            content5.setText(ppcontent5);
            title6.setText(ptitle6);
            content6.setText(ppcontent6);
            title7.setText(ptitle7);
            content7.setText(ppcontent7);
            title8.setText(ptitle8);
            content8.setText(ppcontent8);
            title9.setText(ptitle9);
            content9.setText(ppcontent9);
        }
    }
}
