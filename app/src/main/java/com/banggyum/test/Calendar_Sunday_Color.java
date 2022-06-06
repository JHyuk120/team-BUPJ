package com.banggyum.test;

import android.graphics.Color;
import android.text.style.ForegroundColorSpan;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import org.threeten.bp.DayOfWeek;

import java.util.Calendar;

public class Calendar_Sunday_Color implements DayViewDecorator {
    private Calendar calendar = Calendar.getInstance();
    private CalendarDay date;

    public Calendar_Sunday_Color() {


    }
    @Override
    public boolean shouldDecorate(CalendarDay day) {

        int weekday = day.getDate().with(DayOfWeek.SUNDAY).getDayOfMonth();
        return weekday == day.getDay();
    }
    @Override
    public void decorate(DayViewFacade view) {

        view.addSpan(new ForegroundColorSpan(Color.RED));
    }

}