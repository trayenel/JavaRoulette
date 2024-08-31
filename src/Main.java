public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        BinBuilder binBuilder = new BinBuilder();

        binBuilder.GenerateBins(wheel);
    }
}