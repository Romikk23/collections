package radiostation.broadcast.cast;

import radiostation.announcer.Announcer;
import radiostation.broadcast.utils.Duration;

public class Cast {
    Duration duration;
    Announcer announcer;
    int price;

    public Announcer getAnnouncer() {return announcer;}
    public int getIncome(){
        return 0;
    }
    public Duration getDuration() {
        return duration;
    }
    public int getPrice() {
        return price;
    }

    public String toString() {
        return " Announcer: " + announcer.getName() + "\n" +
                " Duration: " + duration.toString();
    }

}
