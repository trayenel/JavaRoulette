import java.util.Random;

public class Wheel {
    private Bin[] bins;

    public Wheel() {
        this.bins = new Bin[38];

        for (int i = 0; i < 38; i++) {
            bins[i] = new Bin();
        }
    }

    public void addOutcome(int index, Outcome outcome) {
        this.bins[index].outcomes.add(outcome);
    }

    private int rng() {
        return new Random().nextInt(38);
    }
}
