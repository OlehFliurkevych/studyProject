import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Car car1 = new Car(1L, CarType.MINIVAN, "title1", 400);
    Car car2 = new Car(1L, CarType.SEDAN, "title2", 500);
    Car car3 = new Car(1L, CarType.SPORTS, "title3", 200);

    List<Car> cars = Arrays.asList(car1, car2, car3);

    cars.forEach(car -> System.out.println(car));
  }
}
