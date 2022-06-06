// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface IEngine {
  public void showEngine();
}

interface IWheel {
  public void showWheel();
}

class Engine implements IEngine {
  private String name;
  Engine(String name){
    this.name = name;
  }
  @Override 
  public void showEngine() {
    System.out.println(this.name);
  }
  String getName() {return this.name;}
}


class Wheel implements IWheel {
  private String name;
  Wheel(String name){
    this.name = name;
  }
  @Override 
  public void showWheel() {
    System.out.println(this.name);
  }
  String getName() {return this.name;}
}

class Car {
    private Engine engine;
    private Wheel wheel;
    private String name;
    Car(Engine engine, Wheel wheel, String name){
        this.engine = engine;
        this.wheel = wheel;
        this.name = name;
    }
    public void run () {
        System.out.println(this.name + " is running .....");
    }
    public void showCar(){
        System.out.println(this.engine.getName());
        System.out.println(this.wheel.getName());
    }
}


class Main {
    public static void main(String[] args) {
        Car superCar = new Car(new Engine("super engine"), new Wheel("super wheel"), "Super Car");
        superCar.run();
        superCar.showCar();
    }
}
