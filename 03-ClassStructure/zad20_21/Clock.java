public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock(){
       hour = 0;
       minute = 0;
    }
    Clock(int hour, int minute){
       this.hour = hour;
       this.minute = minute;
    }
    void setClock(int hr, int min){
        hour = hr;
        minute = min;
    }
    void setClock(){
        hour = 0;
        minute = 0;
    }
    void setAlarm(int hr, int min){
        alarmHour = hr;
        alarmMinute = min;
    }
    void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    void displayTime(){
        System.out.println("The current time is " + hour + ":" + minute);
    }
    void addOneMinute(){
        minute += 1;
        if(hour == 23 && minute == 60){
            hour = 0;
            minute = 0;
        }
        else if(minute == 60){
            hour += 1;
            minute = 0;
        }
        if(alarmMinute == minute){
            if(alarmHour == hour){
                runAlarm();
            }
        }
        
    }

    public static void main(String[] args){
        Clock clock = new Clock(12,47);
        clock.displayTime();
        clock.setClock(18,14);
        clock.displayTime();
        clock.setClock(9,3);
        clock.displayTime();
        clock.setClock(23,58);
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
    }
}
