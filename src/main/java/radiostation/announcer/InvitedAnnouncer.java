package radiostation.announcer;

import radiostation.broadcast.cast.Cast;

import java.util.ArrayList;

public class InvitedAnnouncer extends Announcer{
    String cv;

    public InvitedAnnouncer(String name, String cv) {
        super.name = name;
        super.castList = new ArrayList<>();
        this.cv = cv;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public ArrayList<Cast> getCastList() {
        return super.castList;
    }

    public String getCv() {
        return cv;
    }


    @Override
    public String toString() {
        return "    Invited announcer\n" +
                " Name: " + super.name + "\n" +
                " CV: " + cv + "\n" +
                " CastLists: " + super.getCastListString();
    }


}

