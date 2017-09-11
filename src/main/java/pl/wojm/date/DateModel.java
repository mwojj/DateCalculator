package pl.wojm.date;



import java.util.Calendar;
import java.util.Date;

public class DateModel {

    private double weight;
    private double height;
  private int year;
  private int month;
  private int day;



    public DateModel(){};

    public DateModel(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
return month;
    }

    public int getYear(){
return year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String dateCalc(int day, int month, int year){
        Date today = new Date();
        DateCalculation dc = new DateCalculation();
        Calendar cal = Calendar.getInstance();
        dc.calculate(day, month, year);
        String dateCalcResult = String.format("Przeżyłeś/aś do dnia dzisiejszego: %d lat %d miesięcy %d dni"  dc.yearSub, dc.monthSub, dc.daySub);

        return dateCalcResult;
    }



    }
