public class Car extends Vehicle {
    public int noOfDoors;

    public String transmissionType;

    Car(String name,String model,int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model , noOfTyres); // Super should be the first line for the child class constructor
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC(){
        System.out.println("AC started of " + name);
    }
}
