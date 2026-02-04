import java.sql.SQLOutput;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args) {
        // Timer = class that schedules tasks periodically
        // useful for sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by Timer
        // need to extend TimerTask class to define required task
        // Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;
            @Override
            public void run() {
                System.out.println("Hi");
                count--;
                if(count==0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0 ,1000);
    }
}
