
class Vehicle {
    String modelName;
    String colour;
    String fuelType;
    double price;
    
    String getModelName(){
        return modelName;
    }
    void setModelName(String modelName){
        this.modelName = modelName;
    }
    

    String getColour(){
        return colour;
    }
    void setColour(String colour){
        this.colour=colour;
    }

    String getFuelType(){
        return fuelType;
    }
    void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }

    double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }

    Vehicle() {
        this.modelName="not given";
        this.colour="not given";
        this.fuelType="not given";
        this.price=0.0;
    }

    Vehicle(String modelName, String colour, String fuelType, double price){
        this.modelName=modelName;
        this.colour=colour;
        this.fuelType=fuelType;
        this.price=price;
    }

    void display() {
        System.out.println(this.modelName);
        System.out.println(this.colour);
        System.out.println(this.fuelType);
        System.out.println(this.price);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int noOfDoors;
    boolean hasAC;

    int getNoOfDoors() {
        return noOfDoors;
    }
    void setNoOfDoors(int noOfDoors) {
        this.noOfDoors=noOfDoors;
    }

    boolean getHasAC(){
        return hasAC;
    }
    void setHasAC(boolean hasAC){
        this.hasAC=hasAC;
    }

    Car() {
        super();
        this.noOfDoors=0;
        this.hasAC=false;
    }

    Car(String modelName, String colour, String fuelType, double price, int noOfDoors, boolean hasAC) {
        super(modelName, colour, fuelType, price);
        this.noOfDoors = noOfDoors;
        this.hasAC=hasAC;
    }

    void display(){
        super.display();
        System.out.println(this.noOfDoors);
        System.out.println(this.hasAC);
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    String type; // e.g., Sports, Cruiser
    double mileage; // km/l

    String getType(){
        return type;
    }
    void setType(String type){
        this.type=type;
    }

    double getMileage(){
        return mileage;
    }
    void setMileage(double mileage){
        this.mileage=mileage;
    }

    Bike(){
        super();
        this.type="not given";
        this.mileage=0.0;
    }

    Bike(String modelName, String colour, String fuelType, double price, String type, double mileage){
        super(modelName, colour, fuelType, price);
        this.type=type;
        this.mileage=mileage;
    }

    void display(){
        super.display();
        System.out.println(this.type);
        System.out.println(this.mileage);
    }
}

// Demo class
public class VehicleDemo{
    public static void main(String[] args){
        Vehicle v1=new Vehicle();
        v1.display();

        Car c1=new Car("Swift", "Red", "Petrol", 700000.0, 4, true);
        c1.display();

        Bike b1=new Bike("Royal Enfield", "Black", "Petrol", 200000.0, "Cruiser", 35.0);
        b1.display();
    }
}

