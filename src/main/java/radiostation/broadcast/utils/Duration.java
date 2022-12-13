package radiostation.broadcast.utils;

public class Duration {
    public int durationMinutes;
    public int durationSeconds;


    public Duration(int durationMinutes, int durationSeconds) {
        this.durationMinutes = durationMinutes;
        this.durationSeconds = durationSeconds;

        while (this.durationSeconds >= 60) {
            this.durationMinutes++;
            this.durationSeconds -= 60;
        }
    }

    public void add(Duration durationCast) {
        durationMinutes += durationCast.durationMinutes;
        durationSeconds += durationCast.durationSeconds;
        if(durationSeconds >= 60) {
            durationMinutes++;
            durationSeconds -= 60;
        }
    }

    public int convertToSeconds() {
        return durationMinutes * 60 + durationSeconds;
    }

    public boolean fits(Duration castDuration) {
        return this.convertToSeconds() >= castDuration.convertToSeconds();
    }

    @Override
    public String toString() {
        return durationMinutes + " minutes " + durationSeconds + " seconds";
    }

}
