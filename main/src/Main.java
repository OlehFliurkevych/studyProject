import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Car car1 = new Car(1L, CarType.MINIVAN, "title1", 400);
    Car car2 = new Car(1L, CarType.SEDAN, "title2", 500);

    List<Car> cars = Arrays.asList(car1, car2);

    cars.forEach(car -> System.out.println(car));
  }
}
