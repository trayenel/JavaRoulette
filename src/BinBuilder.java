public class BinBuilder {
   public BinBuilder() {};

   public void GenerateBins(Wheel wheel) {
       for (int i = 1; i < 37; i++) {
          wheel.addOutcome(i, new Outcome(String.valueOf(i), 35));
       }
   };
}
