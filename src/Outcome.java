import java.util.Objects;

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

   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || obj.getClass() != getClass()) return false;

       Outcome outcome = (Outcome) obj;

       return Objects.equals(name, outcome.name) && Objects.equals(odds, outcome.odds);
   }

   public int getHash() {
       return Objects.hash(name, odds);
   }
}
