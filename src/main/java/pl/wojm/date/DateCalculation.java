package pl.wojm.date;

import java.util.Calendar;


public class DateCalculation
{
    int today;
    int tomonth;
    int toyear;

    int daySub;
    int monthSub;
    int yearSub;

    int godziny;
    int minuty;
    int sekundy;

    Calendar cal1 = Calendar.getInstance();


    public void calculate(int day, int month, int year){
    today = cal1.get(Calendar.DAY_OF_MONTH);
    tomonth = cal1.get(Calendar.MONTH);
    toyear = cal1.get(Calendar.YEAR);

    yearSub = toyear - year;
    monthSub = tomonth - month;
    daySub = today - day;

    if (daySub < 0){
        monthSub = monthSub-1;
        daySub = 30+daySub;
    }

    godziny = yearSub*365*30*24 + monthSub*30*24 + daySub*24;
    minuty = yearSub*365*30*24*60 + monthSub*30*24*60 + daySub*24*60;
    sekundy = yearSub*365*30*24*60*60 + monthSub*30*24*60*60 + daySub*24*60*60;
    }

    public DateCalculation(){
    }
}
