package mytest;


public class CarFactory {
  public static Car createCar(String brand) {
    Car car = null;
    if (brand == "aodi") {
      car = new AudiCar();
    }else if (brand == "benz") {
      car = new BenzCar();
    }
    return car;
  }
}
