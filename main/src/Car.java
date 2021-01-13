import java.util.Objects;

public class Car {
  private long id;
  private CarType carType;
  private String title;
  private int hoursPower;

  public Car(long id, CarType carType, String title, int hoursPower) {
    this.id = id;
    this.carType = carType;
    this.title = title;
    this.hoursPower = hoursPower;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getHoursPower() {
    return hoursPower;
  }

  public void setHoursPower(int hoursPower) {
    this.hoursPower = hoursPower;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return id == car.id &&
      Objects.equals(title, car.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title);
  }

  @Override
  public String toString() {
    return "Car{" +
      "id=" + id +
      ", carType=" + carType +
      ", title='" + title + '\'' +
      ", hoursPower=" + hoursPower +
      '}';
  }
}
