package radiostation;

import radiostation.announcer.Announcer;
import radiostation.broadcast.Broadcast;

import java.util.ArrayList;

public class Radiostation {
    ArrayList<Broadcast> broadcasts;
    ArrayList<Announcer> announcers;

    public Radiostation() {
        broadcasts = new ArrayList<>();
        announcers = new ArrayList<>();
    }

    public void addBroadcast(Broadcast broadcast) {broadcasts.add(broadcast);}
    public void addAnnouncer(Announcer announcer) {announcers.add(announcer);}

    public ArrayList<Broadcast> getBroadcasts() {return broadcasts;}
    public ArrayList<Announcer> getAnnouncers() {return announcers;}
}
