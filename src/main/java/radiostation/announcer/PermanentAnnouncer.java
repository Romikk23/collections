package radiostation.announcer;

import radiostation.broadcast.cast.Cast;
import radiostation.broadcast.utils.Duration;

import java.util.ArrayList;

public class PermanentAnnouncer extends Announcer{
    Duration workExperience;

    public PermanentAnnouncer(String name) {
        super.name = name;
        super.castList = new ArrayList<>();
        this.workExperience = new Duration(0, 0);
    }

    @Override
    public void addCast(Cast cast) {
        castList.add(cast);
        workExperience.add(cast.getDuration());
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String toString() {
        return "    Permanent announcer\n" +
                " Name: " + super.name + "\n" +
                " Work exp: " + workExperience + "\n" +
                " CastLists: " + super.getCastListString();
    }
}