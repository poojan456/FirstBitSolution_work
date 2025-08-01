
class Planet{
    int size; // in km diameter
    int distanceFromSun; // in million km
    boolean isOxygenPresent;

    int getSize(){
        return size;
    }
    void setSize(int size){
        this.size=size;
    }

    int getDistanceFromSun(){
        return distanceFromSun;
    }
    void setDistanceFromSun(int distanceFromSun){
        this.distanceFromSun=distanceFromSun;
    }

    boolean getIsOxygenPresent(){
        return isOxygenPresent;
    }
    void setIsOxygenPresent(boolean isOxygenPresent){
        this.isOxygenPresent=isOxygenPresent;
    }

    Planet(){
        this.size=0;
        this.distanceFromSun=0;
        this.isOxygenPresent=false;
    }

    Planet(int size, int distanceFromSun, boolean isOxygenPresent){
        this.size=size;
        this.distanceFromSun=distanceFromSun;
        this.isOxygenPresent=isOxygenPresent;
    }

    void display(){
        System.out.println(this.size);
        System.out.println(this.distanceFromSun);
        System.out.println(this.isOxygenPresent);
    }
}

// Subclass: Earth
class Earth extends Planet{
    boolean hasLife;
    long population;

    boolean getHasLife(){
        return hasLife;
    }
    void setHasLife(boolean hasLife){
        this.hasLife=hasLife;
    }

    long getPopulation(){
        return population;
    }
    void setPopulation(long population){
        this.population=population;
    }

    Earth(){
        super();
        this.hasLife=false;
        this.population=0;
    }

    Earth(int size, int distanceFromSun, boolean isOxygenPresent, boolean hasLife, long population){
        super(size, distanceFromSun, isOxygenPresent);
        this.hasLife=hasLife;
        this.population=population;
    }

    void display(){
        super.display();
        System.out.println(this.hasLife);
        System.out.println(this.population);
    }
}

// Subclass: Mars
class Mars extends Planet{
    boolean isRedPlanet;
    boolean hasWater; // Added one more unique attribute

    boolean getIsRedPlanet(){
        return isRedPlanet;
    }
    void setIsRedPlanet(boolean isRedPlanet){
        this.isRedPlanet=isRedPlanet;
    }

    boolean getHasWater(){
        return hasWater;
    }
    void setHasWater(boolean hasWater){
        this.hasWater=hasWater;
    }

    Mars(){
        super();
        this.isRedPlanet=false;
        this.hasWater=false;
    }

    Mars(int size, int distanceFromSun, boolean isOxygenPresent, boolean isRedPlanet, boolean hasWater){
        super(size, distanceFromSun, isOxygenPresent);
        this.isRedPlanet=isRedPlanet;
        this.hasWater=hasWater;
    }

    void display(){
        super.display();
        System.out.println(this.isRedPlanet);
        System.out.println(this.hasWater);
    }
}


public class PlanetDemo {
    public static void main(String[] args){
        Planet p1 = new Planet();
        p1.display();

        Earth e1 = new Earth(12742, 150, true, true, 8000000000L);
        e1.display();

        Mars m1 = new Mars(6779, 228, false, true, true);
        m1.display();
    }
}

