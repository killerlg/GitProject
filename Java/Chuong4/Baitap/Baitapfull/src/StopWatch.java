import java.util.Date;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch a = new StopWatch();
        a.stop();

        System.out.println(a.startTime.getTime());
        System.out.println(a.endTime.getTime());
    }
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapseTime() {
        Date d2 = new Date();
        long diff = d2.getTime() - this.startTime.getTime();
        return diff;
    }

}
