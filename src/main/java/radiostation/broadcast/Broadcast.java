package radiostation.broadcast;

import radiostation.announcer.Announcer;
import radiostation.broadcast.cast.Cast;
import radiostation.broadcast.utils.Duration;

import java.util.LinkedList;

public class Broadcast {
    Duration duration;
    LinkedList<Cast> casts;

    public Broadcast(int durationMinutes, int durationSeconds) {
        this.duration = new Duration(durationMinutes, durationSeconds);
        this.casts = new LinkedList<>();
    }

    public boolean addCast(Cast cast) {
        if (castFits(cast) && castNotExceed(cast)) {
            casts.add(cast);
            cast.getAnnouncer().addCast(cast); // костиль, не знаю чи так можна робити о_0 ))
            return true;
        }
        return false;
    }

    public int getIncome() {
//        int income = 0;
//        for (Cast c : casts) {
//            if (c.getPrice() > 0) {
//                income += c.getIncome();
//            }
//        }

        int income = casts.stream().filter((c) -> c.getPrice() > 0).mapToInt(Cast::getIncome).sum();

        return income;
    }

    public String getAllCasts() {
        String allCasts = "";
        for(Cast cast : casts) {
            allCasts += (cast.toString() + "\n\n");
        }
        return allCasts;
    }

    private boolean castFits(Cast cast) {
        return getFreeDuration().fits(cast.getDuration());
    }

    private boolean castNotExceed(Cast cast) {
        if (cast.getPrice() > 0) {
            int allDuration = duration.convertToSeconds();
            int durationIncome = 0;
            int durationCast = cast.getDuration().convertToSeconds();
            for (Cast c : casts) {
                if (c.getPrice() > 0) {
                    durationIncome += c.getDuration().convertToSeconds();
                }
            }
            return durationIncome + durationCast < allDuration / 2;
        }
        return true;

    }

    private Duration getFreeDuration() {
        int seconds = duration.convertToSeconds();
        for (Cast cast : casts) {
            seconds -= cast.getDuration().convertToSeconds();
        }
        return new Duration(0, seconds);
    }

    public Duration getDuration() {
        return duration;
    }

    public LinkedList<Cast> getCasts() {
        return casts;
    }
}
