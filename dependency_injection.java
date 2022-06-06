interface Engine {
  public void showEngine();
}

interface Wheel {
  public void showWheel();
}
interface CarBehaviour {
  public void run();
}

abstract class Car{
	protected Engine engine;
  	protected Wheel wheel;
	Car(Engine engine, Wheel wheel){
		this.engine= engine;
    	this.wheel = wheel;
	}
	public abstract void showCarInfo();
}

class Engine1 implements Engine {
  private String name = "Engine 1";
  @Override 
  public void showEngine() {
    System.out.println(this.name);
  }
}


class Wheel1 implements Wheel {
  private String name = "Wheel 1";
  @Override 
  public void showWheel() {
    System.out.println(this.name);
  }
}


class UsedCar extends Car implements CarBehaviour{
  public UsedCar(Engine engine, Wheel wheel){
	super(engine, wheel);
  }
  @Override
  public void run() {
    System.out.println("UsedCar run ...");
  }
  @Override
  public void showCarInfo() {
    this.engine.showEngine();
    this.wheel.showWheel();
  }
}
class SuperCar extends Car implements CarBehaviour{
  public SuperCar(Engine engine, Wheel wheel){
    super(engine, wheel);
  }
  @Override
  public void run() {
      System.out.println("SuperCar run ...");
  }
  @Override
  public void showCarInfo() {
    this.engine.showEngine();
    this.wheel.showWheel();
  }
}

public class Main {  
  public static void main(String args[]) { 
    Engine engine1 = new Engine1();
    Wheel wheel1 = new Wheel1();
    SuperCar superCar = new SuperCar(engine1, wheel1);
    superCar.run();
    superCar.showCarInfo();
  } 
}
