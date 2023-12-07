package week_10.assignment.question_10_01;

public class Time {
    private long hour;
    private long minute;
    private long second;

    Time(){
this(0);
    }
    Time(long elapseTime){
        setTime(elapseTime);
    }

    Time(long hour,long minute,long second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public long getHour(){
        return hour;
    }
    public long getMinute(){
        return minute;
    }
    public long getSecond(){
        return second;
    }
    public void setTime(long elapseTime){
        long currentTimeMillis=System.currentTimeMillis();
        long totalSecond=currentTimeMillis/1000;
        this.second=totalSecond%60;
        long totalMinute=totalSecond/60;
        this.minute=totalMinute%60;
        long totalHours=totalMinute/60;
        this.hour=totalHours%24;


        if (elapseTime > 0) {
            totalSecond = elapseTime / 1000;
            second = totalSecond % 60;
            totalMinute = totalSecond / 60;
            minute = totalMinute % 60;
            totalHours = totalMinute / 60;
            hour = totalHours % 24;
        }

    }

}
