package Car;

public class Car {
    private String brand;
    public String engine_sType;


    public Car(String brand, String engine_sType) {
        this.brand = brand;
        this.engine_sType = engine_sType;

    }
    public void Start(){
        System.out.println("start of all systems");
        startElectricity();
        startCommand();
        startFuelSystem();

    }
    private void  startElectricity(){
        System.out.println("starting the electrical system");
    }
    private void  startCommand(){
        System.out.println("action choice");
    }
    private void  startFuelSystem(){
        System.out.println("fuel system start");
    }

}
