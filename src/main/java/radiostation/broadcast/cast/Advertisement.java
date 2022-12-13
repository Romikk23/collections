package radiostation.broadcast.cast;

import radiostation.announcer.Announcer;
import radiostation.broadcast.utils.Duration;

public class Advertisement extends Cast {
    String productName;

    public Advertisement(int durationSeconds, Announcer announcer, String productName) {
        super.duration = new Duration(0, durationSeconds);
        super.announcer = announcer;
        super.price = 5; // € per sec
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public int getIncome() {
        return super.duration.durationSeconds*price;
    }

    @Override
    public String toString() {
        return "   Advertisement\n" +
                " Announcer: " + super.announcer.getName() + "\n" +
                " Duration: " + super.duration.toString() + "\n" +
                " Product name: " + productName + "\n" +
                " Income: " + getIncome() + " €";
    }
}
