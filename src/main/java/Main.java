import radiostation.Radiostation;
import radiostation.announcer.Announcer;
import radiostation.announcer.InvitedAnnouncer;
import radiostation.announcer.PermanentAnnouncer;
import radiostation.broadcast.Broadcast;
import radiostation.broadcast.cast.Advertisement;
import radiostation.broadcast.cast.Interview;
import radiostation.broadcast.cast.Song;

public class Main {
    public static void main(String[] args) {
        Radiostation radiostation = new Radiostation();

        /* Announcers */
        Announcer announcer_1 = new PermanentAnnouncer("Jonny");
        Announcer announcer_2 = new PermanentAnnouncer("Max");
        Announcer announcer_3 = new InvitedAnnouncer("Cris", "Good worker");
        Announcer announcer_4 = new PermanentAnnouncer("Elon");

        radiostation.addAnnouncer(announcer_1);
        radiostation.addAnnouncer(announcer_2);
        radiostation.addAnnouncer(announcer_3);
        radiostation.addAnnouncer(announcer_4);

        radiostation.addBroadcast(new Broadcast(55, 0));
        radiostation.getBroadcasts().get(0).addCast(new Song(3, 40, announcer_1,"Andrew", "Night of the night"));
        radiostation.getBroadcasts().get(0).addCast(new Song(3, 10, announcer_1,"Lady Gaga", "Love"));
        radiostation.getBroadcasts().get(0).addCast(new Song(4, 56, announcer_1,"Damn", "Flashlight"));
        radiostation.getBroadcasts().get(0).addCast(new Song(2, 00, announcer_1,"Nicky", "Good morning"));
        radiostation.getBroadcasts().get(0).addCast(new Advertisement(15, announcer_2, "BMW"));
        radiostation.getBroadcasts().get(0).addCast(new Advertisement(3, announcer_2, "HouseKeeper"));
        radiostation.getBroadcasts().get(0).addCast(new Song(5, 13, announcer_1,"Losemane", "Garry come on"));
        radiostation.getBroadcasts().get(0).addCast(new Advertisement(5, announcer_1, "Nokia"));
        radiostation.getBroadcasts().get(0).addCast(new Interview(15,announcer_3, "Elon Musk"));
        radiostation.getBroadcasts().get(0).addCast(new Song(40, 0, announcer_1,"BiteBite", "Stand Up"));
        // This song will not be added to broadcast because it over than broadcast duration
        radiostation.getBroadcasts().get(0).addCast(new Interview(15,announcer_3, "Steve Jobs"));
        // The last Interview will not be added to broadcast because it is income cast, and it can't be over than 50 % from all duration

        System.out.println("     Broadcast_1");
        System.out.println("Duration: " + radiostation.getBroadcasts().get(0).getDuration());
        System.out.println("Broadcast_1 income: " + radiostation.getBroadcasts().get(0).getIncome() + " €");
        System.out.println("      All casts\n");
        System.out.println(radiostation.getBroadcasts().get(0).getAllCasts());

        radiostation.addBroadcast(new Broadcast(5, 0));
        radiostation.getBroadcasts().get(1).addCast(new Song(3, 40, announcer_4,"Andrew", "Night of the night"));
        radiostation.getBroadcasts().get(1).addCast(new Song(1, 10, announcer_4,"Lady Gaga", "Love"));

        System.out.println("     Broadcast_2");
        System.out.println("Duration: " + radiostation.getBroadcasts().get(1).getDuration());
        System.out.println("Broadcast_2 income: " + radiostation.getBroadcasts().get(1).getIncome() + " €");
        System.out.println("      All casts\n");
        System.out.println(radiostation.getBroadcasts().get(1).getAllCasts());


        System.out.println("     Announcer info");
        System.out.println(announcer_1+"\n");
        System.out.println(announcer_2+"\n");
        System.out.println(announcer_3+"\n");
        System.out.println(announcer_4+"\n");










    }
}
