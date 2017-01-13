package mytest;


public class BenzCar implements Car, Cloneable{
  
  private String name;
  private AudiCar audiCar;
  
  public BenzCar() {
    this.name = getClass().getName();
    System.out.println(getClass().getName());
    System.out.println(getClass().getSimpleName());
  }

  public AudiCar getAudiCar() {
    return audiCar;
  }
  
  public void setAudiCar(AudiCar audiCar) {
    this.audiCar = audiCar;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void brand() {
    System.out.println("奔驰");
  }

  @Override
  protected BenzCar clone() throws CloneNotSupportedException {
    return (BenzCar) super.clone();
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    BenzCar car = new BenzCar();
    AudiCar audiCar = new AudiCar();
    audiCar.setName("奥迪车");
    car.setName("奔驰车");
    car.setAudiCar(audiCar);
    
    BenzCar newCar = car.clone();
    
    System.out.println(car);
    System.out.println(newCar);
    
    /*if (car.getName() == newCar.getName()) {
      System.out.println("BenzCar.main()");
    }
    car.setName("奔驰车改");
    System.out.println(car.getName());
    System.out.println(newCar.getName());*/
    
    /*if (car.getAudiCar() == newCar.getAudiCar()) {
      System.out.println("BenzCar.main()");
    }
    car.getAudiCar().setName("奥迪改");
    System.out.println(car.getAudiCar().getName());
    System.out.println(newCar.getAudiCar().getName());*/
    
  }
}
