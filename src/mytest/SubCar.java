package mytest;


public class SubCar extends BenzCar{
  public static void main(String[] args) throws CloneNotSupportedException {
    BenzCar car = new BenzCar();
    Car newcar = car.clone();
    newcar.brand();
    System.out.println(car);
    System.out.println(newcar);
    if (car == newcar) {
      System.out.println("BenzCar.main()");
    }
  }
}
