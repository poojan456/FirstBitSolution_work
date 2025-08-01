
class MusicInstrument{
    String brand;
    double price;
    String material;
    double weight;

    String getBrand(){
        return brand;
    }
    void setBrand(String brand){
        this.brand=brand;
    }

    double getPrice(){
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }

    String getMaterial(){
        return material;
    }
    void setMaterial(String material){
        this.material=material;
    }

    double getWeight(){
        return weight;
    }
    void setWeight(double weight){
        this.weight=weight;
    }

    MusicInstrument(){
        this.brand="not given";
        this.price=0.0;
        this.material="not given";
        this.weight=0.0;
    }

    MusicInstrument(String brand, double price, String material, double weight){
        this.brand=brand;
        this.price=price;
        this.material=material;
        this.weight=weight;
    }

    void display(){
        System.out.println(this.brand);
        System.out.println(this.price);
        System.out.println(this.material);
        System.out.println(this.weight);
    }
}

// Subclass: Piano
class Piano extends MusicInstrument{
    int noOfKeys;
    boolean hasPedal;

    int getNoOfKeys(){
        return noOfKeys;
    }
    void setNoOfKeys(int noOfKeys){
        this.noOfKeys=noOfKeys;
    }

    boolean getHasPedal(){
        return hasPedal;
    }
    void setHasPedal(boolean hasPedal){
        this.hasPedal=hasPedal;
    }

    Piano(){
        super();
        this.noOfKeys=0;
        this.hasPedal=false;
    }

    Piano(String brand, double price, String material, double weight, int noOfKeys, boolean hasPedal){
        super(brand, price, material, weight);
        this.noOfKeys = noOfKeys;
        this.hasPedal = hasPedal;
    }

    void display(){
        super.display();
        System.out.println(this.noOfKeys);
        System.out.println(this.hasPedal);
    }
}

// Subclass: Guitar
class Guitar extends MusicInstrument{
    int noOfStrings;
    boolean isElectric;

    int getNoOfStrings(){
        return noOfStrings;
    }
    void setNoOfStrings(int noOfStrings){
        this.noOfStrings=noOfStrings;
    }

    boolean getIsElectric(){
        return isElectric;
    }
    void setIsElectric(boolean isElectric){
        this.isElectric=isElectric;
    }

    Guitar(){
        super();
        this.noOfStrings=0;
        this.isElectric=false;
    }

    Guitar(String brand, double price, String material, double weight, int noOfStrings, boolean isElectric){
        super(brand, price, material, weight);
        this.noOfStrings=noOfStrings;
        this.isElectric=isElectric;
    }

    void display(){
        super.display();
        System.out.println(this.noOfStrings);
        System.out.println(this.isElectric);
    }
}

// Subclass: Flute
class Flute extends MusicInstrument{
    double length;
    int noOfHoles;

    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length=length;
    }

    int getNoOfHoles(){
        return noOfHoles;
    }
    void setNoOfHoles(int noOfHoles){
        this.noOfHoles=noOfHoles;
    }

    Flute() {
        super();
        this.length=0.0;
        this.noOfHoles=0;
    }

    Flute(String brand, double price, String material, double weight, double length, int noOfHoles){
        super(brand, price, material, weight);
        this.length=length;
        this.noOfHoles=noOfHoles;
    }

    void display(){
        super.display();
        System.out.println(this.length);
        System.out.println(this.noOfHoles);
    }
}

// Demo class
public class MusicInstrumentDemo{
    public static void main(String[] args) {
        MusicInstrument mi1 = new MusicInstrument();
        mi1.display();

        Piano p1=new Piano("Yamaha", 50000.0, "Wood", 30.0, 88, true);
        p1.display();

        Guitar g1=new Guitar("Fender", 15000.0, "Wood", 5.0, 6, true);
        g1.display();

        Flute f1=new Flute("Bansuri", 2000.0, "Bamboo", 0.3, 60.0, 7);
        f1.display();
    }
}

