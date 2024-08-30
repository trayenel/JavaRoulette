public class Main {
    public static void main(String[] args) {
        Outcome five = new Outcome("00-0-1-2-3", 6);
        Bin zero = new Bin(new Outcome[]{new Outcome("0", 35), five});
        Bin zerozero = new Bin(new Outcome[]{new Outcome("00", 35), five});
    }
}