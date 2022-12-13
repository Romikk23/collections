package radiostation.broadcast.cast;

import radiostation.announcer.Announcer;
import radiostation.broadcast.utils.Duration;

public class Song extends Cast {
    String trackAuthor;
    String trackName;

    public Song(int durationMinutes, int durationSeconds, Announcer announcer, String trackAuthor, String trackName) {
        super.duration = new Duration(durationMinutes, durationSeconds);
        super.announcer = announcer;
        super.price = 0; // € per min, but songs are free
        this.trackAuthor = trackAuthor;
        this.trackName = trackName;
    }

    public String getTrackAuthor() {
        return trackAuthor;
    }

    public String getTrackName() {
        return trackName;
    }

    @Override
    public int getIncome() {
        return price;
    }

    @Override
    public String toString() {
        return "   Song\n" +
                " Announcer: " + super.announcer.getName() + "\n" +
                " Duration: " + super.duration.toString() + "\n" +
                " Track author: " + trackAuthor + "\n" +
                " Track name: " + trackName + "\n" +
                " Income: " + getIncome() + " €";
    }
}
