package mytest;


public class Client {
  public static void main(String[] args) {
    Car aodi = CarFactory.createCar("aodi");
    Car benz = CarFactory.createCar("benz");
    aodi.brand();
    benz.brand();
  }
}
