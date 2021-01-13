import java.util.EnumSet;

public class Main {

  public static void main(String[] args) {
    EnumSet<County> counties = EnumSet.of(County.UKRAINE, County.SPAIN);

    counties.forEach(county -> System.out.println(county));
  }
}
