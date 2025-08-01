
class Device{
    String color;
    String brand;
    int price;
    double weight; // extra
    boolean isPortable; // extra

    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color=color;
    }

    String getBrand(){
        return brand;
    }
    void setBrand(String brand){
        this.brand=brand;
    }

    int getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price=price;
    }

    double getWeight(){
        return weight;
    }
    void setWeight(double weight){
        this.weight=weight;
    }

    boolean getIsPortable(){
        return isPortable;
    }
    void setIsPortable(boolean isPortable){
        this.isPortable=isPortable;
    }

    Device(){
        this.color = "not given";
        this.brand = "not given";
        this.price = 0;
        this.weight = 0.0;
        this.isPortable = false;
    }

    Device(String color, String brand, int price, double weight, boolean isPortable){
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.isPortable = isPortable;
    }

    void display(){
        System.out.println(this.color);
        System.out.println(this.brand);
        System.out.println(this.price);
        System.out.println(this.weight);
        System.out.println(this.isPortable);
    }
}

// Subclass: Laptop
class Laptop extends Device{
    double screenSize;
    boolean hasGraphicCard;

    double getScreenSize(){
        return screenSize;
    }
    void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }

    boolean getHasGraphicCard(){
        return hasGraphicCard;
    }
    void setHasGraphicCard(boolean hasGraphicCard){
        this.hasGraphicCard = hasGraphicCard;
    }

    Laptop(){
        super();
        this.screenSize = 0.0;
        this.hasGraphicCard = false;
    }

    Laptop(String color, String brand, int price, double weight, boolean isPortable, double screenSize, boolean hasGraphicCard){
        super(color, brand, price, weight, isPortable);
        this.screenSize = screenSize;
        this.hasGraphicCard = hasGraphicCard;
    }

    void display(){
        super.display();
        System.out.println(this.screenSize);
        System.out.println(this.hasGraphicCard);
    }
}

// Subclass: Remote
class Remote extends Device{
    String type; // TV, AC, etc.
    boolean isWireless;
    int range; // in meters

    String getType(){
        return type;
    }
    void setType(String type){
        this.type=type;
    }

    boolean getIsWireless(){
        return isWireless;
    }
    void setIsWireless(boolean isWireless){
        this.isWireless=isWireless;
    }

    int getRange(){
        return range;
    }
    void setRange(int range){
        this.range=range;
    }

    Remote(){
        super();
        this.type="not given";
        this.isWireless=false;
        this.range=0;
    }

    Remote(String color, String brand, int price, double weight, boolean isPortable, String type, boolean isWireless, int range){
        super(color, brand, price, weight, isPortable);
        this.type = type;
        this.isWireless = isWireless;
        this.range = range;
    }

    void display(){
        super.display();
        System.out.println(this.type);
        System.out.println(this.isWireless);
        System.out.println(this.range);
    }
}

// Subclass: Mobile
class Mobile extends Device{
    String simType; // Single, Dual
    String networkType; // 4G, 5G

    String getSimType(){
        return simType;
    }
    void setSimType(String simType){
        this.simType=simType;
    }

    String getNetworkType(){
        return networkType;
    }
    void setNetworkType(String networkType){
        this.networkType=networkType;
    }

    Mobile(){
        super();
        this.simType="not given";
        this.networkType="not given";
    }

    Mobile(String color, String brand, int price, double weight, boolean isPortable, String simType, String networkType){
        super(color, brand, price, weight, isPortable);
        this.simType = simType;
        this.networkType = networkType;
    }

    void display(){
        super.display();
        System.out.println(this.simType);
        System.out.println(this.networkType);
    }
}


public class DeviceDemo{
    public static void main(String[] args){
        Device d1 = new Device();
        d1.display();
        Laptop l1 = new Laptop("Silver","HP", 50000,1.8,true, 15.6, true);
        l1.display();

        Remote r1 = new Remote("Black","Sony",500, 0.2, true, "TV", true, 10);
        r1.display();

        Mobile m1 = new Mobile("Blue","Samsung",20000, 0.3, true, "Dual", "5G");
        m1.display();
    }
}

