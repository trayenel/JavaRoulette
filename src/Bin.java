import java.util.Set;

public class Bin {
   private Set<Outcome> outcomes;

   public Bin(Outcome[] newOutcomes) {
      outcomes = Set.of(newOutcomes);
   }
}
