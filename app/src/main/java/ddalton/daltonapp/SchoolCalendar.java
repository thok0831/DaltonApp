package ddalton.daltonapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SchoolCalendar extends AppCompatActivity {

    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("yyyy년 MMMM", Locale.getDefault());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolcalendar);


        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("School Calendar");

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);


        compactCalendar.setFirstDayOfWeek(Calendar.SUNDAY);

        //Set an event in calendar

        Event ev1 = new Event(Color.RED, 1487322000000L, "Family Day");
        compactCalendar.addEvent(ev1);

        Event ev2 = new Event(Color.RED, 1489136400000L, "Teacher's In-Service Day");
        compactCalendar.addEvent(ev2);

        Event ev3 = new Event(Color.MAGENTA, 1489741200000L, "Parent Teacher Conference II");
        compactCalendar.addEvent(ev3);

        Event ev4 = new Event(Color.RED, 1490605200000L, "Spring Break");
        compactCalendar.addEvent(ev4);

        Event ev5 = new Event(Color.RED, 1490691600000L, "Spring Break");
        compactCalendar.addEvent(ev5);

        Event ev6 = new Event(Color.RED, 1490778000000L, "Spring Break");
        compactCalendar.addEvent(ev6);

        Event ev7 = new Event(Color.RED, 1490864400000L, "Spring Break");
        compactCalendar.addEvent(ev7);

        Event ev8 = new Event(Color.RED, 1490950800000L, "Spring Break");
        compactCalendar.addEvent(ev8);

        Event ev9 = new Event(Color.RED, 1492765200000L, "Teacher's In-Service Day");
        compactCalendar.addEvent(ev9);

        Event ev10 = new Event(Color.RED, 1493974800000L, "Children's Day");
        compactCalendar.addEvent(ev10);

        Event ev11 = new Event(Color.RED, 1496998800000L, "Arch Day");
        compactCalendar.addEvent(ev11);

        Event ev12 = new Event(Color.MAGENTA, 1497085200000L, "Graduation Day");
        compactCalendar.addEvent(ev12);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();

                System.out.println(dateClicked.toString());

                if (dateClicked.toString().compareTo("Fri Feb 17 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Family Day", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Fri Mar 10 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Teacher's In-Service Day", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Fri Mar 17 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Parent Teacher Conference II", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Mon Mar 27 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Spring Break", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Tue Mar 28 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Spring Break", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Wed Mar 29 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Spring Break", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Thu Mar 30 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Spring Break", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Fri Mar 31 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Spring Break", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Fri Apr 21 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Teacher's In-Service Day", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Fri May 05 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Children's Day", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Fri Jun 09 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Arch Day", Toast.LENGTH_SHORT).show();
                }
                else if (dateClicked.toString().compareTo("Sat Jun 10 00:00:00 GMT+09:00 2017") == 0) {
                    Toast.makeText(context, "Graduation Day", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(context, "No Events Planned for that day", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });
    }
}