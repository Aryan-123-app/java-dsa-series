public class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    Motorcycle(String name , String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("MotorCycle is doing Wheelie: " + name);
    }
}
