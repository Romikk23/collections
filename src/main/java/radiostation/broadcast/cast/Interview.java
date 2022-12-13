package radiostation.broadcast.cast;

import radiostation.announcer.Announcer;
import radiostation.broadcast.utils.Duration;

public class Interview extends Cast {
    String guestName;

    public Interview(int durationMinutes, Announcer announcer, String guestName) {
        super.duration = new Duration(durationMinutes, 0);
        super.announcer = announcer;
        super.price = 30; // € per min
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }

    @Override
    public int getIncome() {
        return super.duration.durationMinutes*price;
    }

    @Override
    public String toString() {
        return "   Interview\n" +
                " Announcer: " + super.announcer.getName() + "\n" +
                " Duration: " + super.duration.toString() + "\n" +
                " Guest name: " + guestName + "\n" +
                " Income: " + getIncome() + " €";
    }
}
