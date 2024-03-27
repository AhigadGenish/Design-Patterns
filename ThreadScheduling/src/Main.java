import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimerTask ping = new Ping();
        TimerTask pong = new Pong();

        Timer t = new Timer();
        t.scheduleAtFixedRate(ping, 0, 1000);
        t.scheduleAtFixedRate(pong, 500, 1000);

        t.cancel();
    }
}