package ddalton.daltonapp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DDayCounter extends Activity{
    private TextView ddayText;
    private TextView todayText;
    private TextView resultText;
    private Button dateButton;

    private int tYear;
    private int tMonth;
    private int tDay;

    private int dYear=1;
    private int dMonth=1;
    private int dDay=1;

    private long d;
    private long t;
    private long r;

    private int resultNumber=0;
    static final  int DATE_DIALOG_ID = 0;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dday_counter);

        ddayText=(TextView)findViewById(R.id.dday);
        todayText=(TextView)findViewById(R.id.today);
        resultText=(TextView)findViewById(R.id.result);
        dateButton=(Button)findViewById(R.id.button);

        dateButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(0);
            }
        });

        Calendar calendar = Calendar.getInstance();
        tYear = calendar.get(Calendar.YEAR);
        tMonth = calendar.get(Calendar.MONTH);
        tDay = calendar.get(Calendar.DAY_OF_MONTH);

        Calendar dCalendar = Calendar.getInstance();
        dCalendar.set(dYear,dMonth,dDay);

        t=calendar.getTimeInMillis();
        d=dCalendar.getTimeInMillis();
        r=(d-t)/(24*60*60*1000);

        resultNumber=(int)r+1;
        updateDisplay();
    }

    private void updateDisplay() {
        todayText.setText(String.format("%d년 %d월 %d일", tYear, tMonth+1, tDay));
        ddayText.setText(String.format("%d년 %d월 %d일", dYear, dMonth+1, dDay));

        if(resultNumber>=0){
            resultText.setText((String.format("D=%d", resultNumber)));
        }
        else{
            int absR=Math.abs(resultNumber);
            resultText.setText(String.format("D+%d", absR));
        }
    }
    private DatePickerDialog.OnDateSetListener dDateSetListener = new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            dYear = year;
            dMonth = month;
            dDay = dayOfMonth;
            final Calendar dCalendar = Calendar.getInstance();
            dCalendar.set(dYear,dMonth,dDay);

            d=dCalendar.getTimeInMillis();
            r=(d-t)/(24*60*60*1000);
            resultNumber=(int)r;
            updateDisplay();
        }
    };
    @Override
    protected Dialog onCreateDialog(int id){
        if(id==DATE_DIALOG_ID){
            return new DatePickerDialog(this,dDateSetListener,tYear,tMonth,tDay);
        }
        return null;
    }
}
