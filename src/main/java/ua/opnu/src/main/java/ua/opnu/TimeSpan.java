package ua.opnu.src.main.java.ua.opnu;


public class TimeSpan {
    public int hours;
    public int minutes;


    public TimeSpan(int hours, int minutes) {
        if(hours < 0){
            this.hours = 0;
        } else {
            this.hours = hours;
        }
        if(minutes < 0 || minutes > 59){
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int hours, int minutes) {
        if (hours < 0) {
            this.hours = getHours();
        } else if(minutes < 0){
            this.minutes = getMinutes();
        } else if (minutes >= 60) {
            int hoursAdded = minutes / 60;
            this.hours = hours + hoursAdded + getHours();
            this.minutes = (minutes - (hoursAdded * 60)) + getMinutes();
        } else if ((minutes + getMinutes()) >= 60) {
            int hoursAdded = (minutes + getMinutes()) / 60;
            this.hours = hours + hoursAdded + getHours();
            this.minutes = (minutes - (hoursAdded * 60)) + getMinutes();
        } else {
            this.hours = hours + getHours();
            this.minutes = minutes + getMinutes();
        }

    }

    public void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    public double getTotalHours() {
        double minutesDoub = ((double)(getHours()*60) + getMinutes())/60;
        return minutesDoub;
    }

    public int getTotalMinutes() {
        int sumMinutes = (getHours()*60) + getMinutes();
        return sumMinutes;
    }

    public void subtract(TimeSpan span) {
        int timeFirst = (getHours()*60) + getMinutes();
        int timeSecond = (span.getHours()*60) + span.getMinutes();
        if(timeFirst>=timeSecond){
            int result = timeFirst - timeSecond;
            hours = result/60;
            minutes = result%60;
        } else {
            hours = getHours();
            minutes = getMinutes();
        }


    }

    public void scale(int factor) {
        if(factor > 0){
            int minSum = factor*((getHours()*60) + getMinutes());
            hours = minSum/60;
            minutes = minSum%60;
        } else {
            hours = getHours();
            minutes = getMinutes();
        }

    }
}