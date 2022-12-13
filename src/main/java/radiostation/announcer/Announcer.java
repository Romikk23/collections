package radiostation.announcer;

import radiostation.broadcast.cast.Cast;

import java.util.ArrayList;

public class Announcer {
    String name;
    ArrayList<Cast> castList;

    public String getName() {
        return name;
    }

    public void addCast(Cast cast) {
        castList.add(cast);
    }

    String getCastListString() {
        String str = "";
        for(Cast cast : castList) {
            str += cast.getClass().getSimpleName() + ": " + cast.getDuration() + ", ";
        }
        return str;
    }
}
