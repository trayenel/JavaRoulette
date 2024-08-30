public class Outcome {
    private String name;
    private int odds;

   Outcome(String name, int odds) {
       this.name = name;
       this.odds = odds;
   }

   private float winAmount(float amount) {
       return this.odds * amount;
   }
}
