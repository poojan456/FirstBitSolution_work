
class App{
    int size;
    String version;
    boolean isSecure;

    // Getters and Setters
    int getSize() {
        return size;
    }
    void setSize(int size) {
        this.size=size;
    }

    String getVersion(){
        return version;
    }
    void setVersion(String version){
        this.version = version;
    }

    boolean getIsSecure(){
        return isSecure;
    }
    void setIsSecure(boolean isSecure){
        this.isSecure=isSecure;
    }

    // Default constructor
    App() {
        this.size=0;
        this.version="not given";
        this.isSecure=false;
    }

    // Parameterized constructor
    App(int size, String version, boolean isSecure){
        this.size=size;
        this.version=version;
        this.isSecure=isSecure;
    }

    void display(){
        System.out.println(this.size);
        System.out.println(this.version);
        System.out.println(this.isSecure);
    }
}

// Subclass: Truecaller
class Truecaller extends App{
    boolean callerID;
    boolean searchNumber;

    boolean getCallerID(){
        return callerID;
    }
    void setCallerID(boolean callerID){
        this.callerID = callerID;
    }

    boolean getSearchNumber(){
        return searchNumber;
    }
    void setSearchNumber(boolean searchNumber){
        this.searchNumber = searchNumber;
    }

    Truecaller(){
        super();
        this.callerID = false;
        this.searchNumber = false;
    }

    Truecaller(int size, String version, boolean isSecure, boolean callerID, boolean searchNumber){
        super(size, version, isSecure);
        this.callerID = callerID;
        this.searchNumber = searchNumber;
    }

    void display(){
        super.display();
        System.out.println(this.callerID);
        System.out.println(this.searchNumber);
    }
}

// Subclass: Snapchat
class Snapchat extends App{
    int snaps;
    int noOfStreaks;
    boolean isFilterAvailable;

    int getSnaps(){
        return snaps;
    }
    void setSnaps(int snaps){
        this.snaps=snaps;
    }

    int getNoOfStreaks(){
        return noOfStreaks;
    }
    void setNoOfStreaks(int noOfStreaks){
        this.noOfStreaks=noOfStreaks;
    }

    boolean getIsFilterAvailable(){
        return isFilterAvailable;
    }
    void setIsFilterAvailable(boolean isFilterAvailable){
        this.isFilterAvailable = isFilterAvailable;
    }

    Snapchat(){
        super();
        this.snaps=0;
        this.noOfStreaks=0;
        this.isFilterAvailable=false;
    }

    Snapchat(int size, String version, boolean isSecure, int snaps, int noOfStreaks, boolean isFilterAvailable){
        super(size, version, isSecure);
        this.snaps=snaps;
        this.noOfStreaks=noOfStreaks;
        this.isFilterAvailable=isFilterAvailable;
    }

    void display(){
        super.display();
        System.out.println(this.snaps);
        System.out.println(this.noOfStreaks);
        System.out.println(this.isFilterAvailable);
    }
}

// Subclass: LinkedIn
class LinkedIn extends App{
    int jobs;
    int connections;

    int getJobs(){
        return jobs;
    }
    void setJobs(int jobs){
        this.jobs = jobs;
    }

    int getConnections(){
        return connections;
    }
    void setConnections(int connections){
        this.connections=connections;
    }

    LinkedIn(){
        super();
        this.jobs=0;
        this.connections=0;
    }

    LinkedIn(int size, String version, boolean isSecure, int jobs, int connections){
        super(size, version, isSecure);
        this.jobs = jobs;
        this.connections=connections;
    }

    void display(){
        super.display();
        System.out.println(this.jobs);
        System.out.println(this.connections);
    }
}


public class AppDemo{
    public static void main(String[] args){
        App a1 = new App();
        a1.display();

        Truecaller t1 = new Truecaller(50, "12.4.1", true, true, true);
        t1.display();

        Snapchat s1 = new Snapchat(100, "11.10.2", true, 200, 15, true);
        s1.display();

        LinkedIn l1 = new LinkedIn(80, "9.5.3", true, 50, 500);
        l1.display();
    }
}

